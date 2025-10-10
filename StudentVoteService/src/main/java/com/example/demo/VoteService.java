package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoteService {

	@PostMapping("voterId")
	String voterId(@RequestBody Student s)
	{
		if(s.getAge()>18)
		{
			return s.getName() + "Your age is " + s.getAge()+"so you are Eligible for VoterId";
		}
		
		return s.getName() + "You are not Eligible for VoterId";
	}
}

class Student
{
	String name;
	String address;
	long mobno;
	int age;
	
	public String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name=name;
	}
	
	public String getAddress()
	{
		return address;
	}
	void setAddress(String address)
	{
		this.address=address;
	}
	
	public long getmobno()
	{
		return mobno;
	}
	void setMobno(long mobno)
	{
		this.mobno=mobno;
	}
	
	public int getAge()
	{
		return age;
	}
	void setAge(int age)
	{
		this.age=age;
	}
	
}
