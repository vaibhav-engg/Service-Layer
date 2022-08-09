package com.dao.impl;

import java.util.ArrayList;

import org.hibernate.Session;

import com.entity.Employee;

public class BaseDaoImpl {
	public void addEmployee(Employee employee) {
		Session session = HibernatePersistence.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(employee);
		System.out.println("Insertion successful");
		session.getTransaction().commit();
		session.close();
		HibernatePersistence.shutdown();
		
	}

	public void deleteEmployee(Employee employee) {
		Session session = HibernatePersistence.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(employee);
		System.out.println("deleted successfully");
		session.getTransaction().commit();
		session.close();
		HibernatePersistence.shutdown();
		
	}

	public void updateEmployee(Employee employee) {
		Session session = HibernatePersistence.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(employee);
		System.out.println("Updation successful");
		session.getTransaction().commit();
		session.close();
		HibernatePersistence.shutdown();
		
		}

	public Employee getEmployee(int id) {
		
		Session session = HibernatePersistence.getSessionFactory().openSession();
		session.beginTransaction();
		Employee employee = (Employee) session.get(Employee.class,id);
		session.getTransaction().commit();
		session.close();
		HibernatePersistence.shutdown();
		return employee;

	}

	public ArrayList<Employee> getEmployeeList() {
		
		return null;
	}


}
