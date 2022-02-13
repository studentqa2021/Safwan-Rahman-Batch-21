package com.smoketest;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.utili.DriverManager;
import com.generic.BaseLoginPractice;


public class SmokeTestPractice {
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		driver = DriverManager.getDriverManager();
	}
	
	@Test
	public void getLogin() throws Exception
	{
		BaseLoginPractice obj = new BaseLoginPractice();
		obj.getLogin();
	}
	@AfterTest
	public void quit(){
		driver.quit();
	}
}
