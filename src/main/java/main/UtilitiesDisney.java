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
import model.User;
import model.Users;

public class UtilitiesDisney {
    //

    public static CharacterInfo[] personajes;

    public static void LinkAPI() throws Exception {

        //Linkeo la API
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.disneyapi.dev/character"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //Creo objeto GSON
        Gson gson = new Gson();
        Characters disneyCharacters = gson.fromJson(response.body(), Characters.class);
        personajes = disneyCharacters.data;

        System.out.println("Personajes obtenidos de la API: \n");
        for (CharacterInfo p : personajes) {
            System.out.println("Nombre recibido: '" + p.name + "'");
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
    
    
     public static CharacterInfo getCharacterByName(String name){
        if(personajes == null ) return null;
        for(CharacterInfo c : personajes ){
            if(c.getName().equalsIgnoreCase(name)) return c;
        }
        return null;
    }
    //Metodo para guardar usuarios
    public static void UsersJson(Users[] user) throws IOException {

        Users users = new Users();
        users.addUser(new User());
        Gson gson = new Gson();
        FileWriter fw = new FileWriter("usuarios.json");
        gson.toJson(users, fw);
        fw.close();

    }

}
