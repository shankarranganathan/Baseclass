package org.abc;

import org.openqa.selenium.WebElement;

public class ChildClasfb extends SeliniumFrame{
	public static void main(String[] args) {
		browerLauch("chrome");
		url("https://www.facebook.com/");
		Fblogin fb=new Fblogin();
		WebElement userName = fb.getUserName();
		send(userName,"shankar");
		
		WebElement password = fb.getPassword();
		send(password,"9840170521");
		
		
		WebElement findele3 = findele("name","login");
		
		send(password,"9840170521");
		click(findele3);
		
		ref();
		send(userName,"hanisika");
		send(password,"9840170521");
		click(findele3);
	}

}
