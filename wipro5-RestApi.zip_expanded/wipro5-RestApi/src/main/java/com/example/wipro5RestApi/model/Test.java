package com.example.wipro5RestApi.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Test {
	
	@Autowired
	Book book;
	
	public void getresult()
	{
		System.out.println(book);
	}

}
