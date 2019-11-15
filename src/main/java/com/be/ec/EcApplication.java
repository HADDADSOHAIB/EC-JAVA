package com.be.ec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class EcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcApplication.class, args);
	}

}
