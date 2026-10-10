package uk.ac.westminster.products_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 5COSC019W Object Oriented Programming - Week 1 starter project.
 *
 * This is the entry point of the Spring Boot application.
 * Run this class (green Run button / Shift+F10) to start the embedded
 * web server on http://localhost:8080
 */

@SpringBootApplication
public class ProductsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsApiApplication.class, args);
	}

}
