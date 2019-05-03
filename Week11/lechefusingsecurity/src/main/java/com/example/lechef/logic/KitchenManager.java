package com.example.lechef.logic;

import com.example.lechef.configuration.RestTemplateConfiguration;
import com.example.lechef.persistence.Recipe;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class KitchenManager {

  private RestTemplateConfiguration restTemplate;

  @Value("${recipes.url}")
  private String url;

  public Recipe saveRecipe(Recipe newRecipe) {
    return restTemplate.postForObject(url, newRecipe);
  }
}
