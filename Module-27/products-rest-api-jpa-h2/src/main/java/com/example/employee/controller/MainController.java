package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/")
    public String welcomeMessage(){
        return "Welcome to Spring Boot REST API";
    }

    @GetMapping("/app-info")
    public String appInfo(){
        return "App Name: "+appName + ", App Version: "+ appVersion;
    }
}
