package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.MyService;

@RestController
public class MyController {
	@Autowired
	private final MyService myService = null;
	
	
//	public MyController(MyService myService) {
//		this.myService = myService;
//	}
	
	@GetMapping("/data")
	public String getData() {
		return myService.process();
	}
}
