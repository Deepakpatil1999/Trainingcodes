package com.attra.nestedclass;

public class Anonymous {
	//Anonymous inner class
	

	public static void main(String[] args) {
		int data =5;
		System.out.println("Starting the program execution");
		
		Ekart ek=new Ekart()
				{
			@Override
			void addItem()
			{
				System.out.println(data + " Item is added to ekart  ");
			}
				};
				System.out.println("Invoking the anonymous from the outer");
				ek.addItem();
		
	}

}
