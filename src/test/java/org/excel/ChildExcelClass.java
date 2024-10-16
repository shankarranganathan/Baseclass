package org.excel;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class ChildExcelClass extends ExceldataBase{
public static void main(String[] args) throws IOException {
	//browerlaunch("chrome");
	//url("https://www.facebook.com/");
	//WebElement findele = findele("name","email");
	//WebElement findele2 = findele("name","pass");
	String path="C:\\Users\\HP\\eclipse-workspace\\AbcSelnium\\src\\test\\resources\\Test\\StringFrame.xlsx";
	//String open = FileOpen(path,"sheet1",1,0);
	//send(findele,open);
	//String fileOpen = FileOpen(path,"sheet1",1,1);
	//send(findele2,fileOpen);
	for (int i = 0; i < 4; i++) {
		browerlaunch("chrome");
		url("https://www.facebook.com/");
		WebElement findele = findele("name","email");
		for (int j = 0; j <=0 ; j++) {
			 String fileOpen2 = FileOpen(path,"sheet1",i,j);
				send(findele,fileOpen2);
				for (int k = 1; k <=1; k++) {
					WebElement findele2 = findele("name","pass");
					String fileOpen3 = FileOpen(path,"sheet1",i,k);
					send(findele2,fileOpen3);
					
				}
		}
		
	}
}

}
