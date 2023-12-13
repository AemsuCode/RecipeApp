package com.example.recipes;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Recipe {
    @JsonProperty("idMeal")
    private String idMeal;

    @JsonProperty("strMeal")
    private String strMeal;

    @JsonProperty("strDrinkAlternate")
    private String strDrinkAlternate;

    @JsonProperty("strCategory")
    private String strCategory;

    @JsonProperty("strArea")
    private String strArea;

    @JsonProperty("strInstructions")
    private String strInstructions;

    @JsonProperty("strMealThumb")
    private String strMealThumb;

    @JsonProperty("strTags")
    private String strTags;

    @JsonProperty("strYoutube")
    private String strYoutube;

    @JsonProperty("strIngredient1")
    private String strIngredient1;

    @JsonProperty("strIngredient2")
    private String strIngredient2;

    public String getIdMeal() {
        return idMeal;
    }

}