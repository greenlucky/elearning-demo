package com.devopslam.accountservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${spring.profiles.active}")
    private String zone;

    @GetMapping("/")
    public String index() {
        return zone;
    }

}
