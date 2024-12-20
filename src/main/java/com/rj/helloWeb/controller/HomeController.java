package com.rj.helloWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet()
    {
        System.out.println("Home-Page");
        return "Home-Page";
    }
}
