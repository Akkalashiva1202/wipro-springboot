package springdemowiprocc.springdemo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Library {

	private String libraryname;
	private String address;
	//private Book[] books;
	@Qualifier("book1")
	@Autowired
	private Book book;
	public void myInit()
	{
		System.out.println("library bean being  initialised ");
	}
	public void mydestroy()
	{
		System.out.println("library isbeing destroyed ");
	}
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public Library(String libraryname, String address, Book book) {
//		super();
//		this.libraryname = libraryname;
//		this.address = address;
//		this.book = book;
//	}
//	public String getLibraryname() {
//		return libraryname;
//	}
//	public void setLibraryname(String libraryname) {
//		this.libraryname = libraryname;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public Book getBook() {
//		return book;
//	}
//	public void setBook(Book book) {
//		this.book = book;
//	}
//	@Override
//	public String toString() {
//		return "Library [libraryname=" + libraryname + ", address=" + address + ", book=" + book + "]";
//	}
//	
	public String getLibraryname() {
		return libraryname;
	}
	public void setLibraryname(String libraryname) {
		this.libraryname = libraryname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//	public Book[] getBooks() {
//		return books;
//	}
//	public void setBooks(Book[] books) {
//		this.books = books;
//	}
//	public Library(String libraryname, String address, Book[] books) {
//		super();
//		this.libraryname = libraryname;
//		this.address = address;
//		this.books = books;
//	}
//	@Override
//	public String toString() {
//		return "Library [libraryname=" + libraryname + ", address=" + address + ", books=" + Arrays.toString(books)
//				+ "]";
//	}
//	 
//	 
	public Library(String libraryname, String address, Book book) {
		super();
		System.out.println("constructor with 3 arg book");
		this.libraryname = libraryname;
		this.address = address;
		this.book = book;
	}
	
	
	
	public Library(String libraryname, String address) {
		super();
		System.out.println("const with 2 name , address ");
		
		this.libraryname = libraryname;
		this.address = address;
	
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		System.out.println("setter book ");
		this.book = book;
	}
	public Library(Book book)
	{
		this.book = book;
	}
	@Override
	public String toString() {
		return "Library [libraryname=" + libraryname + ", address=" + address + ", book=" + book + "]";
	}
	
}
