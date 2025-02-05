package com.example.Recipe_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    /* This is a simple endpoint  */
    @GetMapping("/test")
    public String test() {
        return "API is working!";
    }
}
