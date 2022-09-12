package com.attra.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfromfile {
	public static void main(String[] args) {
		System.out.println("started");
		File f3 = new File("D:\\Readdata\\sample.txt");
		Scanner sc = null;
		try {

			if (f3.exists()) {
				sc = new Scanner(f3);
				System.out.println("read data");

				while (sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
			}
			System.out.println("can be readed " + f3.canRead());
			System.out.println("does have permission " + f3.canWrite());
			System.out.println("the file name is " + f3.getName());
			System.out.println("the absolute path " + f3.getAbsolutePath());
			sc.close();
			System.out.println("is deleted " + f3.delete());

		}

		catch (FileNotFoundException e) {
			System.out.println("content from notepad");
		}
	}

}
