package com.springboot.webapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {
	private TodoService todoService;
	
	//Dependency Injection using constructor
	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}
	public TodoService getTodoService() {
		return todoService;
	}
	public void setTodoService(TodoService todoService) {
		this.todoService = todoService;
	}

	@GetMapping("list-todos")
	public String listTodos(ModelMap model) {
		System.out.println("listTodos_");
		model.put("todos", getTodoService().findByUsername("Rahul"));
		return "listTodos";
	}
}
