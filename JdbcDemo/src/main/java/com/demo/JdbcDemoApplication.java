package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.demo.model.Alien;
import com.demo.repo.AlienRepository;

@SpringBootApplication
public class JdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JdbcDemoApplication.class, args);
		
		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(111);
		alien1.setName("Navin");
		alien1.setTech("Java");
		
		AlienRepository repository = context.getBean(AlienRepository.class);
		repository.save(alien1);
		repository.findAll();
	}

}
