package com.example.employeespringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeespringboot.dao.EmployeeDao;
import com.example.employeespringboot.exceptions.UserAlreadyRegistered;
import com.example.employeespringboot.model.Employee;

@Service
public class Empservimpl implements Empservice{
	
	@Autowired
	EmployeeDao employeedao;

	@Override
	public Employee saveemployee(Employee employee)  {
		
//		 Employee emp = (Employee) getByempid(employee.getEmpid());
//		 if(emp!=null)
//		 {
//			 throw new UserAlreadyRegistered();
//		 }
		return employeedao.save(employee) ;
	}

	@Override
	public List<Employee> getemployees() {
		 
		return  (List<Employee>) employeedao.findAll();
	}

 
	@Override
	public List<Employee> getEmployeeByEmpDept(String name) {
			return employeedao.findByempdept(name);
		 
	}

	@Override
	public List<Employee> getempgender(String gen) {
		 
		return  employeedao.findByempdept(gen);
	}

 

	@Override
	public List<Employee> getByempdeptAndempcity(String dept, String city) {
		 return employeedao.findByEmpdeptAndEmpcity(dept, city);
	}

	@Override
	public List<Employee> getByempqual(String qual) {
		
//		Employee emp = (Employee) employeedao.findAll();
//		return emp.getEmpqual();
		return employeedao.findByEmpqual(qual);
	}

	@Override
	public Employee Updateemployee(Employee employee) {
 
		return employeedao.save(employee);
	}

	@Override
	public List<Employee> getEmployeeByEmpName(String name) {
	 
		 return employeedao.findByempname(name);
	}

	@Override
	public List<Employee> getByempid(int id) {
		
		Optional<Employee> empid = employeedao.findById(id);
		if(empid.isPresent())
		{
			return (List<Employee>) empid.get();
		}
		return null;
	}

	@Override
	public List<Employee> getByemprat() {
		 
		 return employeedao.findByEmprat(0);
	}

	@Override
	public List<Employee> getByempratAndempdept() {
 
		return employeedao.findByEmpratAndEmpdept();
	}

	@Override
	public List<Employee> getByempratAndempcity(String city) {
 
			return employeedao.findByEmpratAndEmpcity(city);
	}

 
 

}
