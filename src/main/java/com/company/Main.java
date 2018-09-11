package com.company;

import okhttp3.OkHttpClient;
import okhttp3.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://34.249.114.92:9191/app/refresh")
                .get()
                .addHeader("Authorization", "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0YXBwIiwiYXVkaWVuY2UiOiJ3ZWIiLCJjcmVhdGVkIjoxNTM2NjU5MzUzMjE3LCJhcHBJZCI6IjU5ZWI4MDFhOTk5N2M3MTI4NGU1NjUxMSIsImF1dGhUeXBlIjoiQVBQIiwiZXhwIjoxNTM3MjY0MTUzLCJhdXRob3JpdGllcyI6W3siYXV0aG9yaXR5IjoiUk9MRV9BRE1JTiJ9LHsiYXV0aG9yaXR5IjoiUk9MRV9DT01NT04ifV19.DUcBOzJ3lct4vloo6O7Ymdmmd_4ZzPZDB10vEWAXVASdFHEjxNZQ6ZTZNBvO8WQ-zr2wTXBhyNk-RqVq3ZoqWg")
                .addHeader("Cache-Control", "no-cache")
                .addHeader("Postman-Token", "454048c1-9b9b-42bd-9519-95d5f6834e51")
                .build();

        //Response response =

        try {
            Response response = client.newCall(request).execute();
            System.out.print(response);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
