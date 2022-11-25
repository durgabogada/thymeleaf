package com.example.demo.model;

public class City {
    private String name;
    private String location;
    private String imageUrl;

    public City(String name, String location, String imageUrl) {
        super();
        this.name= name;
        this.location = location;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
   

}