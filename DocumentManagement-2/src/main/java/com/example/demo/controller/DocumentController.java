package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.factory.Factor;
import com.example.demo.service.DocumentService;

@RestController
public class DocumentController {
	
	@GetMapping("print/{type}")
	public String PrintInvoice(@PathVariable String type)
	{
		DocumentService DS = Factor.createObject(type);
		
		DS.readData();
		DS.processData();
		
		return DS.printData();
	}

}

