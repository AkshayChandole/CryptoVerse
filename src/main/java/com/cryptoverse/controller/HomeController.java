package com.cryptoverse.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @GetMapping
    public String home() {
        return "Welcome to CryptoVerse";
    }
}
