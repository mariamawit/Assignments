package com.example.assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	
	
	List<Employee> empList = new ArrayList<Employee>();
	
	@RequestMapping ("/form")
	public String form(Map<String, Object> model) {
		model.put("key1", "Wipro");
		return "index";
	}
	
	@RequestMapping ("/register")
	public String register(@RequestParam("employeeId") String employeeId, 
			@RequestParam("employeeName") String employeeName,
			@RequestParam("employeeEmail") String employeeEmail,
			@RequestParam("location") String location) {
		Employee emp = new Employee(employeeId, employeeName, employeeEmail, location);
		empList.add(emp);
		return "index";
	}
	
	@GetMapping ("/displayAll")
	public Employee displayAll(Map<String, Object> model) {
		model.put("key1", "Wipro");
		
		for(int i = 0; i < empList.size(); i++) 
	    {
	       // Employee emp = empList.get(i);  
	       // {
	            return empList.get(i);
	        //}
	    }
	    return null;
		
	}
	
	@GetMapping ("/display/{id}")
	public Employee displayOne(@PathVariable("id") Integer id, Map<String, Object> model) {
		model.put("key1", "Wipro");
		return empList.get(id);
	}
}
