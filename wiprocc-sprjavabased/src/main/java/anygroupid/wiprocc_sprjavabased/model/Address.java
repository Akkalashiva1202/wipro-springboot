package anygroupid.wiprocc_sprjavabased.model;

import org.springframework.stereotype.Component;


//making Address as interface
//@Component("homeAddress")
@Component
public interface Address {
//	
//	String state;
//	String city;
//	public Address() {
//		super();
//		city = "banglore (waterpark)";
//		state = "karnataka";
//		// TODO Auto-generated constructor stub
//	}
//	public String getState() {
//		return state;
//	}
//	public void setState(String state) {
//		this.state = state;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public Address(String state, String city) {
//		super();
//		this.state = state;
//		this.city = city;
//	}
//	@Override
//	public String toString() {
//		return "Address [state=" + state + ", city=" + city + "]";
//	}
//	

		String getAddress();
	
}
