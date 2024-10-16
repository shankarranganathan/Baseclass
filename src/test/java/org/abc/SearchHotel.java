package org.abc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass{
	public SearchHotel() {
		PageFactory.initElements(d, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	@FindBy(id="continue")
	private WebElement continued;
	public WebElement getradioutton() {
		return radio;
	}
	public WebElement getcontinue() {
		return continued;
	}
}


