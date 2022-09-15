package springdemowiprocc.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Book book = new Book(151210,"my life",2000);
//        System.out.println(book);
//        
 //   BeanFactory factory = 	 new XmlBeanFactory(new FileSystemResource("spring.xml"));
       
    //Book book =  factory.getBean(Book.class);
  //  Book book =  (Book) factory.getBean("book1");
    // Book book = (Book) factory.getBean("book");//bean id= book in spring.xml
  //  System.out.println(book);
  //  Book bok =(Book) factory.getBean("book2"); 
  //	System.out.println(bok);
  
    ApplicationContext factory =  new ClassPathXmlApplicationContext("spring.xml");
    //move your spring folder to src 
    ((AbstractApplicationContext)factory).registerShutdownHook();
    	
    Library library = factory.getBean(Library.class);
     
    Library library1 = factory.getBean(Library.class);
    System.out.println("library "+library);
    
    System.out.println("library 1"+library1);
    
    System.out.println("-------after---------");
    library.setLibraryname("M.G library");
 System.out.println("library "+library);
//    
     System.out.println("library 1"+library1);
    
    }
}
