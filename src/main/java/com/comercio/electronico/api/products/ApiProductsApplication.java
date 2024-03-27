package com.comercio.electronico.api.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiProductsApplication.class, args);
		System.out.println("Swagger URL: http://localhost:8080/swagger-ui.html");
	    System.out.println("H2 Console URL: http://localhost:8080/h2-console");
	}
}
