package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
 
	EmployeeService es = new EmployeeService();
	
	@PostMapping("addEmp")
	String addEmployee(@RequestBody Employee employee)
	{		 
		return es.saveEmployee(employee);
	}
	
	
	@GetMapping("getEmp")
	Employee getEmployee()
	{
		return es.getEmployee();
	}
	
}
