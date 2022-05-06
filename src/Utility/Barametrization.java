package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Barametrization {

	public static String getTestData(int row, int cell, String Sheetname) throws IOException {
		
		FileInputStream File = new FileInputStream ("C:\\Users\\vrush\\OneDrive\\Documents\\Book1.xlsx");
		String value = WorkbookFactory.create(File).getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		System.out.println(value);
		return value;
	}
}
