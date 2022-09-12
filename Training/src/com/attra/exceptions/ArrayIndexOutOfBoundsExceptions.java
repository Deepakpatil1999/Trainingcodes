package com.attra.exceptions;

public class ArrayIndexOutOfBoundsExceptions {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[6] = 9; // Accessing 7 th element in an array of size 5
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("it is an array index is out of bounds");
		}
	}

}
