package com.smoketest;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.generic.Baselogin;

public class SmokeTest 
{
	Logger logger = Logger.getLogger(SmokeTest.class);
	@Test
	public void getSignin() throws Throwable
	{
		Baselogin obj = new Baselogin();
		obj.getLogin();
	}	
}

