package com.attra.switchstatement;

public class Switchmonthex {
	public static void main(String[] args) {
		int month = 7;
		String monthstring = "";
		switch (month) {
		case 1:
			monthstring = "1-jan";
			break;
		case 2:
			monthstring = "2-feb";
			break;
		case 3:
			monthstring = "3-mar";
			break;
		case 4:
			monthstring = "4-apr";
			break;
		case 5:
			monthstring = "5-may";
			break;
		case 6:
			monthstring = "6-jun";
			break;
		case 7:
			monthstring = "7-july";
			break;
		default:
			System.out.println("invalid month");
		}
		System.out.println(monthstring);
	}

}
