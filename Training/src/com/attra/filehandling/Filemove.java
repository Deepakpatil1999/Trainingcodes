package com.attra.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Filemove {
	public static void main(String[] args) {
		String src = "D:\\Readdata\\sample2.txt";
		String trc = "D:\\Readdata\\New folder\\sample2.txt";
		System.out.println("programm started");
		File f = new File("D:\\Readdata\\New folder\\");
		System.out.println("target directory " + f.isDirectory());

		if (f.isDirectory()) {
			try {
				Path path = Files.move(Paths.get(src), Paths.get(trc));
				System.out.println(path);
				System.out.println("file moved succefully");

			} catch (IOException e) {
				System.out.println("file couldnt be moved");
			}
		}

	}
}
