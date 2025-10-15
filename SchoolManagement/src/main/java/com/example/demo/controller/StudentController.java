package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@PostMapping("addStudent")
	String addStudent(@RequestBody Student student)
	{
		StudentService s1 = new StudentService();
		
		return s1.saveStudent();
	}
	
	
	@GetMapping("getStudent")
	Student getStudent() {
		
		Student s2 = new Student();
		
		s2.setsName("Radhika");
		s2.setsAddress("Pune");
		s2.setsAge(25);
		s2.setSrollNo(1);
		s2.setsDiv('c');
		
		return s2;
		
	}

}
