package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PdfDocumentServiceImpl extends DocumentServiceAb{

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Processing data for PDF");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Printintg data ");
		return "pdf";
	}

}
