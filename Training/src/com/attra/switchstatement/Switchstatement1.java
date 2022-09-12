package com.attra.switchstatement;

public class Switchstatement1 {
	public static void main(String[] args) {
		// Declaring a variable for switch expression
		String m = "august";
		// Switch expression
		switch (m) {
		// case statements
		case "janauary":
			System.out.println("a");
			break;
		case "february":
			System.out.println("b");
			break;
		case "june":
			System.out.println("c");
			break;
		case "august":
			System.out.println("d");
			break;
		case "september":
			System.out.println("e");
			break;
		case "december":
			System.out.println("f");
			break;
		// default case statement
		default:
			System.out.println("g");
		}
	}

}
