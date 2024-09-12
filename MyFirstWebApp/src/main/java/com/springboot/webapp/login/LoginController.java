package com.springboot.webapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	@Autowired
	private AuthenticationService authenticationService;
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	public AuthenticationService getAuthenticationService() {
		return authenticationService;
	}

	public void setAuthenticationService(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}

	@GetMapping("/login")
	public String goToLogin(ModelMap model) {
		System.out.println("goToLogin_");
		model.put("errorMessage", "");
		return "login";
	}
	
	@PostMapping("/login")
	public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		//how to bind HTTP request parameters to method parameters
		System.out.println("goToWelcomePage_");
		if(authenticationService.authenticate(name, password)) {
			model.put("name", name);
			//model.put("password", password);
			return "welcome";
		}
		model.put("errorMessage", "Invalid Credentials! Please try again!");
		return "login";
	}
	
}
