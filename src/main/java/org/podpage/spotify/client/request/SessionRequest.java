package org.podpage.spotify.client.request;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.podpage.spotify.client.APIClient;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by podpage on 28.03.2017.
 */
public class SessionRequest {

    public SessionRequest(APIClient apiClient) {
        HttpClient client = new DefaultHttpClient();

        try {
            HttpPost request = new HttpPost("https://gew-spclient.spotify.com/connect-api/v2/state/subscriptions");
            StringEntity params = new StringEntity("{\"connection_id\":\"" + apiClient.getSessionId() + "\",\"enable_discovery\":false,\"name\":\"109beccb5566eecd589f1b7099679e87a34de19a\"}"); // KEINE AHNUNG WO DIE ID NOCHMAL HER KOMMT
            request.addHeader("Content-type", "application/json");
            request.addHeader("Accept", "application/json");
            request.addHeader("Authorization", "Bearer " + apiClient.getAccessToken());
            request.setEntity(params);
            HttpResponse response = client.execute(request);
            Scanner scan = new Scanner(response.getEntity().getContent());
            while (scan.hasNext()) {
                System.out.println(scan.next());
            }
        } catch (Exception ex) {
        } finally {
            client.getConnectionManager().shutdown();
        }

    }
}
