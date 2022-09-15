 package anygroupid.wiprocc_sprjavabased.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;

//@Qualifier("mybook")
public class Library {

	String linraryname;
	//	@Qualifier("mybook")
	@Autowired
	Book book;
	
//	 @Qualifier("homeAddress")
	@Autowired
	Address address;
	
//	@Qualifier("homeAddress")
//	@Autowired
//	Address officeAddress;
//	
	
//	@Qualifier("officeAddress")
//	@Autowired
//	Address officeAddress;
//	
// 	@Qualifier("address")
	//@Autowired
//	Address homeAddress;
//	
//	public Address getHomeAddress() {
//		return homeAddress;
//	}
//
//	public void setHomeAddress(Address homeAddress) {
//		this.homeAddress = homeAddress;
//	}
//
//	public Address getOfficeAddress() {
//		return officeAddress;
//	}
//
//	public void setOfficeAddress(Address officeAddress) {
//		this.officeAddress = officeAddress;
//	}
//------------------------------------------------
//	 
//	public Address getOfficeAddress() {
//		return officeAddress;
//	}
//
//	public void setOfficeAddress(Address officeAddress) {
//		this.officeAddress = officeAddress;
//	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	//@Autowired
	public Library() {
		//super();
		System.out.println("default  library constructor");
	 
	}
	
//	 @PostConstruct
//     public void myInit()
//	{
//		System.out.println("bean init method ");
//	}
	
	
	//@Autowired
	public Library(String linraryname, Book book) {
		super();
		System.out.println("constructor with args libname,book");
		this.linraryname = linraryname;
		this.book = book;
	}
//	@Autowired
//	public Library(Book book) {
//		super();
//		System.out.println("constructor with args book");
//	//	this.linraryname = linraryname;
//		this.book = book;
//	}
	public String getLinraryname() {
		return linraryname;
	}
	public void setLinraryname(String linraryname) {
		System.out.println("setter library ");
		this.linraryname = linraryname;
	}
	public Book getBook() {
		return book;
	}
	//@Qualifier("mybook")
	//@Autowired
	public void setBook(Book book) {
		System.out.println("set book  setter called");
		this.book = book;
	}
	@Override
	public String toString() {
		return "Library [linraryname=" + linraryname + ", book=" + book + "]";
	}
	
}
