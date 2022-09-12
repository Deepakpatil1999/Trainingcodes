package com.attra.serialization;

import java.io.Serializable;
import java.sql.Date;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int id;
	String email;
	Date dob;

	

	public Employee(String name, int id, String email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		//this.dob = dob;
	}

	/*
	 * public Date getDob() { return dob; }
	 * 
	 * public void setDob(Date dob) { this.dob = dob; }
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", email=" + email + "]";
	}
	



}
