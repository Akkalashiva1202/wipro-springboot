package anygroupid.wiprocc_sprjavabased.model;

import org.springframework.stereotype.Component;

@Component
public class Book {

	private String name;
	private int isbnno;
	public Book( ) {
		super();
		
		name="My hobbies";
		isbnno = 500;
		// TODO Auto-generated constructor stub
	}
	public Book(int isbnno, String name) {
		super();
		this.isbnno = isbnno;
		this.name = name;
	}
	public int getIsbnno() {
		return isbnno;
	}
	public void setIsbnno(int isbnno) {
		this.isbnno = isbnno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [isbnno=" + isbnno + ", name=" + name + "]";
	}
	
	
	
}
