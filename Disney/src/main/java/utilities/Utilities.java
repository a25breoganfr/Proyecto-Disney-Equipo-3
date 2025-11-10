/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author nerea
 */
public class Utilities {
     public static void LinkAPI() throws Exception {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.disneyapi.dev/character"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();

        JsonArray dataArray = json.getAsJsonArray("data");
        
        for(int i = 0; i<49; i++){
            JsonObject firstCharacter = dataArray.get(i).getAsJsonObject();
            System.out.println("🔹 ID: " + firstCharacter.get("_id").getAsString());
        }
     }
}
