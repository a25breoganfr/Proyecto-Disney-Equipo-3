/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author dam2_alu25@inf.ald
 */
public class CharacterInfo {
    
    public String _id;
    public String name;
    public List<String> films;
    public List<String> shortFilms;
    public List<String> tvShows;
    public List<String> videoGames;
    public List<String> parkAttractions;
    public List<String> allies;
    public List<String> enemies;
    public String imageUrl;

    public CharacterInfo() {}

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    public List<String> getShortFilms() {
        return shortFilms;
    }

    public void setShortFilms(List<String> shortFilms) {
        this.shortFilms = shortFilms;
    }

    public List<String> getTvShows() {
        return tvShows;
    }

    public void setTvShows(List<String> tvShows) {
        this.tvShows = tvShows;
    }

    public List<String> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<String> videoGames) {
        this.videoGames = videoGames;
    }

    public List<String> getParkAttractions() {
        return parkAttractions;
    }

    public void setParkAttractions(List<String> parkAttractions) {
        this.parkAttractions = parkAttractions;
    }

    public List<String> getAllies() {
        return allies;
    }

    public void setAllies(List<String> allies) {
        this.allies = allies;
    }

    public List<String> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<String> enemies) {
        this.enemies = enemies;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}



