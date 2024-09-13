package com.springboot.webapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todosList = new ArrayList<>();
	
	private static int todoCount = 0;
	
	static {
		todosList.add(new Todo(++todoCount, "Rahul", "Learn Docker", LocalDate.now().plusMonths(6), false));
		todosList.add(new Todo(++todoCount, "Rahul", "Learn AI", LocalDate.now().plusMonths(8), false));
		todosList.add(new Todo(++todoCount, "Rahul", "Learn Python", LocalDate.now().plusMonths(10), false));
	}
	
	public List<Todo> findByUsername(String username){
		return todosList;
	}
	
	public void addTodo(String name, String description, LocalDate targetDate, boolean done) {
		todosList.add(new Todo(++todoCount, name, description, targetDate, done));
	}
	
	public void deleteTodo(int id) {
		//todosList.remove(id);
		Predicate<Todo> predicate = todo -> todo.getId() == id;
		todosList.removeIf(predicate);
	}
}