package com.samevian.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.samevian")
public class SamevianBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamevianBackendApplication.class, args);
	}

}
