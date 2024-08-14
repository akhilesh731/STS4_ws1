package com.jpa.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jpa.demo.dao.AlienRepo;
import com.jpa.demo.model.Alien;

@Controller
public class AlienController {
	@Autowired
	private AlienRepo repo;
	
	@GetMapping("/home")
	//@ResponseBody
	public String home() {
		System.out.println("home()");
		return "home.jsp";
	}
	
	@GetMapping("/addAlien")
	public String addAlien(Alien alien) {
		System.out.println("addAlien()");
		repo.save(alien);
		return "home.jsp";
	}
	
	@GetMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam Integer id) {
		//Annotation which indicates that a method parameter should be bound to a web request parameter. 
		System.out.println("getAlien()");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("show.jsp");
		Optional<Alien> optional = repo.findById(id);
		Alien alien = optional.get();
		mv.addObject(alien);
		
		//List<Alien> list = repo.findByTech("Java");
		//System.out.println(list);
		return mv;
	}
	
	@GetMapping("/alien/{id}")
	@ResponseBody //{data in format}
	public Optional<Alien> getAlienById(@PathVariable int id){
		System.out.println("getAlienById()");
		//Annotation which indicates that a method parameter should be bound to a URI template variable. 
		Optional<Alien> optional = repo.findById(id); 
		return optional;
	}
}
