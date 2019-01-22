package com.service.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.interfaces.EmployeeDAOI;
import com.model.Employee;
import com.model.EmployeeList;
import com.service.interfaces.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDAOI employeeDAO;
	

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();		
	} 

    public List<Employee> searchEmployeesByName(String name) {
        Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getName)
                                                    .thenComparing(Employee::getLastName);
        List<Employee> result = EmployeeList.getInstance()
                .stream()
                .filter(e -> e.getName().equalsIgnoreCase(name) || e.getLastName().equalsIgnoreCase(name))
                .sorted(groupByComparator)
                .collect(Collectors.toList());
        return result;
    }

    public Employee getEmployee(long id) throws Exception {
        Optional<Employee> match
                = EmployeeList.getInstance().stream()
                .filter(e -> e.getId() == id)
                .findFirst();
        if (match.isPresent()) {
            return match.get();
        } else {
            throw new Exception("The Employee id " + id + " not found");
        }
    }

	@Override
	@Transactional
	public List<Employee> getEmployee(String id) {
		return employeeDAO.getEmployee(id);
	}

	@Override
	public void addEmployee(Employee emp) {
		employeeDAO.addEmployee(emp);	
	}

	  

}
