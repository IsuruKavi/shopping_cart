package com.demo_cart.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")

    public String greet(){

        return "welcome to Home!";
    }
}
