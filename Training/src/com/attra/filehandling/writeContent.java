package com.attra.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeContent {

	public static void main(String[] args)
	{
		try {
			File f=new File("D:\\Readdata\\New folder\\tt.txt");
			if(!f.exists())
				{
				System.out.println("creating new file..");
				f.createNewFile();
				}
			FileWriter filewriter=new FileWriter(f);
			filewriter.write("Hi");
			filewriter.write("Hello this is Deepak");
			filewriter.close();
			System.out.println("Content written successfully");
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
