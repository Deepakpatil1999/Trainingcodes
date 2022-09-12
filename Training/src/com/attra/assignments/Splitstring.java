package com.attra.assignments;

public class Splitstring {

	public static void main(String[] args) {
		String org = "Attra infotech organization bangalore";
		String[] split=  org.split(" ");
		for(int i=0;i<=split.length;i++)
		System.out.println(split[i]+"");
		
		
	}
}
