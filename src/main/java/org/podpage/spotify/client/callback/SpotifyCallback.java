package org.podpage.spotify.client.callback;

public interface SpotifyCallback<T> {
    void call(T type);
}
