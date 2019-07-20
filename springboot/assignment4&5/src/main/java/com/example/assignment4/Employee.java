package com.example.assignment4;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Employee implements Serializable{
	
	
	private String employeeId;
	private String employeeName;
	private String employeeEmail;
	private String location;
	
	public Employee() {
		super();
	}

	public Employee(String employeeId, String employeeName, String employeeEmail, String location) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.location = location;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}
