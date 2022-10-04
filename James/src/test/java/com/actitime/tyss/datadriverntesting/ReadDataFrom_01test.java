package com.actitime.tyss.datadriverntesting;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFrom_01test {
@Test
	public static void ReadDataFrom() throws Throwable {

		FileInputStream fis = new FileInputStream("./src/test/resource/jimmyBook1.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String url = cell.getStringCellValue();
		System.out.println(url);
		workbook.close();
		
	}

}
