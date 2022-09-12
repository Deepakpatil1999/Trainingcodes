package com.attra.training;

public class Constructorexample {
	int x;

	public Constructorexample(int x)

	{
		super();
		this.x = x;
	}

	public static void main(String[] args) {
		Constructorexample c = new Constructorexample(5);
		System.out.println(c.x);
	}
}
