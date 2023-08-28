package com.AUth.Security_AUthe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Hellow, Home!";
    }

    @GetMapping("/secured")
    public String scured(){
        return "Hellow, Secured!!";
    }
}
