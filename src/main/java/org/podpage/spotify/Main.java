package org.podpage.spotify;

import org.podpage.spotify.client.APIClient;
import org.podpage.spotify.client.CallbackType;
import org.podpage.spotify.client.exception.WrongBearerException;
import org.podpage.spotify.model.Test;

/**
 * Created by podpage on 28.03.2017.
 */
public class Main {

    public static void main(String... args) {
        APIClient apiClient = new APIClient("BQ..."); //API TOKEN (your fucking cookie)

        apiClient.registerCallback(CallbackType.WEBSOCKET_CONNECT, bool -> {
            System.out.println("Connected");
        });

        apiClient.registerCallback(CallbackType.TRACK_CHANGE, track -> {
            System.out.println(((Test) track).getPlayer_state().getTrack().getUri());
        });

        apiClient.registerCallback(CallbackType.TRACK_PLAY, track -> {
            System.out.println("Play");
        });

        apiClient.registerCallback(CallbackType.TRACK_PAUSE, track -> {
            System.out.println("Pause");
        });

        apiClient.registerCallback(CallbackType.VOLUME_CHANGE, track -> {
            System.out.println(((Test) track).getDevice_state().getVolume());
        });

        try {
            apiClient.connect();
        } catch (WrongBearerException e) {
            e.printStackTrace();
        }
    }
}