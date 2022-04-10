package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={
"com.example.services.Bookservice", "com.example.demo.testController"})

@ComponentScan(basePackages={"com.example"})
public class BootdevtApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootdevtApplication.class, args);
	}

}






