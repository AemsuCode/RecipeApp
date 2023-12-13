package com.example.recipes;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Recipes {
    @JsonProperty("meals")
    private List<Recipe> recipesList;
}
