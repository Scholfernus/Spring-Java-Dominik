package com.example.demo.service;

import com.example.demo.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingRepository {
    @Override
    public String sayGreeting() {
        return "Wstrzykiwanie do pola";
    }
}
