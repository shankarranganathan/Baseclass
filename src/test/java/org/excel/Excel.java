package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {
public static void main(String[] args) throws InvalidFormatException, IOException {
	File f=new File("C:\\Users\\HP\\eclipse-workspace\\AbcSelnium\\src\\test\\resources\\Test\\StringFrame.xlsx");

	FileInputStream fi=new FileInputStream(f);
	
	Workbook w=new XSSFWorkbook(fi);
	Sheet sheet = w.getSheet("sheet1");
	int pnr = sheet.getPhysicalNumberOfRows();
	for (int i = 0; i < pnr; i++) {
		Row row = sheet.getRow(i);
		int pnc = row.getPhysicalNumberOfCells();
		for (int j = 0; j <pnc ; j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			switch (cellType) {
			case STRING:
					String scv = cell.getStringCellValue();
					System.out.println(scv);
				break;
			case NUMERIC:
			boolean cdf = DateUtil.isCellDateFormatted(cell);
			if (cdf==true) {
				Date dcv = cell.getDateCellValue();
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
				String format = sdf.format(dcv);
				System.out.println(format);
			}
			else {
				double ncv = cell.getNumericCellValue();
				long l=(long) ncv;
				System.out.println(l);
			}
			
			}
			}
	}
}
}
