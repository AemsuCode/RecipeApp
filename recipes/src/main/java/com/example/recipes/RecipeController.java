package com.example.recipes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RecipeController {
    private final RecipeFetcher recipeFetcher;

    @Autowired
    public RecipeController(RecipeFetcher recipeFetcher) {
        this.recipeFetcher = recipeFetcher;
    }
    @GetMapping("/get/{recipesParam}")
    Recipes getRecipes(@PathVariable("recipesParam") String recipesParam){
        Recipes test = recipeFetcher.fetchData(recipesParam);
        return test;
    }
    @GetMapping("/limitedGet")
    Recipes getLimitedRecipes(@PathVariable("recipesParam") String recipesParam){
        Recipes test = recipeFetcher.fetchData(recipesParam);
        return test;
    }
}
