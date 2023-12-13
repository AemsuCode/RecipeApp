package com.example.recipes;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RecipeFetcher {
    private String RecipesToGet;
    private String fetchingUrl;

    public RecipeFetcher(){
        this.RecipesToGet = RecipesToGet;
    }
    public Recipes fetchData(String RecipesParam) {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://www.themealdb.com/api/json/v1/1/search.php?s="+RecipesParam;
        Recipes response = restTemplate.getForObject(apiUrl, Recipes.class);
        System.out.println(response);
        return response;
    }


}