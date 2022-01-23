package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BaseLogin 
{
	public BaseLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@name='userName']")
	private WebElement User;
	@FindBy(xpath="//*[@name='password']")
	private WebElement Password;
	@FindBy(xpath="//*[@type='submit']")
	private WebElement SignIn;
	
	
	public void getLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); //driver path
		WebDriver driver = new ChromeDriver();//upcasting 
		driver.get("https://demo.guru99.com/test/newtours/"); //popular method 
		BaseLogin obj = new BaseLogin(driver);
		obj.getUser().sendKeys("smarttech");
		obj.getPassword().sendKeys("student");
		obj.getSignIn().click();
	 }
	
	public WebElement getUser() 
	{
		return User;
	}
	public WebElement getPassword()
	{
		return Password;
	}
	public WebElement getSignIn() 
	{
		return SignIn;
	}
}
