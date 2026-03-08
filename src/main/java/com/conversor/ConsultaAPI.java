package com.conversor;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {

    private String apiKey = "dc0404bfe8a94d0212646560";

    public String buscarMoneda(String base) throws IOException, InterruptedException {

        String direccion = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + base;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}