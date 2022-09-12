package com.attra.nestedclass;

public class Staticinnerclass {
	static int data = 2000;
	String org = "Attra";

	public static void main(String[] args) {
		System.out.println("Program started");
		Innerclass ic = new Staticinnerclass.Innerclass();
		ic.printOrgdetails();
		System.out.println("program terminated");
		// Staticinnerclass sic=new Staticinnerclass();

	}

	static class Innerclass {
		void printOrgdetails() {
			System.out.println("The organization was started in " + data);
			empdetais();
			
		}
	}

	public static void empdetais()
	{
System.out.println("Printing the employee details");

}
}
