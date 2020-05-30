package com.qa.seleniumlearn;

public class ChildTestClass extends BaseTest {
	
	public  ChildTestClass() {
		super();
		
	}
	

	
	@org.testng.annotations.Test
	public void Test()
	{
		System.out.println(" I am from Test");
	}
}
