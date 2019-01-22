package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
import com.service.interfaces.EmployeeService;

@Controller
public class EmployeesController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/employeeForm")
	public String showEmployeeForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "formEmployee";
	}
	
	@RequestMapping(value ="/addEmployee", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute("employee")Employee employee,
			Model model) {
		employeeService.addEmployee(employee);
		
		List<Employee> employeeList = employeeService.getAllEmployees();
		model.addAttribute("employeeList",employeeList);
		return "empleados2";
	}
	
	@RequestMapping("/employees")
	public String getAllEmployees(Model model) {
		List<Employee> employeeList = employeeService.getAllEmployees();
		model.addAttribute("employeeList",employeeList);
		return "empleados2";
	}
	
	@RequestMapping("/employeesList2")
	public String getAllEmployees2(Model model) {
		List<Employee> employeeList = employeeService.getAllEmployees();
		model.addAttribute("employeeList",employeeList);
		return "empleados2";
	}
	
	@RequestMapping("/employee")
	public String getEmployeeById(Model model, @RequestParam("id") String id) {
		List<Employee> emp = employeeService.getEmployee(id);
		model.addAttribute("employeeList",emp);
		return "empleados2";
	}
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	

}
