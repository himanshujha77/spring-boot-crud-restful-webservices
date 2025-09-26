package org.him.spring_boot_crud_restful_webservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // Combines @Configuration, @EnableAutoConfiguration, and @ComponentScan
public class SpringBootCrudRestfulWebservicesApplication {

	// Main method: entry point of the Spring Boot application
	public static void main(String[] args) {
		// Bootstraps the application, starts Spring context and embedded server
		SpringApplication.run(SpringBootCrudRestfulWebservicesApplication.class, args);
	}
}
