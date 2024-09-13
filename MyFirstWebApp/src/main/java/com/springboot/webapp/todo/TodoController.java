package com.springboot.webapp.todo;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("add-todo")
	public String showNewTodoPage() {
		System.out.println("showNewTodoPage_");
		return "todo";
	}
	
	@PostMapping("add-todo")
	public String addNewTodo(@RequestParam String description, ModelMap modelMap) {
		System.out.println("addNewTodo_");
		todoService.addTodo((String)modelMap.get("name"), description, LocalDate.now().plusMonths(11), false);
		return "redirect:list-todos";
	}
}
