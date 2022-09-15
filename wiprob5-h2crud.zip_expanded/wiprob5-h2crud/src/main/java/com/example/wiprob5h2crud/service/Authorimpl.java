package com.example.wiprob5h2crud.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wiprob5h2crud.dao.Authordao;
import com.example.wiprob5h2crud.exceptions.UserAlreadyRegisteredException;
import com.example.wiprob5h2crud.model.Author;

@Service
public class Authorimpl  implements AuthorService{

	@Autowired
	Authordao authordao;
	
	@Override
	public Author saveAuthor(Author author) throws UserAlreadyRegisteredException{
		
		Author foundauthor = getAuthor(author.getAuthorId());
		if(foundauthor!=null)
		{
			throw new UserAlreadyRegisteredException();
			
		}
			
		String name = namegenerator(author.getAuthorName());
		author.setAuthorName(name);
	return  authordao.save(author);
	}
	public String namegenerator(String name)
	{
		return name.toUpperCase();
		
	}
	@Override
	public List<Author> getAllauthors() {
 
		return (List<Author>) authordao.findAll();
	}
	@Override
	public  Author getAuthor(int authorId) {
		
		Optional<Author> authoropt = authordao.findById(authorId);
			if(authoropt.isPresent())
			{
					return authoropt.get();
			}
		//return authordao.findById(authorId).get();
			return null;
	}
	@Override
	public String deleteAuthor(int authorid) {
		Author author = getAuthor(authorid);
		if(author!=null)
		{
			authordao.delete(author);
			return "Author deleted ";
		}
		else
		{
			return "Author cannot be deleted ";
		}
	
	}
	@Override
	public Author updateAuthor(Author author) {
 
		return authordao.save(author);
	}
	@Override
	public List<Author> getByAuthorName(String name) {
 
		return authordao.findByAuthorName(name);
	}
	@Override
	public List<Author> findBookIgnoreCase(String book) {
		
		return authordao.findByBookIgnoreCase(book);
	}
	@Override
	public Author findByBookAndAuthorName(String book, String authorname) {
			
		return authordao.findByBookAndAuthorName(book, authorname);
	}

}
