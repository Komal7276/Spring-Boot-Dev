package com.example.demo.service;

abstract public class DocumentServiceAb implements DocumentService {

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("Reading data from DataBase");
		
	}


	@Override
	public String collectData() {
		// TODO Auto-generated method stub
		
		readData();
		processData();
		return printData();
	}

}
