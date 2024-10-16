package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class junit4 extends BaseClass{
	public junit4() {
		PageFactory.initElements(d, this);
	}
@FindBy (id="first_name")
private WebElement first;

@FindBy (id="last_name")
private WebElement last;

@FindBy (id="address")
private WebElement add;

@FindBy (id="cc_num")
private WebElement cc_num;

@FindBy (id="cc_type")
private WebElement type;

@FindBy (id="cc_exp_month")
private WebElement cc_exp_month;

@FindBy (id="cc_exp_year")
private WebElement expyear;

@FindBy (id="cc_cvv")
private WebElement cc_cvv;


@FindBy (id="book_now")
private WebElement book_now;


public WebElement getFirstName() {
	return first;
}

public WebElement getLastName() {
	return last;
}

public WebElement getAddress() {
	return add;
}
public WebElement getccNum() {
	return cc_num;
}
public WebElement getccType() {
	return type;
	
}
public WebElement getccMonth() {
	return cc_exp_month;
}
public WebElement getccCvv() {
	return cc_cvv;
}
public WebElement getbookNow() {
	return book_now;
}
public WebElement getExp() {
	return expyear;
}
}
