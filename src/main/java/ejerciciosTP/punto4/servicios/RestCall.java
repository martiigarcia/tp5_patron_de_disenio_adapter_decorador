package ejerciciosTP.punto4.servicios;

import java.io.IOException;

import ejerciciosTP.punto4.modelo.RestCallInterface;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class RestCall implements RestCallInterface {

    private String url;
    public RestCall(String url) {
        this.url = url;
    }
    public String run() {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(this.url).build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}