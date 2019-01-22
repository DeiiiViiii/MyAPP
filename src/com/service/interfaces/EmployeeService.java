package com.service.interfaces;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	
	List<Employee> getEmployee(String id);
	
	List<Employee> getAllEmployees();
	
	void addEmployee(Employee emp);

}
