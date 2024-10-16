package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldatagiven {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\HP\\eclipse-workspace\\AbcSelnium\\src\\test\\resources\\Test\\StringFrame.xlsx");
	FileInputStream fi=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fi);
	Sheet sheet = w.createSheet("mu2");
	Object a[][]= {{"username","password","doj","mark","phone"},{"shankar",120,"22-05-2024",98.9d,9952083974l},
			{"lalith",121,"22-05-2024",92.2d,233434343989l},{"mani",122,"13-05-2024",93,12312312323l}};
	for (int i = 0; i < a.length; i++) {
		Row row = sheet.createRow(i);
		for (int j = 0; j < a[i].length; j++) {
			Cell cell = row.createCell(j);
			Object data=a[i][j];
			if (data instanceof String) {
				cell.setCellValue((String)data);
			}
			else if(data instanceof SimpleDateFormat) {
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
				String format = sdf.format(data);
				cell.setCellValue(format);
			}
			else if(data instanceof Double) {
				cell.setCellValue((double)data);
			}
			else if(data instanceof Long) {
				cell.setCellValue((long)data);
			}
			else if(data instanceof Integer) {
				cell.setCellValue((int)data);
				
			}
		}
		
	}
	FileOutputStream fo=new FileOutputStream(f);
	w.write(fo);
	
}
}
