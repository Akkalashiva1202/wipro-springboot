package com.example.employeespringboot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Component
public class MyExceptionHandler {

	@ExceptionHandler(UserAlreadyRegistered.class)
	public ResponseEntity<String> Authorregistered()
	{
		return new ResponseEntity<String>("Author with given author id lready rediatered",HttpStatus.NOT_ACCEPTABLE);
	}
}
