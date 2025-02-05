package com.example.Recipe_api.repository;

import com.example.Recipe_api.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//This is the repository interface
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
