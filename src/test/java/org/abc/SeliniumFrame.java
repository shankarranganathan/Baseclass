package org.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeliniumFrame {
	static WebDriver d;
public static void browerLauch(String br) {
	if (br.equals("chrome")) {
		d=new ChromeDriver();
		
	}
	else if(br.equals("mozilla")) {
		d=new FirefoxDriver();
	}
	else if(br.equals("edge")) {
		d=new EdgeDriver();
	}
	else {
		throw new IllegalArgumentException();
	}
	
			}
		public static void url(String urls) {
			d.get(urls);

		}
		static WebElement element;
		public static WebElement findele(String ids,String value) {
			switch (ids) {
			case "id":
				element = d.findElement(By.id(value));
				break;
			case "name":
			element=d.findElement(By.name(value));
			break;
			case "xpath":
				element=d.findElement(By.xpath(value));
				break;
				
			}
			return element;
		}
		public static void send(WebElement ref,String value) {
			ref.sendKeys(value);
		}
		public static void click(WebElement ref) {
		ref.click();

		}
		static Actions a;
		public static void action(WebElement ao) {
			a=new Actions(d);
			a.moveToElement(ao).perform();;

		}
		public static void rightclick(WebElement ao) {
			a.contextClick(ao).perform();

		}
		public static void ref() {
			d.navigate().refresh();

		}
		public static void dropDown(WebElement ref,int num) {
			Select s=new Select(ref);
			s.selectByIndex(num);

		}
	

}
