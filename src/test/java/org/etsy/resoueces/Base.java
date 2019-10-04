package org.etsy.resoueces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver=null;
	public static void launch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowjanya\\eclipse-workspace\\Selenium\\Driver\\chromedriver1.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	public static void send(WebElement e,String msg) {
		e.sendKeys(msg);
		
	}
	public static void clk(WebElement e) {
		e.click();

	}
	}


