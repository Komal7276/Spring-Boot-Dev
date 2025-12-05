package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ExcelDocumentServiceImpl extends DocumentServiceAb{

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Processing data for Excel");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Printing data");
		return "excel";
	}

}
