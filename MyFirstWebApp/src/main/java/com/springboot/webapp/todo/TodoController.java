package com.springboot.webapp.todo;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

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
	public String showNewTodoPage(ModelMap model) {
		System.out.println("showNewTodoPage_");
		Todo todo = new Todo();
		model.put("todo", todo);
		return "todo";
	}
	
	@PostMapping("add-todo")
	public String addNewTodo(ModelMap modelMap, @Valid Todo todo, BindingResult result) {
		System.out.println("addNewTodo_");
		if(result.hasErrors()) {
			System.out.println(result);
			return "todo";
		}
		todoService.addTodo((String)modelMap.get("name"), todo.getDescription(), LocalDate.now().plusMonths(11), false);
		return "redirect:list-todos";
	}
	
	@GetMapping("delete-todo")
	public String deleteTodo(@RequestParam int id) {
		System.out.println("deleteTodo_");
		todoService.deleteTodo(id);
		System.out.println("Todo deleted! "+id);
		return "redirect:list-todos";
	}
}
