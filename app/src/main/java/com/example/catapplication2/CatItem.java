package com.example.catapplication2;

import com.android.volley.toolbox.StringRequest;

import java.io.Serializable;

public class CatItem implements Serializable {

    private String breedID;
    private int imageResource;
    private String catName;
    private String catOrigin;
    private String description;
    private String temperament;
    private String life_span;
    private String wikipedia_url;
    private int dog_friendliness_level;



    public CatItem (String breedId, int imageResource, String catName, String catOrigin, String description, String temperament, String life_span, String wikipedia_url, int dog_friendliness_level){
        this.breedID = breedId;
        this.catName=catName;
        this.imageResource =imageResource;
        this.catOrigin=catOrigin;
        this.description = description;
        this.temperament = temperament;
        this.life_span = life_span;
        this.wikipedia_url = wikipedia_url;
        this.dog_friendliness_level = dog_friendliness_level;

    }

    public CatItem (String catName, String catOrigin){
        this.catName = catName;
        this.catOrigin = catOrigin;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getCatName() {
        return catName;
    }

    public String getCatOrigin() {
        return catOrigin;
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

    public int getDog_friendliness_level() {
        return dog_friendliness_level;
    }

    public String breedId(){
        return breedID;
    }
}
