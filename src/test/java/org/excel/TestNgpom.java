package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestNgpom extends BaseClass {
public TestNgpom() {
	PageFactory.initElements(d, this);
}
	@FindBy(id="username")
	private WebElement loginame;
	
	@FindBy(id="password")
	private WebElement loginpassword;
	public WebElement getUserName() {
		return loginame;}
	public WebElement getPassWord() {
		return loginpassword;
	}
	}


