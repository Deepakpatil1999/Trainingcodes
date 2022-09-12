package com.attra.nestedclass;

public class Vehicle {
	//Inner vehicle
	
	private int speed = 80;
	public void workType()
	{
		System.out.println("An automatic with petrol as fuel");
	}
	class Car{
		void drive()
		{
			System.out.println("this car runs with speed of " +speed + " mph");
			workType();
		}
	}
	public static void main(String[] args) {
		System.out.println("program started");
		Vehicle vh=new Vehicle();
		Car c= vh.new Car();
		c.drive();
		
		System.out.println("Program completed");
		
	}

}
