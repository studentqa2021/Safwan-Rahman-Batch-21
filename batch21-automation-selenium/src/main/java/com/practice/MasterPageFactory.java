package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory 
{	
	public MasterPageFactory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@name='userName']")
	private WebElement User;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement SignIn;

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
