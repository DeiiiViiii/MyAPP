package com.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.interfaces.EmployeeDAOI;
import com.model.Employee;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAOI {
	
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Employee> getEmployee(String id) {
		Session session = sessionFactory.getCurrentSession();
		Query<Employee> query = session.createQuery("from Employee where id = :id");
		query.setParameter("id", Long.parseLong(id));
		List<Employee> emp = (List<Employee>) query.getResultList();
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		Session session = sessionFactory.getCurrentSession();
		Query<Employee> query = session.createQuery("from Employee");
		List<Employee> emp = (List<Employee>) query.getResultList();
		return emp;
	}
	
	@Override
	public void addEmployee(Employee emp) {
		Session session = sessionFactory.getCurrentSession();
		
		Employee employee = new Employee();
		//employee.setId(emp.getId());
		employee.setName(emp.getName());
		employee.setLastName(emp.getLastName());
		employee.setBirthDate(emp.getBirthDate());
		employee.setRole(emp.getRole());
		employee.setDepartment(emp.getDepartment());
		employee.setEmail(emp.getEmail());
		
		session.save(employee);
		
//		Query query = session.createQuery("insert into Employee(id,name,lastname,birthDate,role, department, email) "
//				+ "values (:id,:name,:lastname, :birthDate, :role, :department, :email)");	
//		query.setParameter("id", emp.getId());
//		query.setParameter("name", emp.getName());
//		query.setParameter("lastname", emp.getLastName());
//		query.setParameter("birthDate", emp.getBirthDate());
//		query.setParameter("role", emp.getRole());
//		query.setParameter("department", emp.getDepartment());
//		query.setParameter("email", emp.getEmail());
//		int result = query.executeUpdate();
	}
	

	@Override
	public boolean updateEmployee(Employee emp) {
		return false;
	}

	@Override
	public boolean updateEmployee(String id) {
		return false;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


}
