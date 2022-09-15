package springdemowiprocc.assignment;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       BeanFactory factory =  new XmlBeanFactory(new FileSystemResource("spring.xml"));
       Employee emp = factory.getBean(Employee.class);
       System.out.println(emp);
    
    }
}
