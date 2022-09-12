package com.attra.switchstatement;

import java.util.Scanner;

public class Switchstaement4 {
	public static void main(String[] args) {
		// Declaring a variable for switch expression

		String games = "pubg";
		Scanner s = new Scanner(System.in);
		System.out.println("chicken dinner");
		String game = s.nextLine();
		// Switch expression
		switch (game) {
		// case statements
		case "cricket":
			System.out.println("stadium");
			break;
		case "chess":
			System.out.println("for the brainee");
			break;
		case "pubg":
			System.out.println("come to the lobby");
			break;
		case "cod":
			System.out.println("android game");
			break;
		case "freefire":
			System.out.println("banned");
			break;
		case "ludo":
			System.out.println("family");
			break;
		// default case statement
		default:
			System.out.println("g");
		}
	}

}
