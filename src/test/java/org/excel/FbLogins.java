package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogins extends BaseClass {
	
		public FbLogins() {
			PageFactory.initElements(d, this);
		
	}
@FindBy(id="email")
private WebElement username;

@FindBy(id="pass")
private WebElement password;
public WebElement getUserName() {
	return username;
}
public WebElement getPassword() {
	return password;
}
}
