package com.example.demo.controller;

import com.example.demo.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyGreetingController {
    @Autowired
    @Qualifier("propertyGreetingService")
    private GreetingRepository greeting;
    public String getGreeting(){
        return greeting.sayGreeting();
    }
}
