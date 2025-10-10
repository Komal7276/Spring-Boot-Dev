package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@PostMapping("addCustomer")
	String addCustomer(@RequestBody Customer c)
	{
		if(c.getAge()>18)
		{
			//System.out.println("Customer Details :");
			//System.out.println("Name : "+c.getName());
			//System.out.println("Address : "+c.getAddress());
			//System.out.println("MobNo : "+c.getMobno());
			//System.out.println("Age : "+c.getAge());
			
			return"You are Eligible, Your account is opened.";
		}
		
		return"You are not eligible , can't open your account";
	}
	
}

class Customer
{
	private String name;
	private String address;
	private int age;
	private long mobno;
	
	String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name=name;
	}
	
	String getAddress()
	{
		return address;
	}
	void setAddress(String address)
	{
		this.address=address;
	}
	
	int getAge()
	{
		return age;
	}
	void setAge(int age)
	{
		this.age=age;
	}
	
	long getMobno()
	{
		return mobno;
	}
	void setMobno(long mobno)
	{
		this.mobno=mobno;
	}
}
