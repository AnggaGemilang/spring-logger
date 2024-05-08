package com.len.beloggerspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeLoggerSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeLoggerSpringApplication.class, args);

		ExampleService exampleService = new ExampleService();
		// Static
		ExampleService.testMethod();
		exampleService.testMethod2();

		ExampleClass exampleClass = new ExampleClass();
		// Static
		ExampleClass.testMethod();
		exampleClass.testMethod2();

		ExampleController exampleController = new ExampleController();
		// Static
		ExampleController.testMethod();
		exampleController.testMethod2();

	}

}
