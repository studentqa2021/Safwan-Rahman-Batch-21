package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.utili.Baseconfig;
import com.utili.DriverManager;
import com.utili.Highlighter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLoginPractice 
{

	
	public void getLogin() throws Exception
	{
		WebDriverManager.chromedriver().setup();
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
		
		 driver.quit();
	}
}
