package com.example.demo.service;

import com.example.demo.entity.Employee;

public class EmployeeService {

	public String saveEmployee(Employee employee)
	{
		return "Employee is saved in DataBase";
	}
	
	public Employee getEmployee()
	{
		Employee e1 = new Employee();
		e1.seteName("Komal");
		e1.seteAddress("Pune");
		e1.seteDepart("IT");
		e1.seteId(4040);
		e1.setEmobNo(727622999);
		
		return e1;
	}
}
