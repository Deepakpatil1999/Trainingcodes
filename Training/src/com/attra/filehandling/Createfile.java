package com.attra.filehandling;

import java.io.File;
import java.io.IOException;

public class Createfile {
	public static void main(String[] args) {

		System.out.println("new file created");
		File file = new File("D:\\Readdata\\sample3.txt");
		try {
			boolean cr = file.createNewFile();
			if (cr) {
				System.out.println("new file created1");
			}

			else {
				System.out.println("new file created2");
			}
		}

		catch (IOException e) {
			System.out.println("new file created3");
			{
				e.printStackTrace();
			}

		}

	}
}
