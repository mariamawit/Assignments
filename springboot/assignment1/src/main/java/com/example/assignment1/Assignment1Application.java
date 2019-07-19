package com.example.assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Assignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
	}
	
	@RequestMapping("/name")
	public String bankName() {
		return "Citi Bank";
	}
	
	@RequestMapping("/address")
	public String bankAddress() {
		return "6400 Las Colinas Blvd";
	}

}
