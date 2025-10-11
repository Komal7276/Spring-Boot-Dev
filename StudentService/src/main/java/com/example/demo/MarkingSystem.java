package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarkingSystem {
		
		@PostMapping("studentResult")
		String studentResult(@RequestBody Student s)
		{
			if(s.getPercentage()>35)
			{
				return"You are Pass";
			}
			
			return"You are Fail";
		}
	
}

class Student
{
	private String name;
	private int rollno;
	private int percentage;
	
	public String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name=name;
	}
	
	public int getRollno()
	{
		return rollno;
	}
	void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	
	public int getPercentage()
	{
		return percentage;
	}
	void setPercentage(int percentage)
	{
		this.percentage=percentage;
	}
}
