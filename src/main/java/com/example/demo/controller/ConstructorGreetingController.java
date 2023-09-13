package com.example.demo.controller;

import com.example.demo.repository.GreetingRepository;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorGreetingController {
    private final GreetingRepository greeting;

    public ConstructorGreetingController(GreetingRepository greeting) {
        this.greeting = greeting;
    }
    public String getGreeting(){
        return greeting.sayGreeting();
    }
}
