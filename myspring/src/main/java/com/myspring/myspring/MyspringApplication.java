package com.myspring.myspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MyspringApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyspringApplication.class, args);
	}
	@GetMapping("/")
	public String hello() {
		return "service is up and running";
	}

}
