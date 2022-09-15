package com.example.wiprob5h2crud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.wiprob5h2crud.model.Author;

@Repository
public interface Authordao extends CrudRepository<Author, Integer> {

	public List<Author> findByAuthorName(String name);
	
	public List<Author> findByBookIgnoreCase(String book); 
	public  Author  findByBookAndAuthorName(String book, String authorname);
	
//	@Query("select a from Author a where upper(a.authorName)=upper(:name)")
//	public List<Author> findByName(@Param("name") String name);


}
