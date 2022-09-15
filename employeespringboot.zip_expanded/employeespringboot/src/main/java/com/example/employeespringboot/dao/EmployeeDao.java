package com.example.employeespringboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.employeespringboot.model.Employee; 

@Repository
public interface EmployeeDao extends CrudRepository<Employee,Integer>  {

	public List<Employee> findByempdept(String name);
	public List<Employee> findByempgender(String gen);
	public List<Employee> findByempname(String empname);
 	 public List<Employee> findByEmpdeptAndEmpcity(String dept,String city);
 	 public List<Employee> findByEmpqual(String qual);
 	 
 	 @Query("select e from Employee e where e.emprat>5")
 	public List<Employee> findByEmprat(int emprat);
 	 
 	@Query("select e from Employee e where e.emprat<3 AND e.empdept=('IT')")
 	public List<Employee> findByEmpratAndEmpdept();
 	
 	@Query("select e from Employee e where e.emprat>4 AND e.empcity=:city")
	public List<Employee> findByEmpratAndEmpcity(@Param("city") String city);
 	
	
}
