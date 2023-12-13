package com.example.recipes;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Recipes {
    @JsonProperty("idMeal")
    private String idMeal;
    @JsonProperty("meals")
    private List<Recipe> recipesList;
}
