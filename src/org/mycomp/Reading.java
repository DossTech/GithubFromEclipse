package org.mycomp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\data\\ReadExcel.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		int rows = sheet.getLastRowNum();
		short cells = sheet.getRow(0).getLastCellNum();
		System.out.println(rows+1);
		System.out.println(cells);
		
		for (int i = 0; i <=rows; i++) {
					for (int j = 0; j <cells; j++) {
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(j);
			
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			}
		}
	
		
		

	
	


	}

}
