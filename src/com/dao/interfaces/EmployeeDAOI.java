package com.dao.interfaces;

import java.util.List;

import com.model.Employee;

public interface EmployeeDAOI {
	
	List<Employee> getEmployee(String id);
	
	List<Employee> getAllEmployees();
	
	boolean updateEmployee(Employee emp);
	
	boolean updateEmployee(String id);
	
	void addEmployee(Employee emp);

}
