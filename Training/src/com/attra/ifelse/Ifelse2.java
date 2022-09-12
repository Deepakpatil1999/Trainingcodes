package com.attra.ifelse;

import java.util.Scanner;

public class Ifelse2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 11;
		Scanner s1 = new Scanner(System.in);
		System.out.println("I am deepak");
		if (x == s1.nextInt()) {
			System.out.println("from mech");
		} else if (y == s1.nextInt()) {
			System.out.println("engineering");

		} else {
			System.out.println("bangalore");
		}
	}

}
