package com.serviceimpl;

import java.util.ArrayList;

import com.dao.impl.EmployeeDaoImpl;
import com.entity.Employee;
import com.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDaoImpl emp = new EmployeeDaoImpl();

	public void addEmployee(Employee employee) {
		emp.addEmployee(employee);
		System.out.println("Insertion sucessful");
		}

	public void deleteEmployee(Employee employee) {
		emp.deleteEmployee(employee);
		System.out.println("deletion successful");
		
	}

	public void updateEmployee(Employee employee) {
		emp.updateEmployee(employee);
		System.out.println("updated sucessfully");
		
	}

	public Employee getEmployee(int id) {
		Employee e = new Employee();
		 e= emp.getEmployee(id);
		
		return e;
	}

	public ArrayList<Employee> getEmployeeList() {
		
		return null;
	}

}
