package com.example.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.api.model.webkorps.Book1;

@RestController
public class CommanController {
	
	
	@GetMapping("/books")
	public Book1 getbooks() 
	{
	
	
Book1 b = new Book1();
b.setBname("java");
return b;




}
}
