package com.example.wipro5RestApi.controller;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wipro5RestApi.model.Book;

@RestController
//@RequestMapping("books")
public class Mycontroller {

//	@RequestMapping(path = "",method = HttpMethod.GET)
	
	
//	@GetMapping
	
	//  http://localhost:1234/books/request
	@GetMapping("/request")
	public String hello()
	{
		return "Hello world";
	}
	
	//  http://localhost:1234/books/test
	@GetMapping("/test")
	public String hello1()
	{
		return "Hello world Test";
	}
	
	@GetMapping()
	public Book getbook()
	{
		return new Book("RestApi Development ",44);
	}
	
}
