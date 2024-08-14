package com.rest.webservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	private static int userId=0;
	static {
		users.add(new User(++userId, "Ajay", LocalDate.now().minusYears(20)));
		users.add(new User(++userId, "Vishal", LocalDate.now().minusYears(22)));
		users.add(new User(++userId, "Deepak", LocalDate.now().minusYears(24)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		user.setId(++userId);
		users.add(user);
		return user;
	}
	
	public User findOne(Integer id) {
		Predicate<User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
	}
}
