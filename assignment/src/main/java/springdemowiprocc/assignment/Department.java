package springdemowiprocc.assignment;

public class Department {
	private String field;
	private String role;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String field, String role) {
		super();
		System.out.println("constructor 2 args deparrtment field,role");
		this.field = field;
		this.role = role;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		 
		this.field = field;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Department [field=" + field + ", role=" + role + "]";
	}
	
	

}
