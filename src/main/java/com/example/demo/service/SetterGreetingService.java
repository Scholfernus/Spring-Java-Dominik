package com.example.demo.service;

import com.example.demo.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingRepository {
    @Override
    public String sayGreeting() {
        return "Wstrzykiwanie przez setter";
    }
}
