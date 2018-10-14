package org.podpage.spotify.client;

import org.podpage.spotify.client.callback.SpotifyCallback;
import org.podpage.spotify.client.exception.WrongBearerException;
import org.podpage.spotify.client.request.SessionRequest;
import org.podpage.spotify.client.websocket.ClientWebSocket;
import org.podpage.spotify.model.Track;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;

/**
 * Created by podpage on 28.03.2017.
 */
public class APIClient {

    private String sessionId;
    private String access_token;
    private ClientWebSocket clientWebSocket;
    private HashMap<CallbackType, SpotifyCallback> callbacks = new HashMap<>();

    public APIClient(String access_token) {
        this.access_token = access_token;
    }

    public void connect() throws WrongBearerException {
        try {
            clientWebSocket = new ClientWebSocket(new URI("wss://gew-dealer.spotify.com/?access_token=" + access_token), this);
            clientWebSocket.connect();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void registerCallback(CallbackType callbackType, SpotifyCallback spotifyCallback) {
        callbacks.put(callbackType, spotifyCallback);
    }

    public void unregisterCallback(CallbackType callbackType) {
        callbacks.remove(callbackType);
    }

    public void subscribeWebsocket() throws WrongBearerException {
        new SessionRequest(this);
        call(CallbackType.WEBSOCKET_CONNECT, true);
    }

    public void call(CallbackType callbackType, Object object) {
        if (callbacks.containsKey(callbackType)) {
            callbacks.get(callbackType).call(object);
        }
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getAccessToken() {
        return access_token;
    }

    public ClientWebSocket getClientWebSocket() {
        return clientWebSocket;
    }
}
