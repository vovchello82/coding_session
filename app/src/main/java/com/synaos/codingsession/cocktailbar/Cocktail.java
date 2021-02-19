package com.synaos.codingsession.cocktailbar;

public class Cocktail {
    private String name;
    private String description;

    public Cocktail(String name, String description) {
        this.setName(name);
        this.setDescription(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}