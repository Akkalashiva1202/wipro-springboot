package com.example.employeespringboot.exceptions;

public class UserAlreadyRegistered  extends Exception{

	public UserAlreadyRegistered()
	{
		super("Usaer already registered with this id");
	}
}
