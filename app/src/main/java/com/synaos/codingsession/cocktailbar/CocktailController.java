package com.synaos.codingsession.cocktailbar;

import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/cocktails")
public class CocktailController {

    @Autowired
    private CocktailBar cocktailBar;

    @Autowired
    private Printer printer;

    @GetMapping(produces = "application/json")
    public Collection<Cocktail> listCocktails() {
        return cocktailBar.getCocktails();
    }

    @GetMapping(value = "/print")
    public String printCocktails() {
        return printer.print(cocktailBar.getCocktails());
    }

    @PostMapping(consumes = "application/json")
    public void addCocktail(@RequestBody Cocktail cocktail) {
        System.out.print("add new cocktail: " + cocktail.getName());
        cocktailBar.addCocktail(cocktail);
    }

}