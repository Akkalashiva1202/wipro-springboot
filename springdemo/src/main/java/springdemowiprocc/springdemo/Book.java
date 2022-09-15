package springdemowiprocc.springdemo;

import java.util.Arrays;

public class Book {

	int isbnno;
	String title;
//	String[] volumes;
	  
//	public String[] getVolumes() {
//		return volumes;
//	}
//	public void setVolumes(String[] volumes) {
//		this.volumes = volumes;
//	}
	public Book() {
		super();
		 	// TODO Auto-generated constructor stub
	}
	public int getIsbnno() {
		return isbnno;
	}
	public void setIsbnno(int isbnno) {
		System.out.println("setter isbnno");
		this.isbnno = isbnno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		System.out.println("setter title");
		this.title = title;
	}
	public Book(String title, int isbnno) {
		super();
		System.out.println("constructor  with args  string,int");
		this.title = title;
		this.isbnno = isbnno;
	 
	}
	public Book(int isbnno, String title) {
		super();
		System.out.println("constructor with args  int,string, ");
		this.isbnno = isbnno;
		this.title = title;
	 
	}
//	@Override
//	public String toString() {
//		return "Book [isbnno=" + isbnno + ", title=" + title + ", volumes=" + Arrays.toString(volumes) + "]";
//	}
// 
	@Override
	public String toString() {
		return "Book [isbnno=" + isbnno + ", title=" + title    + "]";
	}
 
	 
	 
	 
	 
	}

