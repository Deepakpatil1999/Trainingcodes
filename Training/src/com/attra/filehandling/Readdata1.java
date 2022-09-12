package com.attra.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readdata1 {
	public static void main(String[] args) throws FileNotFoundException  {
		System.out.println("started");
		File f3 = new File("D:\\Readdata\\sample.txt");
		Scanner	sc = new Scanner(f3);
				System.out.println("read data from file");

				while (sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				
			}
			//sc.close();
		}

		
	}


