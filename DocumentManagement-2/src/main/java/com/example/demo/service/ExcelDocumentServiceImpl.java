package com.example.demo.service;

public class ExcelDocumentServiceImpl  extends DocumentServiceAB {

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Processing data in Excel");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Prointing data in Excel");
		return "excel";
	}

}
