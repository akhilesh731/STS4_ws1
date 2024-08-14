package com.demo.repository;

import org.springframework.stereotype.Component;

@Component
public class MyRepositoryImpl implements MyRepository{

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return "Hello from the repository!";
	}

}
