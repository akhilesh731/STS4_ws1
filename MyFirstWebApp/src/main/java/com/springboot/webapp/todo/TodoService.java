package com.springboot.webapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todosList = new ArrayList<>();
	
	static {
		todosList.add(new Todo(1, "Rahul", "Learn Docker", LocalDate.now().plusMonths(6), false));
		todosList.add(new Todo(2, "Rahul", "Learn AI", LocalDate.now().plusMonths(8), false));
		todosList.add(new Todo(3, "Rahul", "Learn Python", LocalDate.now().plusMonths(10), false));
	}
	
	public List<Todo> findByUsername(String username){
		return todosList;
	}
}
