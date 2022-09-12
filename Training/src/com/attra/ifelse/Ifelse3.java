package com.attra.ifelse;

import java.util.Scanner;

public class Ifelse3 {

	public static void main(String[] args) {
		Scanner scc = new Scanner(System.in);
		System.out.println("I am deepak");
		int x = scc.nextInt();
		
		if (x == 10) {
			System.out.println("from mech");
		} else if (x == 12) {
			System.out.println("engineering");

		} else {
			System.out.println("bangalore");
		}
	}

}
