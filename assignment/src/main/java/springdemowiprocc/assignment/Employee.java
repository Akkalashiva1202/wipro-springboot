package springdemowiprocc.assignment;

import java.util.Arrays;

public class Employee {

	private String name;
	private Department department;
	private Address[] address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		
		return department;
	}
	public void setDepartment(Department department) {
		System.out.println("setter dep");
		this.department = department;
	}

	public Employee(String name, Department department, Address[] address) {
		super();
		this.name = name;
		this.department = department;
		this.address = address;
	}

	public Address[] getAddress() {
		return address;
	}

	public void setAddress(Address[] address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", address=" + Arrays.toString(address) + "]";
	}
	 
	 
	
}
