package com.attra.switchstatement;

import java.util.Scanner;

public class Switchcharstatement {
	public static void main(String[] args) {
		// Declaring a variable for switch expression

		Scanner s = new Scanner(System.in);
		System.out.println("chicken dinner");
		char g = s.next().charAt(0);
		// Switch expression
		switch (g) {
		// case statements
		case 'A':
			System.out.println("stadium");
			break;
		case 'B':
			System.out.println("for the brainee");
			break;
		case 'C':
			System.out.println("come to the lobby");
			break;
		case 'D':
			System.out.println("android game");
			break;
		case 'G':
			System.out.println("banned");
			break;
		case 'F':
			System.out.println("family");
			break;
		// default case statement
		default:
			System.out.println("default");
		}
	}

}
