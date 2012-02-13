package com.erim.tr.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import com.erim.tr.model.Employee;
import com.erim.tr.service.EmployeeService;
import com.erim.tr.service.impl.EmployeeServiceImpl;

@ManagedBean
public class EmployeeController {
	
	private EmployeeService employeeService = new EmployeeServiceImpl();
	
	public List<Employee> getEmployees() {
	        return employeeService.getAllEmployees();
	    }
}

