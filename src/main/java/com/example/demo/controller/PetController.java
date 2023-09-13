package com.example.demo.controller;

import com.example.demo.repository.PetRepository;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
private final PetRepository pet;

    public PetController(PetRepository pet) {
        this.pet = pet;
    }
    public String checkPet(){
        return pet.checkPet();
    }
}
