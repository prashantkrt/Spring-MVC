package com.myLearning.springWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.myLearning.springWeb.controller"})
public class SpringMvc1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMvc1Application.class, args);
	}	
}
