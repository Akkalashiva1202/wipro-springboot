package com.example.employeespringboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int empid;
	private String empname;
	private String empdept;
	private String empqual;
	private String empgender;
	private String empcity;
	private int emprat;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empname, String empdept, String empqual, String empgender, String empcity,
			int emprat) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
		this.empqual = empqual;
		this.empgender = empgender;
		this.empcity = empcity;
		this.emprat = emprat;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	public String getEmpqual() {
		return empqual;
	}
	public void setEmpqual(String empqual) {
		this.empqual = empqual;
	}
	public String getEmpgender() {
		return empgender;
	}
	public void setEmpgender(String empgender) {
		this.empgender = empgender;
	}
	public String getEmpcity() {
		return empcity;
	}
	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}
	public int getEmprat() {
		return emprat;
	}
	public void setEmprat(int emprat) {
		this.emprat = emprat;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdept=" + empdept + ", empqual=" + empqual
				+ ", empgender=" + empgender + ", empcity=" + empcity + ", emprat=" + emprat + "]";
	}

}
