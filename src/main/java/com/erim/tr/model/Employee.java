package com.erim.tr.model;

import lombok.Data;

@Data
public class Employee {
	
	private String id;
    private String name;
    private String dept;
    
    
	public Employee(String id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
}
