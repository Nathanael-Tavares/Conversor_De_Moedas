package model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyReceiver {


    public Currency receiver(String brlValue,String base,String target) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder()
                .create();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/8924ab24410227cf576bfa89/pair/"+base+"/"+target+"/"+brlValue))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();


        Currency currency = gson.fromJson(json, Currency.class);

        return currency;
    }
}
