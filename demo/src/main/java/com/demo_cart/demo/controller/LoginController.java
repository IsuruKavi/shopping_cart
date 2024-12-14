package com.demo_cart.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/log-in")
    public String showLoging(){
        return "In login page";
    }
}
