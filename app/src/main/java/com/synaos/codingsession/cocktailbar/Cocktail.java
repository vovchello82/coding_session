package com.synaos.codingsession.cocktailbar;

public class Cocktail {
    private String name;
    private String description;
    private Boolean alcohol;

    public Cocktail(String name, String description, Boolean alcohol) {
        this.setName(name);
        this.setDescription(description);
        this.alcohol = alcohol;
    }

    public Boolean getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Boolean alcohol) {
        this.alcohol = alcohol;
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