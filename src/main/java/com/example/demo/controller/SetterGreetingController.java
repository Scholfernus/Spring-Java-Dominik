package com.example.demo.controller;

import com.example.demo.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterGreetingController {

    private GreetingRepository greeting;
@Autowired
    public void setGreeting(GreetingRepository greeting) {
        this.greeting = greeting;
    }

    public String getGreeting(){
        return greeting.sayGreeting();
    }

}
