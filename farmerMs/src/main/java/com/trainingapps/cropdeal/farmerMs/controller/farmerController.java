package com.trainingapps.cropdeal.farmerMs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/farmers")
public class farmerController {
    @GetMapping("/registerfarmer")
    public String registerFarmer() {
        return "Hello World 1";
    }
}
