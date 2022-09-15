package anygroupid.wiprocc_sprjavabased.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import anygroupid.wiprocc_sprjavabased.config.Myappconfig;
import anygroupid.wiprocc_sprjavabased.model.Book;
import anygroupid.wiprocc_sprjavabased.model.Library;

public class Bookservice {

	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(Myappconfig.class);
	//Book book = factory.getBean(Book.class);
	//	Book book =(Book)factory.getBean("book");

//		Book book =(Book)factory.getBean("getBook");  this to be used when bean name is nt given

		Library  library = factory.getBean(Library.class);
	//	Library  library1 = factory.getBean(Library.class);
		
	//	library.setLinraryname("new name");
		System.out.println(library);
		//System.out.println(library1);
//		System.out.println("office address "+library.getOfficeAddress());
//		System.out.println("home address "+library.getHomeAddress());
		System.out.println(library.getAddress().getAddress());
//		System.out.println(library.getOfficeAddress().getAddress());		
		
		
	}
}
