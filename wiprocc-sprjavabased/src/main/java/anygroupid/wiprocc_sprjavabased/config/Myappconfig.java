package anygroupid.wiprocc_sprjavabased.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import anygroupid.wiprocc_sprjavabased.model.Address;
import anygroupid.wiprocc_sprjavabased.model.Book;
import anygroupid.wiprocc_sprjavabased.model.Library;

@ComponentScan(basePackages = {"anygroupid.wiprocc_sprjavabased.model"})
@Configuration
public class Myappconfig {

	
	//if bean name is not given then method name is the bean name
//	@Bean
//	public Book getBook()
//	{
//		return new Book(55,"my last world cup");
//	}
	
	
	
	
	//--------------------------------------------
//	
//	@Bean(name="mybook")
//	public Book getBook()
//	{
//		return new Book(55,"my last world cup");
//	}
//	@Bean(name="book")
//	public Book getBook1()
//	{
//		return new Book(45,"my first world cup");
//	}
//	
//	@Scope("prototype")
//	//@Bean(name="mylibrary")
//	@Bean
//	public Library getLibrary()
//	{
//	//	Library library = new Library("new library",null);
//	//	return new Book(55,"my last world cup");
//		//Library library = new Library();
//	Library library = new Library("",null);
//		library.setLinraryname("central library");
//
//		return library;

	@Bean
	public Library getLibrary()
	{
		return new Library();
		//return new Library("hello",null);
	}
	
//	@Bean(name="officeAddress")
//	public Address getAddress()
//	{
//		return new Address("maharastra","mumbai");
//	}
	
	//-----------------------------------------------------------
//	@Bean
//	public Book getBook()
//	{
//		return new Book();
//		//return new Book(88,"new  name");
//	}
 
}
