package com.example.recipes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class RecipeController {
    private final RecipeFetcher recipeFetcher;

    @Autowired
    public RecipeController(RecipeFetcher recipeFetcher) {
        this.recipeFetcher = recipeFetcher;
    }
    @GetMapping("/get/{recipesParam}")
    Recipes getRecipes(@PathVariable("recipesParam") String recipesParam){
        Recipes test = recipeFetcher.fetchSpecificFood(recipesParam);
        return test;
    }
    @GetMapping("/getFirst/{recipesParam}")
    List<Recipe> getLimitedRecipes(@PathVariable("recipesParam") String recipesParam){
        Recipes recipes = recipeFetcher.fetchSpecificFood(recipesParam);
        List<Recipe> recipeList = recipes.getRecipesList();
        List<Recipe> limitedList = Arrays.asList(recipeList.get(0));
        return limitedList;
    }
}
