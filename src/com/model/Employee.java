package com.model;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "EMPLEADO")
public class Employee implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID_EMP")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="emp_seq")
	@SequenceGenerator(name="emp_seq", sequenceName="EMPLEADO_SEQ", allocationSize=1)
	private long id;
	
	@Column(name = "NOMBRE")
    private String name;
	
	@Column(name = "APELLIDOS")
    private String lastName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd") // This is for bind Date with @ModelAttribute
	@Column(name = "FECHA_NAC")
    private Date birthDate;
	
	@Column(name = "ROL")
    private String role;
	
	@Column(name = "DEPARTAMENTO")
    private String department;
	
	@Column(name = "EMAIL")
    private String email;
	
    private static final AtomicLong counter = new AtomicLong(100);
    
    public Employee() {
		
	}

    public Employee(String name, String lastName, Date birthDate, String role, String department, String email, long id) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.role = role;
        this.department = department;
        this.email = email;     
        this.id = id;
    }
    
    public Employee(String name, String lastName, Date birthDate, String role, String department, String email) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.role = role;
        this.department = department;
        this.email = email;     
        this.id = counter.incrementAndGet();
    }
    
	// gettes and setters

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static AtomicLong getCounter() {
		return counter;
	}
    
    
    

}
