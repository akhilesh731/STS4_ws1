package com.rest.webservices.user;

import java.util.List;

import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserResourceController {
	private UserDaoService service;

	public UserResourceController(UserDaoService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
	}

	//@RequestBody: method parameter of the method should be bound to the body of the web request
	@PostMapping("/user")
	public ResponseEntity<User> createUsers(@RequestBody User user) {
		User savedUser = service.save(user);
		return new ResponseEntity<User>(savedUser,HttpStatus.CREATED);
	}
	
	@GetMapping("/user/{id}")
	public EntityModel<User> retrieveUsers(@PathVariable int id) {
		User user = service.findOne(id);
		if(user == null) {
			throw new UserNotFoundException("User not found with "+id);
		}
		EntityModel<User> entityModel = EntityModel.of(user);
		return entityModel;
	}
}
