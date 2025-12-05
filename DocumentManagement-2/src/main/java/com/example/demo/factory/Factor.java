package com.example.demo.factory;

import com.example.demo.service.DocumentService;
import com.example.demo.service.ExcelDocumentServiceImpl;
import com.example.demo.service.PDFDocumentServiceImpl;
import com.example.demo.service.WordDocumentServiceImpl;

public class Factor {

	public static DocumentService createObject(String type)
	{
		
		if(type.equals("pdf"))
		{
			return new PDFDocumentServiceImpl();
		}
		
		if(type.equals("word"))
		{
			return new WordDocumentServiceImpl();
		}
		
		if(type.equals("excel"))
		{
			return new ExcelDocumentServiceImpl();
		}
		
		return null;
	}
}

