package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fblogin extends ExceldataBase {
	public fblogin() {
		PageFactory.initElements(d,this);
		
	}
@FindBy(id="email")
private WebElement username;
@FindBy(id="pass")
private WebElement password;
public WebElement getUserName() {
	return username;
}
public WebElement getPassWord() {
	return password;
}
}
