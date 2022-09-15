package com.example.employeespringboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeespringboot.exceptions.UserAlreadyRegistered;
import com.example.employeespringboot.model.Employee;
import com.example.employeespringboot.service.Empservice;

@CrossOrigin
@RestController
@RequestMapping("employees")
public class Empcontroller {

	@Autowired
	Empservice empservice;
	
	 
	
	@PostMapping
	public ResponseEntity<Employee> saveemployee(@RequestBody Employee employee)
			//throws UserAlreadyRegistered
	{
		//Employee employee=employeeService.SaveEmp(emp1);
		Employee emp = empservice.saveemployee(employee);
		return new ResponseEntity<Employee>(employee,HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Employee>> getallemployees()
	{
		List<Employee> employees = empservice.getemployees();
		if(employees!=null)
		{
			
		return new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<List<Employee>>(HttpStatus.NOT_FOUND);
					
		}
	}
	 
	@GetMapping("dept/{dept}")
	public ResponseEntity<Object> getbydeptname(@PathVariable String dept)
	{
		List<Employee> emplys = empservice.getEmployeeByEmpDept(dept);
		if(emplys.size()!=0)
		{
		return new ResponseEntity<Object>(emplys,HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<Object>("Data not found ",HttpStatus.NOT_FOUND);
		}
	} 
	
	 
	@GetMapping("name/{name}")
	public ResponseEntity<Object> findbyname(@PathVariable String name)
	{
		List<Employee> empnames = empservice.getEmployeeByEmpName(name);
		if(empnames.size()!=0)
		{
			return new ResponseEntity<Object>(empnames,HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<Object>("Data Not Found ",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("dept/city/{dept}/{city}")
	public ResponseEntity<Object> getdeptandcity(@PathVariable String dept,@PathVariable String city)
	{
		Employee emp = (Employee) empservice.getByempdeptAndempcity(dept, city);
		if(emp!=null)
		{
			return new ResponseEntity<Object>(emp,HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<Object>("Data Not Found",HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping("qual/{qual}")
	public ResponseEntity<Object> getqualification(@PathVariable String qual)
	{
		List<Employee>  empqual = empservice.getByempqual(qual);
		if(empqual.size()!=0)
		{
			return new ResponseEntity<Object>(empqual,HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<Object>("Data Not Found ",HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping
	public ResponseEntity<Employee> updateemployee(@RequestBody Employee emp) 
			//throws UserAlreadyRegistered
	{
		Employee updateemp = empservice.saveemployee(emp);
		return new ResponseEntity<Employee>(updateemp,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("id/{id}")
	public ResponseEntity<Object> getemployeebyid(@PathVariable int id)
	{
		List<Employee> emplist = empservice.getByempid(id);
		if(emplist.size()!=0)
		{
			return new ResponseEntity<Object>(emplist,HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<Object>("Data Not Found",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("rating")
	public ResponseEntity<Object> getrating()
	{
		List<Employee> emprat = empservice.getByemprat();
		if(emprat.size()!=0)
		{
			return new ResponseEntity<Object>(emprat,HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<Object>("Data Not Found",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("ratdept")
	public ResponseEntity<Object> getbyratdept()
	{
		List<Employee> ratdept = empservice.getByempratAndempdept();
		if(ratdept.size()!=0)
		{
			return new ResponseEntity<Object>(ratdept,HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<Object>("Data Not Found",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("rac/{city}")
	public ResponseEntity<Object> getbyratcity(@PathVariable String city)
	{
		List<Employee> ratcity = empservice.getByempratAndempcity(city);
		if(ratcity.size()!=0)
		{
			return new ResponseEntity<Object>(ratcity,HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<Object>("Data Not Found",HttpStatus.NOT_FOUND);
		}
	}
}