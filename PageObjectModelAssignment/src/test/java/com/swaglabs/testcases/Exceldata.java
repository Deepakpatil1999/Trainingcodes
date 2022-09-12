package com.swaglabs.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("D:\\ExcelSheet\\Book1.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// ArrayList<String> arr = new ArrayList();

		// int sheets = workbook.getNumberOfSheets();
		XSSFSheet sheet = workbook.getSheetAt(1);
		String s1 = sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println(s1);

		String s2 = sheet.getRow(2).getCell(2).getStringCellValue();
		System.out.println(s2);

		String s3 = sheet.getRow(2).getCell(3).getStringCellValue();
		System.out.println(s3);

	}
}
