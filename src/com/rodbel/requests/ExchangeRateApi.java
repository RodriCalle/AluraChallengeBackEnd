package com.rodbel.requests;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rodbel.models.ConversionDataRequest;
import com.rodbel.models.ConversionResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateApi {


    public ConversionResponse getConversion(ConversionDataRequest conversionData) {
        String url = "https://v6.exchangerate-api.com/v6/f9ab5bbbb4e60ee40bd29cc9/pair/" +
                conversionData.getCurrencyFrom() + "/"
                + conversionData.getCurrencyTo() + "/" +
                conversionData.getAmount();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

        return gson.fromJson(response.body(), ConversionResponse.class);
    }
}
