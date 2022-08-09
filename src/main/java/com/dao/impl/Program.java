package com.dao.impl;

import com.entity.Employee;

public class Program {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstname("suman");
		e.setLastname("vaibhav");
		EmployeeDaoImpl edi = new EmployeeDaoImpl();
		edi.addEmployee(e);
		
	}

}
