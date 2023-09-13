package com.example.demo.config;

import com.example.demo.service.ConstructorGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:config")
public class BeanConfig {
@Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }
}
