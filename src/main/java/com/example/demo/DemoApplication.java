package com.example.demo;

import com.example.demo.controller.ConstructorGreetingController;
import com.example.demo.controller.PetController;
import com.example.demo.controller.PropertyGreetingController;
import com.example.demo.controller.SetterGreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo","pl.ex.exampleScan"})
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		PropertyGreetingController propertyGreetingController = (PropertyGreetingController) context.getBean("propertyGreetingController");
		System.out.println("-------------Pole");
		System.out.println(propertyGreetingController.getGreeting());

		ConstructorGreetingController constructorGreetingController = (ConstructorGreetingController) context.getBean("constructorGreetingController");
		System.out.println("-------------Constructor");
		System.out.println(constructorGreetingController.getGreeting());

		SetterGreetingController setterGreetingController = (SetterGreetingController) context.getBean("setterGreetingController");
		System.out.println("---------------Setter");
		System.out.println(setterGreetingController.getGreeting());

		PetController petController = (PetController) context.getBean("petController");
		System.out.println("-------------Pet");
		System.out.println(petController.checkPet());

	}
}
