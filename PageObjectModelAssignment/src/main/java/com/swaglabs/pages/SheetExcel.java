package com.swaglabs.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SheetExcel {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream("D:\\ExcelSheet\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		int sheets=wb.getNumberOfSheets();
		for(int i=0; i<sheets;i++ )
		{
			if(wb.getSheetName(i).equalsIgnoreCase("sheet1")) {
				XSSFSheet sheet =wb.getSheetAt(i);
				
				
				String s1=sheet.getRow(i).getCell(i).getStringCellValue();
				System.out.println(s1);
			}
			
		}
		
		
//		XSSFSheet sheet = new XSSFSheet(wb);
	

}
}
