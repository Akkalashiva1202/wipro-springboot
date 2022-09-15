package com.example.wiprob5h2crud.exceptions;

public class UserAlreadyRegisteredException extends Exception{
	
	public UserAlreadyRegisteredException()
	{
		super("User Already Registered");
	}
}
