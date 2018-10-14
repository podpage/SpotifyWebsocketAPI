package org.podpage.spotify.client.websocket;

import com.google.gson.*;
import org.java_websocket.client.DefaultSSLWebSocketClientFactory;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_10;
import org.java_websocket.handshake.ServerHandshake;
import org.podpage.spotify.client.APIClient;
import org.podpage.spotify.client.CallbackType;
import org.podpage.spotify.client.exception.WrongBearerException;
import org.podpage.spotify.model.Test;

import javax.net.ssl.SSLContext;
import java.net.URI;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by podpage on 28.03.2017.
 */
public class ClientWebSocket extends WebSocketClient {

    private APIClient apiClient;

    private int volume = -1;
    private String uri = "";

    public ClientWebSocket(URI serverURI, APIClient apiClient) {
        super(serverURI, new Draft_10());

        this.apiClient = apiClient;
        SSLContext sslContext = null;
        try {
            sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, null, null);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        setWebSocketFactory(new DefaultSSLWebSocketClientFactory(sslContext));
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(30000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    send("{\"type\": \"ping\"}");
                }
            }
        }).start();
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        System.out.println("closed with exit code " + code + " additional info: " + reason);
    }

    @Override
    public void onMessage(String message) {
        //System.out.println("received message: " + message); //DEBUG
        JsonObject jsonObject = new JsonParser().parse(message).getAsJsonObject();
        if (jsonObject.has("headers")) {
            JsonObject headers = jsonObject.getAsJsonObject("headers");
            if (headers.has("Spotify-Connection-Id")) {
                String sessionId = jsonObject.get("headers").getAsJsonObject().get("Spotify-Connection-Id").getAsString();
                apiClient.setSessionId(sessionId);
                System.out.println("DeviceID: " + sessionId);
                try {
                    apiClient.subscribeWebsocket();
                } catch (WrongBearerException e) {
                    e.printStackTrace();
                }
            } else {
                if (jsonObject.has("payloads")) {
                    JsonArray payloads = jsonObject.get("payloads").getAsJsonArray();
                    for (JsonElement payloadElement : payloads) {
                        JsonObject payload = payloadElement.getAsJsonObject();
                        Test test = new Gson().fromJson(payload, Test.class);

                        if (test.getPlayer_state().getTrack() != null) {
                            if (!uri.equals(test.getPlayer_state().getTrack().getUri())) {
                                apiClient.call(CallbackType.TRACK_CHANGE, test);
                                uri = test.getPlayer_state().getTrack().getUri();
                            }

                            if (test.getPlayer_state().isIs_paused()) {
                                apiClient.call(CallbackType.TRACK_PAUSE, test);
                            }

                            if (!test.getPlayer_state().isIs_paused()) {
                                apiClient.call(CallbackType.TRACK_PLAY, test);
                            }
                        }

                        if (volume != test.getDevice_state().getSpotifyVolume()) {
                            apiClient.call(CallbackType.VOLUME_CHANGE, test);
                            volume = test.getDevice_state().getSpotifyVolume();
                        }

                        /*if (payload.has("player_state")) {
                            JsonObject player_state = payload.getAsJsonObject("player_state");
                            if (player_state.has("track")) {
                                JsonObject trackJson = player_state.getAsJsonObject("track");
                                SimpleTrack track = new Gson().fromJson(trackJson, SimpleTrack.class);
                                apiClient.call(CallbackType.TRACK_CHANGE, track);
                            }
                        }*/
                    }
                }
            }
        }
    }

    @Override
    public void onError(Exception ex) {
        ex.printStackTrace();
        System.err.println("an error occurred:" + ex);
    }
}