package com.developer.SimpleWebApplication.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "Hello people, this is my first web application using Spring Boot!";
    }
}
