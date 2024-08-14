package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repository.MyRepository;

@Service
public class MyService {
	@Autowired
	private final MyRepository myRepository = null;
	
	//Injecting the MyRepository bean into MyService using the @Autowired annotation on the field.
	
//	public MyService(MyRepository myRepository) {
//		this.myRepository = myRepository;
//	}
	
	public String process() {
		return myRepository.getData();
	}
}

/*Define a service class that depends on the repository. 
 *Use the @Autowired annotation to inject the repository.*/