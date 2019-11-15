package com.example.catapplication2;

public class AddToFav {

    private String catNameFav;
    private String catOriginFav;

    public AddToFav(String catNameFav, String catOriginFav){
        this.catNameFav = catNameFav;
        this.catOriginFav = catOriginFav;
    }

    public String getCatNameFav() {
        return catNameFav;
    }

    public String getCatOriginFav() {
        return catOriginFav;
    }
}
