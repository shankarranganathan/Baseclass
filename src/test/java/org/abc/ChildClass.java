package org.abc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ChildClass extends SeliniumFrame {
	public static void main(String[] args) throws InterruptedException {
		browerLauch("chrome");
		url("https://www.facebook.com/");
		//WebElement findele = findele("id","email");
		//send(findele,"shankar");
		//WebElement findele2 = findele("id","pass");
		//send(findele2,"9840170521");
		//WebElement findele3 = findele("name","login");
		//click(findele3);
		//browerLauch("mozilla");
		//url("https://greenstech.in/selenium-course-content.html");
		//WebElement findele4 = findele("xpath","//div[text()='Courses ']");
		//action(findele4);
		 //WebElement findele5 = findele("xpath","//a[contains(text(),' Contact Us')]");
		 //rightclick(findele5);
		WebElement create = findele("xpath","//a[contains(text(),'Create new account')]");
		click(create);
		Thread.sleep(5000);
		WebElement day = findele("id","day");
		dropDown(day, 9);
	}

}
