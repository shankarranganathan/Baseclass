package org.abc;

import java.io.IOException;

import org.excel.Jnit2;
import org.excel.TestNgpom;
import org.excel.junit3;
import org.excel.junit4;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Adactln extends BaseClass {
String path="C:\\Users\\HP\\eclipse-workspace\\AbcSelnium\\src\\test\\resources\\Test\\JUNT.xlsx";
	
	@BeforeClass
	public static  void bc() {
		browerlaunch("chrome");
		Loadurl("https://adactinhotelapp.com/index.php");}
	PageManager p=new PageManager();
	@Test
	public void tc() throws IOException, InterruptedException {
		Logins logins = p.getLogins();
		WebElement userName = logins.getUserName();
		passValue(userName, excelRead(path, "sheet1", 0, 0));
		
		WebElement passWord = logins.getPassWord();
		passValue(passWord, excelRead(path, "sheet1", 0, 1));
		click(elementFind("name", "login"));
		
		
		
		
		Hotellogin hotellogin = p.getHotellogin();
		WebElement location = hotellogin.getLocation();
		dropDown(location, 2);
		
		WebElement hotel = hotellogin.getHotel();
		dropDown(hotel, 2);
		
		WebElement room_type = hotellogin.getRoom_type();
		dropDown(room_type, 1);
		
		WebElement roomNos = hotellogin.getRoomNos();
		dropDown(roomNos, 3);
		
		WebElement adult_room = hotellogin.getAdult_room();
		dropDown(adult_room, 1);
		
		WebElement getchildRoom = hotellogin.getchildRoom();
		dropDown(getchildRoom, 2);
		
		WebElement submit = elementFind("id","Submit");
		click(submit);
		
		SearchHotel searchHotel = p.getSearchHotel();
		WebElement radio = searchHotel.getradioutton();
		click(radio);
		
		WebElement continued = searchHotel.getcontinue();
		click(continued);
		
		BookHotel bookHotel = p.getBookHotel();
		WebElement firstName = bookHotel.getFirstName();
		passValue(firstName, excelRead(path, "sheet1", 1, 0));
		
		WebElement lastName = bookHotel.getLastName();
		passValue(lastName,excelRead(path, "sheet1", 1, 1));
		
		WebElement address = bookHotel.getAddress();
		passValue(address, excelRead(path, "sheet1", 0, 2));
		
		WebElement getccNum = bookHotel.getccNum();
		passValue(getccNum, excelRead(path, "sheet1", 0, 3));
		
		WebElement getccType = bookHotel.getccType();
		dropDown(getccType, 1);
		
		WebElement getccMonth = bookHotel.getccMonth();
		dropDown(getccMonth, 2);
		
		WebElement exp = bookHotel.getExp();
		dropDown(exp, 2);
		
		WebElement getccCvv = bookHotel.getccCvv();
		passValue(getccCvv, excelRead(path, "sheet1", 1, 3));
		
		WebElement getbookNow = bookHotel.getbookNow();
		click(getbookNow);
		
	}
		@AfterClass
		public static void ac() throws IOException {
			screenshot();

		}
		

}



