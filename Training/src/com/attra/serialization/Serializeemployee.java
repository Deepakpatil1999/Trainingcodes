package com.attra.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializeemployee {
	public static void main(String[] args) {
		FileOutputStream fs = null;
		try {

			fs = new FileOutputStream("D:\\Readdata\\Serialization\\Employee.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ObjectOutputStream os = null;
		try {
			os = new ObjectOutputStream(fs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Employee emp = new Employee("deepak", 326056, "deepak.patil@attra.com.au");
		try {
			os.writeObject(emp);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("employee object has been steralized");

	}
}
