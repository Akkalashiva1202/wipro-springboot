package anygroupid.wiprocc_sprjavabased.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//internally component is created as Component("homeAddress");

@Primary
@Component
public class HomeAddress  implements Address{

	@Override
	public String getAddress() { 
		
		return "Home Address";
	}

	
}
