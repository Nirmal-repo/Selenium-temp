package com.qa.seleniumlearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NosuchElementExcpetion {

	
  static WebDriver driver =null;
  static String baseUrl="https://learn.letskodeit.com";
	
	@Test
	public void noSuchElementException() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
		
		//1. Timing issue 
		
		driver.findElement(By.xpath("//a[@href='/sign_in']"));
		WebElement field_element =driver.findElement(By.cssSelector("#user_email"));

		field_element.sendKeys("testing");
		
	}
}
