package com.backend.service;

import java.util.List;

import com.backend.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(Long id);
}
