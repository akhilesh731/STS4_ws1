package com.springboot.webapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		boolean isValidName = username.equalsIgnoreCase("Rahul");
		boolean isValidPassword = password.equalsIgnoreCase("1234");
		return isValidName && isValidPassword;
	}
}
