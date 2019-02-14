package com.example.cindylou.bitsandpizzas;

public class Pizza {

    private String name; //each pizza has a name and image resource Id. Image resource ID refers to drink images we added to project
    private int imageResourceId;

    public static final Pizza[] pizzas = {
            new Pizza ("Diavolo", R.drawable.diavolo),
            new Pizza ("Funghi", R.drawable.funghi),
    };

    private Pizza(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;

    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

}
