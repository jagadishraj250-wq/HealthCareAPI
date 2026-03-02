package com.HealthCare.HealthCareAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/status")
    public String projectStatus() {
        return "Smart Healthcare API Project is Running Successfully!";
    }
}