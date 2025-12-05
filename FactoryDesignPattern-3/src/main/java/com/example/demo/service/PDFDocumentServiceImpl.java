package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PDFDocumentServiceImpl extends DocumentServiceAb {

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Processing data ");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Printing data");
		return "pdf";
	}

}
