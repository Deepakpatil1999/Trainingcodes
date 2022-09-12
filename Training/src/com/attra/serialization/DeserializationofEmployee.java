package com.attra.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationofEmployee {
	public static void main(String[] args) {
		System.out.println("deserialization program started");
		ObjectInputStream ois = null;

		try {

			FileInputStream fis = new FileInputStream("D:\\Readdata\\Serialization\\Employee.txt");
			ois = new ObjectInputStream(fis);

			Employee emp = (Employee) ois.readObject();
			System.out.println("The state of Deserilized object is");
			System.out.println(emp.toString());
			ois.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
