package com.smoketest;

import org.openqa.selenium.WebDriver;

import com.practice.BaseLogin;

public class SmokeTest 
{
	static WebDriver driver;
	
	public static void main(String[] args)throws InterruptedException
	{
		BaseLogin obj = new BaseLogin(driver);
		
		obj.getLogin();
	}
	
	
}
