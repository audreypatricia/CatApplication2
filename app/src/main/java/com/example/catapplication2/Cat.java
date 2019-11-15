package com.example.catapplication2;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Cat implements Serializable {

     String name;
     String origin;
     String weight;
     String temperament;
     String life_span;
     String wikipedia_url;
     String description;
     int dog_friendly_level;



    public Cat (String name, String origin, String weight, String temperament, String life_span, String wikipedia_url, String description, int dog_friendly_level){
        this.name = name;
        this.origin=origin;
        this.weight=weight;
        this.temperament = temperament;
        this.description = description;
        this.life_span = life_span;
        this.wikipedia_url = wikipedia_url;
        this.dog_friendly_level = dog_friendly_level;

    }



    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDescription() {
        return description;
    }

    public String getTemperament() {
        return temperament;
    }

    public String getLife_span() {
        return life_span;
    }

    public String getWikipedia_url() {
        return wikipedia_url;
    }

    public String getWeight(){ return weight;}

    public int getDog_friendly_level() {
        return dog_friendly_level;
    }

}
