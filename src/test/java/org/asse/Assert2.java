package org.asse;

import static org.testng.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assert2 {
	static WebDriver d;
	@BeforeClass
	public static void bc() {
		 d=new ChromeDriver();
		d.get("https://adactinhotelapp.com/");
	}
	@Test
	public void tc() {
		
		d.findElement(By.id("username")).sendKeys("shankarR");
		d.findElement(By.id("password")).sendKeys("KV2Y4K");
		d.findElement(By.id("login")).click();
		String act = d.getTitle();
		String exp="Adactin.com - Search Hotel";
		assertEquals(act,exp,"invalidloginid");
		System.out.println("correct login id");
		
	}
		
		
		
	}


