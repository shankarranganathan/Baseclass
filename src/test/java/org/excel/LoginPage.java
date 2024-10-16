package org.excel;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
	String path="C:\\Users\\HP\\eclipse-workspace\\AbcSelnium\\src\\test\\resources\\Test\\StringFrame.xlsx";
	browerlaunch("chrome");
	Loadurl("https://www.facebook.com/");
	FbLogins fb=new FbLogins();
	WebElement userName = fb.getUserName();
	 
	passValue(userName, excelRead(path,"sheet1", 1, 0));
	WebElement password = fb.getPassword();
	
 
	 passValue(password, excelRead(path,"sheet1", 1, 1));
	  
	 click(elementFind("name", "login"));
	 ref();
	 
	Thread.sleep(5000);
	ref();
	 passValue(userName,  excelRead(path,"sheet1", 1, 2));
	 
	 
	 passValue(password, excelRead(path,"sheet1", 1, 3));
	 click(elementFind("name", "login"));
	
	 
	
	 
	
	
	}
	
}
