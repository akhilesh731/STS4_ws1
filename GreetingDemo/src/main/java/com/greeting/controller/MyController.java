package com.greeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greeting.entity.Greeting;

@RestController
public class MyController {
	
	@GetMapping("/greeting")
	public Greeting greeting() {
		return new Greeting("Hello Greeting!");
	}
	
}
