package com.example.health_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class health_controller {
    @RequestMapping("/index")
    public String sayhello(){
        return "index";
    }
}
