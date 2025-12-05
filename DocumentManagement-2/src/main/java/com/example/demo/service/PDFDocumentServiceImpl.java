package com.example.demo.service;

public class PDFDocumentServiceImpl extends DocumentServiceAB {

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Processing data for PDF");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Printing data in PDF");
		return "pdf";
	}

}
