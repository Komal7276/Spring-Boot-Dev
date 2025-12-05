package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DocumentService;
import com.example.demo.service.ExcelDocumentServiceImpl;
import com.example.demo.service.PdfDocumentServiceImpl;

@RestController
@RequestMapping("print")
@Qualifier("ExcelDocumentServiceImpl")
public class DocumentController {

    private final ExcelDocumentServiceImpl excelDocumentServiceImpl;

    private final PdfDocumentServiceImpl pdfDocumentServiceImpl;
	
	//Constructor Injection
	/*
	 * Constructor is sepcial type of method without return type
	 * class name and method name is exactly same  in constructor
	 * use constructor to create the object & to initialize the state 
	 * variable
	 * 
	 * there are 3 type default, parameterized,no argument
	 * 
	 * */
	
	//Constructor Injection
	DocumentController(PdfDocumentServiceImpl pdfDocumentServiceImpl,
			ExcelDocumentServiceImpl excelDocumentServiceImpl)
	{
		this.pdfDocumentServiceImpl = pdfDocumentServiceImpl;
		this.excelDocumentServiceImpl = excelDocumentServiceImpl;
	}
	
	
	
	
	//Setter injection ->>Application Context
	
	@Autowired
	ApplicationContext applicationContext ; //spring factory
	
	
	@Autowired
	DocumentService documentService;
	
	@GetMapping("/{type}")
	public String printInvoice(@PathVariable String type)
	{	
		if(type.equals("pdf"))
		{
			documentService = (DocumentService) applicationContext.getBean(PdfDocumentServiceImpl.class);
		}
		
		if(type.equals("excel"))
		{
			documentService = (DocumentService) applicationContext.getBean(ExcelDocumentServiceImpl.class);
		}
		
		
		return documentService.collectData();
	}
}
