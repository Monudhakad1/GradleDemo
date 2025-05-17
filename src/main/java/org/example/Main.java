package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        OkHttpClient client = new OkHttpClient();
        String url = "https://example.com/";

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                System.out.println("Something went wrong");
            } else {
                System.out.println(response.body().string());  // ✅ correct usage
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
