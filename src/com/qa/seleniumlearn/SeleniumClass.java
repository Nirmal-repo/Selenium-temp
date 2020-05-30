package com.qa.seleniumlearn;

import java.awt.List;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumClass {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Wait fluentWait;
	public static Actions action;
	
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setupDriver() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		wait = new WebDriverWait(driver, 10);	
		fluentWait=new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		action =new Actions(driver);
		
		driver.get("https://www.google.com");
		
	}
	
	@Test
	public void test() {
		System.out.println("Hellow");
		WebElement element = driver.findElement(By.xpath(""));
		WebElement element1 = driver.findElement(By.xpath(""));
		
		// code to double code 
		action.doubleClick(element).build().perform();
	
		//right click
		action.contextClick(element).build().perform();
	
		//mouser hvoer 
		action.moveToElement(element).build().perform();
		
		//drag and rop 
		action.dragAndDrop(element, element1).build().perform();
		
		driver.getCurrentUrl();
		driver.navigate().to(driver.getCurrentUrl());
		
		//find all the links 
	       java.util.List<WebElement> list = driver.findElements(By.tagName("a"));
		
		//takes Screen shot 
	/*	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copy(scrFile , new File(path));*/
		
		//handle drop down in selenoum 
		
		Select dropdown = new Select(element);  
		dropdown.selectByIndex(32);
        //
		element.isDisplayed();
		
		element.isEnabled();
		element.isSelected();
		
		//Window Ui and pop up 
		
		//SSL certification ---- 
		//FireFox 
		System.out.println("*************FireFox Profile***************");
		FirefoxProfile fprofile = new FirefoxProfile();
		fprofile.setAcceptUntrustedCertificates(true);
		fprofile.setAssumeUntrustedCertificateIssuer(true);
		
		
		System.out.println("*************Chrome Profile***************");
		
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setAcceptInsecureCerts(true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		System.out.println("*************IE Profile***************");
		
		DesiredCapabilities dc2 = DesiredCapabilities();
		dc2.setAcceptInsecureCerts(true);
		dc2.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		JavascriptExecutor jc = ((JavascriptExecutor)driver);
		//jc.executeScript(element,element1);
		
		// handle Alert 
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.getText();
		
		
		// Handle hidden element : hidden element can be perform by using the hidden element.
		
		
		System.out.println("************************TESTNG***************************");
		
		
		
		
		
		
		
	}
	private DesiredCapabilities DesiredCapabilities() {
		// TODO Auto-generated method stub
		return null;
	}

	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	

}
