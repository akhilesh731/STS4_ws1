package com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.model.Employee;

//@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
