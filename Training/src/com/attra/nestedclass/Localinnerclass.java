package com.attra.nestedclass;

public class Localinnerclass {
	// local inner class
	public static void main(String[] args) {
		System.out.println("Program started");
		Localinnerclass lic = new Localinnerclass();
		lic.display();
	}

	public void display() {
		System.out.println("inside the display method of outer class");

		{
			class local {
				void printMessage() {
					System.out.println("printing a message for local inner class");
				}
			}
			local l = new local();
			l.printMessage();
		}
		// local l=new local(); it cannot be accessed outside the inner class
	}
}
