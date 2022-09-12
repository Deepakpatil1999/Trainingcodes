package com.zoho.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetReadData {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("D:\\ExcelSheet\\Book1.xsls");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
int r=	wb.getNumberOfSheets();
for(int i=0; i<r; i++)
{
	if(wb.getSheetAt(i).getSheetName().equalsIgnoreCase("sheet1"))
	{
		Iterator<Row> rows = wb.getSheetAt(i).rowIterator();
		Row firstrow=rows.next();
		Iterator<Cell> cell=firstrow.cellIterator();
		
		int b=0;
		int column=0;
		while(cell.hasNext())
		{
			if(cell.next().getStringCellValue().equalsIgnoreCase("testcases"))
			{
				column=b;
			}
			b++;
		}
	while(rows.hasNext())
		
	{
		Row r1=rows.next();
		if(r1.getCell(column).getStringCellValue().equalsIgnoreCase("loginpage"))
		{
			
		}
	}
		
		
	}
	
}
		
	}

}
