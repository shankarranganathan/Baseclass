package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExceldataBase {
	static WebDriver d;
	public static void browerlaunch(String br) {
		if (br.equals("chrome")) {
			d=new ChromeDriver();
		}
		else if(br.equals("mozilla")) {
			d=new FirefoxDriver();
		}
		else if(br.equals("edge")) {
			d=new EdgeDriver();
		}
		else {
			throw new IllegalArgumentException();
		}
	
	}
	public static void url(String urls) {
		d.get(urls);

	}
	static WebElement element;
	public static WebElement findele(String ids,String value) {
		switch (ids) {
		case "id":
			element = d.findElement(By.id(value));
			break;
		case "name":
		element=d.findElement(By.name(value));
		break;
		case "xpath":
			element=d.findElement(By.xpath(value));
			break;
			
		}
		return element;
	}
	public static void send(WebElement ref,String value) {
		ref.sendKeys(value);
	}
	public static void click(WebElement ref) {
	ref.click();

	}
	public static String FileOpen(String path,String sheet,int rownum,int cellno) throws IOException {
		File f=new File(path);
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet sheet1 = w.getSheet(sheet);
		Row row = sheet1.getRow(rownum);
		Cell cell = row.getCell(cellno);
		CellType cellType = cell.getCellType();
		String data=null;
		switch(cellType) {
		case STRING:
			String scv = cell.getStringCellValue();
			data=scv;
			break;
		case NUMERIC:
			boolean cellDateFormatted = DateUtil.isCellDateFormatted(cell);
			if(cellDateFormatted==true) {
				Date dcv = cell.getDateCellValue();
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
				String format = sdf.format(dcv);
				data= format;
				
			}else {
				double ncv = cell.getNumericCellValue();
				long l=(long)ncv;
				if(l==ncv) {
					String string = Long.toString(l);
					data=string;
				}
				else {
					
					String string = Double.toString(ncv);
					data=string;
				}
			}
		}
		return data;
	}
	public static void ref() {
		d.navigate().refresh();

	}
	

	}


