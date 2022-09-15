package com.example.employeespringboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employeespringboot.exceptions.UserAlreadyRegistered;
import com.example.employeespringboot.model.Employee;

@Service
public interface Empservice {
	
//	throws UserAlreadyRegistered;
	public Employee saveemployee(Employee employee);
	public List<Employee> getemployees();
 	public List<Employee> getEmployeeByEmpDept(String name);
 	public List<Employee> getempgender( String gen);
 	public List<Employee> getEmployeeByEmpName(String name);
 	public List<Employee> getByempdeptAndempcity(String dept,String city);
 	public List<Employee> getByempqual(String qual);
 	public Employee Updateemployee(Employee employee);
 	public List<Employee> getByempid(int id);
 	
 	public List<Employee> getByemprat();
 	public List<Employee> getByempratAndempdept();
 	
 	public List<Employee> getByempratAndempcity(String city);
	 

	
 
	
}
