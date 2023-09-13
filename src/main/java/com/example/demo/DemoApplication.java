package com.example.demo;

import com.example.demo.controller.ConstructorGreetingController;
import com.example.demo.controller.PropertyGreetingController;
import com.example.demo.controller.SetterGreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		PropertyGreetingController propertyGreetingController = (PropertyGreetingController) ctx.getBean("propertyGreetingController");
		System.out.println("-------------Pole");
		System.out.println(propertyGreetingController.getGreeting());

		ConstructorGreetingController constructorGreetingController = (ConstructorGreetingController) ctx.getBean("constructorGreetingController");
		System.out.println("-------------Constructor");
		System.out.println(constructorGreetingController.getGreeting());

		SetterGreetingController setterGreetingController = (SetterGreetingController) ctx.getBean("setterGreetingController");
		System.out.println("---------------Setter");
		System.out.println(setterGreetingController.getGreeting());

	}
}
