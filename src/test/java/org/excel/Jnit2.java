package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jnit2 extends BaseClass{
	public Jnit2() {
		PageFactory.initElements(d,this);
		
	}
	@FindBy(id="location")
	private WebElement locations;
	
	@FindBy(id="hotels")
	private WebElement hotelss;
	
	@FindBy(id="room_type")
	private WebElement room_types;
	
	@FindBy(id="room_nos")
	private WebElement room_noss;
	
	@FindBy(id="adult_room")
	private WebElement adult_rooms;
	
	@FindBy(id="child_room")
	private WebElement child_rooms;
	
	public WebElement getLocation() {
		return locations;
	}
	
	public WebElement getHotel() {
		return hotelss;
	}
	
	public WebElement getRoom_type() {
		return room_types;
	}
	public WebElement getRoomNos() {
		return room_noss;
	}
	public WebElement getAdult_room() {
		return adult_rooms;
	}
	public WebElement getchildRoom() {
		return child_rooms;
	}
}
