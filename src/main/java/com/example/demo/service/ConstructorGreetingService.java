package com.example.demo.service;

import com.example.demo.repository.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class ConstructorGreetingService implements GreetingRepository {
    @Override
    public String sayGreeting() {
        return "Wstrzykiwanie poprzez konstruktor";
    }
}
