package com.example.recipes;
import org.springframework.web.client.RestTemplate;


public class RecipeFetcher {
    private String RecipesToGet;
    private String fetchingUrl;

    public RecipeFetcher(String RecipesToGet){
        this.RecipesToGet = RecipesToGet;
        fetchingUrl = getUrl(RecipesToGet);
    }

    private String getUrl(String RecipesParam){
        String apiUrl = "www.themealdb.com/api/json/v1/1/search.php?s="+RecipesParam;
        return apiUrl;
    }

    public String fetchData() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(fetchingUrl, String.class);
        System.out.println(response);
        return response;
    }

}