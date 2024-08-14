package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutowiredDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutowiredDemoApplication.class, args);
	}
}

/* Running the Application
1. When you run the application (DemoApplication.main), Spring Boot will:

2. Scan for components (@SpringBootApplication).
3. Create beans for MyRepositoryImpl (annotated with @Component), MyService (annotated with @Service), 
   and MyController (annotated with @RestController).
4. Inject the MyRepositoryImpl bean into the MyService bean using the @Autowired annotation on the constructor.
5. Inject the MyService bean into the MyController bean using the @Autowired annotation on the constructor.
6. When you access the /data end-point, the MyController will call the process method of MyService, 
   which in turn calls the getData method of MyRepositoryImpl.
*/