package com.gaurav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.pack","com.gaurav","com.gaurav.test"}) // Scan the inside and outside  package 
public class Springboot2minApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2minApplication.class, args);
	}

}
