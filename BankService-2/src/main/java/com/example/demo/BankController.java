package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

	@PostMapping("addCustomer")
	public String addCustomer(@RequestBody Customer c)
	{
		if(c.getAge()>18)
		{
			return"Your account created";
		}
		
		return"Your account is not created";
	}
}
