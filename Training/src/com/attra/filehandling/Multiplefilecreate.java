package com.attra.filehandling;

import java.io.File;
import java.io.IOException;

public class Multiplefilecreate {
	public static void main(String[] args) throws IOException {
		//File f=new File("D:\\Readdata\\New folder\\");
		for(int i=1;i<5;i++)
		{
			File f=new File("D:\\Readdata\\New folder\\training"+i+".txt");
			
			boolean s=f.createNewFile();
			System.out.println(s);
		}
		
	}

}
