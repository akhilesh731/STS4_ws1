package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	@GetMapping("/home")
	public String home(HttpServletRequest request) {
		HttpSession session = request.getSession();
		System.out.println("this is home() controller_");
		String name = request.getParameter("name");
		System.out.println("Hi "+name);
		session.setAttribute("name", name);
		return "home";
	}
	
	//http://localhost:8080/home1?name=Radha
	@GetMapping("/home1")
	public ModelAndView home1(@RequestParam("name") String myName) {
		System.out.println("this is home1() controller_");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("home1");
		return mv;
	}
	
	@GetMapping("/home2")
	public ModelAndView home2(Student student) {
		System.out.println("this is home2() controller_");
		ModelAndView mv = new ModelAndView();
		student.setId(110);
		student.setName("Naveen");
		student.setCourse("Java language");
		mv.addObject("student", student);
		mv.setViewName("home2");
		return mv;
	}
}
