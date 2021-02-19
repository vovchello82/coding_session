package com.synaos.codingsession.cocktailbar;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class CocktailBar {
    private final Set<Cocktail> cocktails = new HashSet<>();

    public void addCocktail(Cocktail cocktail) {
        this.cocktails.add(cocktail);
    }

    public Collection<Cocktail> getCocktails() {
        return cocktails;
    }
}