package com.attra.loops;

import java.util.Scanner;

public class Dowhile2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("enter digit between 1 to 10");
			n = sc.nextInt();

		} while (n <= 1 || n >= 10);
		System.out.println(n + " your entered between 1 to 10");
	}

}
