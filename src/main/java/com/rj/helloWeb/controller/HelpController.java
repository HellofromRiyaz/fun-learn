package com.rj.helloWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelpController {

    @RequestMapping("/help")
    public String helpPage()
    {
        System.out.println("Help-Page");
        return "Help-Page";
    }
}

