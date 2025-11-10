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
    public List<String> tvShow;
    public List<String> videogames;
    public List<String> parkAtractions;
    public List<String> allies;
    public List<String> enemies;


    public CharacterInfo(String _id, String name, List<String> films, List<String> shortFilms, List<String> tvShow, List<String> videogames, List<String> parkAtractions, List<String> allies, List<String> enemies) {
        this._id = _id;
        this.name = name;
        this.films = films;
        this.shortFilms = shortFilms;
        this.tvShow = tvShow;
        this.videogames = videogames;
        this.parkAtractions = parkAtractions;
        this.allies = allies;
        this.enemies = enemies;
    }

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

    public List<String> getTvShow() {
        return tvShow;
    }

    public void setTvShow(List<String> tvShow) {
        this.tvShow = tvShow;
    }

    public List<String> getVideogames() {
        return videogames;
    }

    public void setVideogames(List<String> videogames) {
        this.videogames = videogames;
    }

    public List<String> getParkAtractions() {
        return parkAtractions;
    }

    public void setParkAtractions(List<String> parkAtractions) {
        this.parkAtractions = parkAtractions;
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
 
}

