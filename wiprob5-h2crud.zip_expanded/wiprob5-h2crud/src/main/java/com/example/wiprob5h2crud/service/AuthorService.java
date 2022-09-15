package com.example.wiprob5h2crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.wiprob5h2crud.exceptions.UserAlreadyRegisteredException;
import com.example.wiprob5h2crud.model.Author;

@Service
public interface AuthorService {

	public Author saveAuthor(Author author)throws UserAlreadyRegisteredException;
	public List<Author> getAllauthors();
	public Author getAuthor(int authorId); 
	public String deleteAuthor(int authorid);
	public Author updateAuthor(Author author);
	public List<Author> getByAuthorName(String name);
	public List<Author> findBookIgnoreCase(String book);
	public  Author  findByBookAndAuthorName(String book, String authorname);
	
}
