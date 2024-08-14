package com.web.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@GetMapping("/home")
	public ModelAndView home(String name, HttpSession session) {
		System.out.println("home()");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.setViewName("home");
		return mv;
	}
}

//http://localhost:8080/home?name=Navin

//http://localhost:8080/actuator/info
//http://localhost:8080/actuator/health