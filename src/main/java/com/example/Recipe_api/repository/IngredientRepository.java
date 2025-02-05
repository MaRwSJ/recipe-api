package com.example.Recipe_api.repository;

import com.example.Recipe_api.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Recipe_api.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface IngredientRepository extends JpaRepository<Ingredient, UUID> {
}
