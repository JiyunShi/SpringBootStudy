package com.joeys.boot.essentials.initialbootapp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BootAppController{

    @GetMapping("/greeting")
    public String getGreeting(){
        return "Hello world from API";
    }


}
