package com.synaos.codingsession.cocktailbar;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class CocktailBar {
    private final Set<Cocktail> cocktails = new HashSet<>();

    @PostConstruct
    public void init() {
        cocktails.add(new Cocktail("sweet cocktail", "very sweet and tasty", Boolean.FALSE));
        cocktails.add(new Cocktail("whisky&cola", "wisky 2ml with 7ml Cola", Boolean.TRUE));
        cocktails.add(new Cocktail("water", "just water", Boolean.FALSE));
    }

    public void addCocktail(Cocktail cocktail) {
        this.cocktails.add(cocktail);
    }

    public Collection<Cocktail> getCocktails() {
        return cocktails;
    }
}