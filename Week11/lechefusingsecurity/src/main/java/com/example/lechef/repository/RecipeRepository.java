package com.example.lechef.repository;

import com.example.lechef.persistence.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long>  {

}
