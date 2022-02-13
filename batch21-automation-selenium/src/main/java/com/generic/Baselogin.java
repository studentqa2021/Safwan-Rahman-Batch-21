package com.generic;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.asserts.SoftAssert;
import org.testng.log4testng.Logger;
import org.testng.Assert;


import com.generic.PageFactoryLogin;

import com.utili.Highlighter;

import io.github.bonigarcia.wdm.WebDriverManager;

import com.utili.Baseconfig;


	public class Baselogin 
	{
		
		Logger logger = Logger.getLogger(Baselogin.class);
		
		public void getLogin() throws Exception
		{
			//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); //driver path
			WebDriverManager.chromedriver().setup();//New Driver Set up
			WebDriver driver = new ChromeDriver();
			
			
			
			driver.get(Baseconfig.getValue("URL")); //popular method 
			
			PageFactoryLogin pf = new PageFactoryLogin(driver);
			
			Highlighter.getColor(pf.getUser(), driver, "red");
			pf.getUser().sendKeys(Baseconfig.getValue("user"));
			Highlighter.getColor(pf.getPassword(), driver, "green");
			pf.getPassword().sendKeys(Baseconfig.getValue("pass"));
			pf.getSignIn().click();
			
			
			Assert.assertEquals(pf.getSuccessfulPass().getText(), "Login Successfully");//fail=stop
			//Assert.assertTrue(pf.getSignOut().isDisplayed());//stopped here
			
			//SoftAssert soft = new SoftAssert();
			//soft.assertEquals(pf.getSuccessfulPass().getText(), "Login Fail");//fail
			//soft.assertTrue(pf.getSignOut().isDisplayed());
			
			 driver.quit();//came
			// soft.assertAll();
		 }

	}
		


