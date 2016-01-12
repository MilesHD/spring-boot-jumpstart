package com.milesdickinson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Enable component-scanning and auto-configuration
@SpringBootApplication
public class ReadingListApplication {

	public static void main(String[] args) {
		// Bootstrap the application
		SpringApplication.run(ReadingListApplication.class, args);
	}
}
