package com.attra.training;

public class Employee {
	int eid;
	String name;
	static String company = "Attra";
	// super();
	// this.eid=eid;
	// this.name=name;

	public void display() {
		System.out.println(eid + "" + name + "" +  company );
	}

	public Employee(int eid, String name) {
		this.eid = eid;
		this.name = name;

	}
}
