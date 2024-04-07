package com.comercio.electronico.api.products;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiProductsApplication {

	 private static final Logger log = LogManager.getLogger(ApiProductsApplication.class);
	 
	public static void main(String[] args) {
		SpringApplication.run(ApiProductsApplication.class, args);
		log.info("Swagger URL: http://localhost:8080/swagger-ui.html");
		log.info("H2 Console URL: http://localhost:8080/h2-console");
	}
}
