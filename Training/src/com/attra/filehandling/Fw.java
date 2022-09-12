package com.attra.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fw {

	public static void main(String[] args) throws IOException {
		FileWriter fw =null;
		
			File file=new File("D:\\Readdata\\New folder\\text1.txt");
			if(!file.exists()) {
				System.out.println("Creating a file");
				file.createNewFile();
			}
			
				fw=new FileWriter(file);
				fw.write("HEllo");
				fw.write("  hi");
				fw.close();
				System.out.println("Content written");
		}
		
		

	}



