package com.dao.impl;

import java.util.ArrayList;

import org.hibernate.Session;

import com.dao.EmployeeDao;
import com.entity.Employee;
//import com.training.HibernatePersistence;

public class EmployeeDaoImpl extends BaseDaoImpl implements EmployeeDao {

	public void addEmployee(Employee employee) {
		super.addEmployee(employee);
	}

	public void deleteEmployee(Employee employee) {
		super.deleteEmployee(employee);
		
	}

	public void updateEmployee(Employee employee) {
		super.updateEmployee(employee);
		
		}

	public Employee getEmployee(int id) {
		Employee e = new Employee();
		
		super.getEmployee(id);
		return e;
	}

	public ArrayList<Employee> getEmployeeList() {
		
		return null;
	}

}
