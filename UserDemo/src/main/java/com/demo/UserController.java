package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	User user;
	@PostMapping
	public String createUser(@RequestBody User user) {
		return "User: "+user.getName()+", "+user.getEmail();
	}
	//When the request is received, Spring Boot automatically maps the JSON body to the User object 
	//and passes it to the createUser method.
	
	@GetMapping("{name}")
	public User getUser(String name) {
		return user;
	}
}
