package com.trainingapps.cropdeal.cropService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/crop")
public class cropController {

    @GetMapping("/1234")
    public String getCrop(){
        return "this is crop microservices";
    }



}
