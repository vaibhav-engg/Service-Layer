package com.entity;

import javax.persistence.*;


@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	@Column(name = "id1", nullable = false)
	@SequenceGenerator(name = "emp_seq",sequenceName = "employee_id1_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY , generator = "emp_seq")
	private int id;
	@Column(name = "firstname")
	
	
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	public Employee() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	

}
