package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome to Spring Boot REST API";
    }

    @GetMapping("/about")
    public String about(){
        return "This is about the project api";
    }
}
