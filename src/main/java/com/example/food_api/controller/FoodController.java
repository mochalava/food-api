package com.example.food_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class FoodController {

    private static final String[] FOODS = { "Pizza", "Hamburger", "Padthai" };

    @GetMapping("/foods")
    public String[] get() {

        // 1.TRACE => 2.DEBUG => 3.INFO => 4.WARN => 5.ERROR

        log.trace("[TRACE] /foods is called.");
        log.debug("[DEBUG] /foods is called.");
        log.info("[INFO] /foods is called.");
        log.error("[ERROR] /foods is called.");
        log.warn("[WARN] /foods is called.");

        return FOODS;
    }
}