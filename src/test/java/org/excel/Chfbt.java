package org.excel;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Chfbt extends ExceldataBase {
	public static void main(String[] args) throws IOException {
		browerlaunch("chrome");
		url("https://www.facebook.com/");
		fblogin fb=new fblogin();
		
		WebElement userName = fb.getUserName();
		
		WebElement login = findele("name","login");
		String path="C:\\Users\\HP\\eclipse-workspace\\AbcSelnium\\src\\test\\resources\\Test\\StringFrame.xlsx";
		String first = FileOpen(path,"sheet1",1,0);
		send(userName,first);
		WebElement passWord = fb.getPassWord();
		String second = FileOpen(path,"sheet1",1,1);
		send(passWord,second);
	
		click(login);
		ref();
		ref();
		
		String third = FileOpen(path,"sheet1",1,2);
		send(userName,third);
		String fourth = FileOpen(path,"sheet1",1,3);
		send(passWord,fourth);
		WebElement findele = findele("name","login");
		click(findele);
		
	}

}
