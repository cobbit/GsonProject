package jsonResponce;


/**
 * Created by INTEX on 22-04-2017.
 */

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Okhttp {
    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException {
        Okhttp example = new Okhttp();
        String response = example.run("http://ruuhparv.com/webservices/list.php");
        System.out.println(response);
    }
}
