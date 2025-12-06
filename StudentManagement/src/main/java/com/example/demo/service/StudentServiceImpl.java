package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public String saveStudent(Student student) {
		// TODO Auto-generated method stub
		
		if(student.getAge()<18)
		{
			return "not eligible ";
		}
		
		return "your eligible";
		
	}

}
