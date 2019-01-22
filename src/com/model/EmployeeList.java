package com.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeList {
	
	private static final List<Employee> empleadosList = new ArrayList();
    
    private EmployeeList(){
    	
    }
    
//    static{
//        empleadosList.add(new Employee("John","Smith","12-12-1980","Manager","Sales","john.smith@abc.com"));
//        empleadosList.add(new Employee("Laura","Adams","02-11-1979","Manager","IT","laura.adams@abc.com"));
//        empleadosList.add(new Employee("Peter","Williams","22-10-1966","Coordinator","HR","peter.williams@abc.com"));
//        empleadosList.add(new Employee("Joana","Sanders","11-11-1976","Manager","Marketing","joana.sanders@abc.com"));
//        empleadosList.add(new Employee("John","Drake","18-08-1988","Coordinator","Finance","john.drake@abc.com"));
//        empleadosList.add(new Employee("Samuel","Williams","22-03-1985","Coordinator","Finance","samuel.williams@abc.com"));
//    }
    
    public static List <Employee> getInstance(){
        return empleadosList;
    }

}
