package com.example.wiprob5h2crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wiprob5h2crud.exceptions.UserAlreadyRegisteredException;
import com.example.wiprob5h2crud.model.Author;
import com.example.wiprob5h2crud.service.AuthorService;

@RestController
@RequestMapping("authors")
public class Authorcontroller {

	@Autowired
	AuthorService authorservice;
	
	@PostMapping
	public ResponseEntity<Author> saveAuthor(@RequestBody Author author)throws UserAlreadyRegisteredException
	{
	Author savedauthor = 	authorservice.saveAuthor(author); 
		return new ResponseEntity<Author>(savedauthor,HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Author>> getAuthors()
	{
		List<Author> allauthors =   authorservice.getAllauthors(); 
		return new ResponseEntity<List<Author>>(allauthors,HttpStatus.FOUND );
	}
	
//	@GetMapping("{authorId}")
//	public ResponseEntity<Author> getAuthor(@PathVariable int  authorId)
//	{	
//		Author author = authorservice.getAuthor(authorId);
//		return new  ResponseEntity<Author>(author,HttpStatus.FOUND);
//	}
	
	//-------------------\-----------------
	@GetMapping("{authorId}")
	public ResponseEntity<Object> getAuthor(@PathVariable int  authorId)
	{	
		Author author = authorservice.getAuthor(authorId);
			if(author!=null)
			{
				return new  ResponseEntity<Object>(author,HttpStatus.FOUND);
			}
			else
			{
				return new ResponseEntity<Object>("Data Not Found",HttpStatus.NOT_FOUND);
			}
		
	}
	
	//------------------------------------
	
	@DeleteMapping("{authorId}")
	public ResponseEntity<String> deleteAuthor(@PathVariable int  authorId)
	{	
		String result = authorservice.deleteAuthor(authorId);
			  	return new ResponseEntity<String>(result,HttpStatus.FOUND);
			
		
	}
	@PutMapping
	public ResponseEntity<Author> updateAuthor(@RequestBody Author author)
	{
		Author updateaut = authorservice.updateAuthor(author);
		return new ResponseEntity<Author>(updateaut,HttpStatus.CREATED);
	}
	
	@GetMapping("name/{name}")
	public ResponseEntity<Object> getAuthor(@PathVariable String name)
	{
		List<Author> authors = authorservice.getByAuthorName(name);
			if(authors.size()!=0)
			{
				return new ResponseEntity<Object>(authors,HttpStatus.FOUND);
			}
			else
			{

				return new ResponseEntity<Object>("Data Not Found",HttpStatus.NOT_FOUND);
			}
	}
	
	
	@GetMapping("book/{book}")
	public ResponseEntity<Object> getAuthorByBook(@PathVariable String book)
	{
		List<Author> authors = authorservice.findBookIgnoreCase(book);
		if(authors.size()!=0)
		{
			return new ResponseEntity<Object>(authors,HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<Object>("Data Not Found",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("book/author/{book}/{name}")
	public ResponseEntity<Object> getauthorbybookname(@PathVariable String book,@PathVariable String name)
	{
		Author author = authorservice.findByBookAndAuthorName(book, name);
		if(author!=null)
		{
			return new ResponseEntity<Object>(author,HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<Object>("Data Not Found",HttpStatus.NOT_FOUND);
		}
	}

}
