package com.example.wipro5RestApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.wipro5RestApi.model.Book;
import com.example.wipro5RestApi.model.Test;

@SpringBootApplication
public class Wipro5RestApiApplication {

//	@Autowired
//	static Book book;
//	
	//static Book book = new Book();
	
	 
	public static void main(String[] args) {
	//	Book book = new Book();
		
		
//		Test t = new Test();
//		t.getresult();
		SpringApplication.run(Wipro5RestApiApplication.class, args);
		//System.out.println(book.getName());
	//	Test t = new Test();
	//	t.getresult();
	}

	@Bean
	public Book getBook()
	{
		return new Book();
	}
}
