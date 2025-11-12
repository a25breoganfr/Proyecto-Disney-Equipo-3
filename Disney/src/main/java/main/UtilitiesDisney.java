/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author dam2_alu25@inf.ald
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileWriter;
import java.io.IOException;
import model.CharacterInfo;
import model.Characters;

public class UtilitiesDisney {

    public static void LinkAPI() throws Exception {

      /*  HttpClient client = HttpClient.newHttpClient();
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

        
        */
      
        //Linkeo la API
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.disneyapi.dev/character"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //Creo objeto GSON
        Gson gson = new Gson();
        Characters disneyCharacters = gson.fromJson(response.body(), Characters.class);
        CharacterInfo[] personajes = disneyCharacters.data;

        //Imprimo la informacion de los personajes
        System.out.println("Personajes obtenidos de la API: \n");
        for (CharacterInfo p : personajes) {
            System.out.println("ID: " + p._id);
            System.out.println("Nombre: " + p.name);
            System.out.println("Peliculas: " + p.films);
            System.out.println("Cortos: " + p.shortFilms);
            System.out.println("Series: " + p.tvShow);
            System.out.println("Juegos: " + p.videogames);
            System.out.println("Atracciones: " + p.parkAtractions);
            System.out.println("Aliados: " + p.allies);
            System.out.println("Enemigos: " + p.enemies);
            
        }

        //Guardo los personajes
        saveInfo(personajes);

    }
	//Metodo para guardar personajes
    private static void saveInfo(CharacterInfo[] personajes) throws IOException {

        Gson gson = new Gson();
               
        //Creo el archivo personajesDisney.json y escribo el contenido
        FileWriter fw = new FileWriter("personajesDisney.json");
        gson.toJson(personajes, fw);
        fw.close();

        System.out.println("Archivo guardado");

      
    }

}
