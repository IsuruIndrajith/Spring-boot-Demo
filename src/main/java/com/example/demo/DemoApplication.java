package com.example.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	public ModelMapper modelMapper(){
//		DTO eka Entity valata map kranna thamai, ModelMapper oni venne
	return new ModelMapper();
//	ModelMapper ekak, project ekata da gatta, pavichchi kranna
	}
}
