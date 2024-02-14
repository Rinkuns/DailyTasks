package com.example.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class UserRegistrationAndLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationAndLoginApplication.class, args);
	}

}
