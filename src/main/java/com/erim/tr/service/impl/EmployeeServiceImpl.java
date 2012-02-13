package com.erim.tr.service.impl;

import java.util.List;

import com.erim.tr.model.Employee;
import com.erim.tr.service.EmployeeService;
import com.google.common.collect.Lists;

public class EmployeeServiceImpl implements EmployeeService {

	private List<Employee> employees = Lists.newArrayList(new Employee("1", "erim", "R&D"));
	
	public List<Employee> getAllEmployees() {
		return employees;
	}

}
