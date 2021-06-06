package com.directmedia.onlinestore.core.entity;

public class Artist {
    private String name;

    ////////////////Constructeurs/////////////////////
    public Artist(String name) {
        this.name = name;
    }
    public Artist() {
    }


    ////////////////Getters/Setters/////////////////////
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
