package com.dao;

import java.util.ArrayList;

import com.entity.Employee;


public interface EmployeeDao {
	public void addEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public Employee getEmployee(int id);
	public ArrayList<Employee> getEmployeeList();
	}
