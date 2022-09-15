package com.example.wiprocaching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class WiprocachingApplication {

	public static void main(String[] args) {
		SpringApplication.run(WiprocachingApplication.class, args);
	}

}
