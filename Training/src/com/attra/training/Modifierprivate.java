package com.attra.training;

class A {
	public int data = 40;// if it is made private we cannot call

	public void msg() {
		System.out.println("hello");
	}
}

public class Modifierprivate {
	public static void main(String[] args) {
		A ref = new A();
		System.out.println(ref.data);// compile time error
		ref.msg();// compile time error
	}

}
