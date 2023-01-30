package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

    @GetMapping("/home")
    public String getHome(){
        return "this is home page";
    }
    @GetMapping("/login")
    public String getLoggedIn(){
        return "this is login page";
    }
    @GetMapping("/register")
    public String getRegistered(){
        return "this is register page";
    }

}
