package org.asse;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;

import org.apache.logging.log4j.message.Message;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Assertss {
	static WebDriver d;

	@BeforeClass
	public static void bc() {
		d = new ChromeDriver();
		d.get("https://www.facebook.com/");
	}

	@Test

	public void tc() throws InterruptedException {
d.findElement(By.id("email")).sendKeys("9840170521");
d.findElement(By.id("pass")).sendKeys("Shankar1@");
d.findElement(By.name("login")).click();
Thread.sleep(3000);
String act = d.getTitle();
String exp="(9) Facebook";
assertEquals(act, exp,"username or password is invalid");
System.out.println("user name  and password is correct");

	}

}
