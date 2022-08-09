package com.service;

import java.util.ArrayList;

import com.entity.Employee;

public interface EmployeeService {
	public void addEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public Employee getEmployee(int id);
	public ArrayList<Employee> getEmployeeList();

}
