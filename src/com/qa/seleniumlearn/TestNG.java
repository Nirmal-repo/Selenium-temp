package com.qa.seleniumlearn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG {
	
	
	
	@BeforeMethod
	public void setup() {
		System.out.println("Hi TESTNG started.........");
	}
	

	@AfterMethod
	public void testEnd() {
		System.out.println("Hi testNg ended.........");
	}
	
	
	@Parameters("a")
	@Test
	public void actualTest(String s) {
		
		System.out.println("Hi I am actual Test :"+s);
	}

}
