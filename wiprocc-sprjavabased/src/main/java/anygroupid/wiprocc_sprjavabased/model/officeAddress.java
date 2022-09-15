package anygroupid.wiprocc_sprjavabased.model;

import org.springframework.stereotype.Component;

@Component
public class officeAddress implements Address {

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return "Office Address";
	}

	
}
