package org.excel;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Junit extends BaseClass{
	String path="C:\\Users\\HP\\eclipse-workspace\\AbcSelnium\\src\\test\\resources\\Test\\JUNT.xlsx";
	
	@BeforeClass
	public static  void bc() {
		browerlaunch("chrome");
		Loadurl("https://adactinhotelapp.com/index.php");}
	@Test
	public void tc() throws IOException, InterruptedException {
		TestNgpom  tn=new TestNgpom();
		WebElement userName = tn.getUserName();
		passValue(userName, excelRead(path, "sheet1", 0, 0));
		WebElement passWord = tn.getPassWord();
		passValue(passWord, excelRead(path, "sheet1", 0, 1));
		click(elementFind("name", "login"));
		
		
		
		
		Jnit2 j=new Jnit2();
		WebElement location = j.getLocation();
		dropDown(location, 2);
		
		WebElement hotel = j.getHotel();
		dropDown(hotel, 2);
		
		WebElement room_type = j.getRoom_type();
		dropDown(room_type, 1);
		
		WebElement roomNos = j.getRoomNos();
		dropDown(roomNos, 3);
		
		WebElement adult_room = j.getAdult_room();
		dropDown(adult_room, 1);
		
		WebElement getchildRoom = j.getchildRoom();
		dropDown(getchildRoom, 2);
		
		WebElement submit = elementFind("id","Submit");
		click(submit);
		
		junit3 ju=new junit3();
		WebElement radio = ju.getradioutton();
		click(radio);
		
		WebElement continued = ju.getcontinue();
		click(continued);
		
		junit4 j4=new junit4();
		WebElement firstName = j4.getFirstName();
		passValue(firstName, excelRead(path, "sheet1", 1, 0));
		
		WebElement lastName = j4.getLastName();
		passValue(lastName,excelRead(path, "sheet1", 1, 1));
		
		WebElement address = j4.getAddress();
		passValue(address, excelRead(path, "sheet1", 0, 2));
		
		WebElement getccNum = j4.getccNum();
		passValue(getccNum, excelRead(path, "sheet1", 0, 3));
		
		WebElement getccType = j4.getccType();
		dropDown(getccType, 1);
		
		WebElement getccMonth = j4.getccMonth();
		dropDown(getccMonth, 2);
		
		WebElement exp = j4.getExp();
		dropDown(exp, 2);
		
		WebElement getccCvv = j4.getccCvv();
		passValue(getccCvv, excelRead(path, "sheet1", 1, 3));
		
		WebElement getbookNow = j4.getbookNow();
		click(getbookNow);
		
	}
		@AfterClass
		public static void ac() throws IOException {
			screenshot();

		}
		

}
