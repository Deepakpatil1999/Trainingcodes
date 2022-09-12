package com.attra.assignments;

import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	Scanner sc1 = new Scanner(System.in);
	int b=sc1.nextInt();
	//int a = 4, b = 2;

	public void addition() {
		int add = a + b;
		System.out.println("Addition of number : " + add);
	}

	public void subtraction() {
		int sub = a - b;
		System.out.println("Substraction of number : " + sub);
	}

	public void multplication() {
		int mul = a * b;
		System.out.println("Multiplication of number : " + mul);
	}

	public void division() {
		int div = a / b;
		System.out.println("Division of number : " + div);
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.addition();
		cal.subtraction();
		cal.multplication();
		cal.division();

	}

}
