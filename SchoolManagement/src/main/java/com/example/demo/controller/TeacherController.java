package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;

@RestController
public class TeacherController {

	@PostMapping("addTeacher")
	String addTeacher(@RequestBody Teacher teacher)
	{
		TeacherService t1 = new TeacherService();
		
		return t1.saveTeacher();
	}
	
	@GetMapping("getTeacher")
	Teacher getTeacher() {
		 Teacher t2 = new Teacher();
		 
		 t2.settName("xyz Sir");
		 t2.settId("50de");
		 t2.settDept("IT");
		 
		 return t2;
	}
}
