package com.attra.nestedclass;

public class Nestedinterfaceexample implements Printer.samsung {
	public static void main(String[] args) {
		System.out.println("Program starting");
		Printer.samsung obj = new Nestedinterfaceexample();
		obj.print();
		System.out.println("program completed successfully");
			
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing your documents");
	}

}
