package com.attra.assignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Lengthexceedexception extends Exception {

	/**
	*
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		File file = new File("D:\\Training\\originfile.txt");
		FileWriter fileWriter = null;
		try {
			boolean isCreated = file.createNewFile();
			if (isCreated) {
				System.out.println("original file is created sucessfully");

			} else {
				System.out.println("file is not created");
			}
			System.out.println("writting into file");
			fileWriter = new FileWriter(file);
			fileWriter.write("Deepak");

			System.out.println("content writen succesfully");
		} catch (IOException e) {
			System.out.println("no permission to write content..");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
