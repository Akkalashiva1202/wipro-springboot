package com.example.wipro5RestApi.model;

import org.springframework.stereotype.Component;

@Component
public class Book {
	String name;
	int isbn;
	public Book() {
		super(); 
		name="Test app";
		System.out.println("book default connstructor ");
	}
	public Book(String name, int isbn) {
		super();
		this.name = name;
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", isbn=" + isbn + "]";
	}
	
	
	

}
