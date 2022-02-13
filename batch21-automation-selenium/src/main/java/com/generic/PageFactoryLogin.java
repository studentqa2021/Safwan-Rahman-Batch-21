package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLogin //Reserve word -> Page Factory or page object model >> store all xpath = repository
//What is a Page Factory?->  Repository that holds all xpaths.							 
//Why do we need Page Factory? -> To make it easier when there are any issues
//How? ->Encapsulation
{
	public PageFactoryLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@name='userName']")
	private WebElement User;
	@FindBy(xpath="//*[@name='password']")
	private WebElement Password;
	@FindBy(xpath="//*[@type='submit']")
	private WebElement SignIn;
	@FindBy(xpath="(//*[@class='mouseOut'])[8]")
	private WebElement signOut;
	@FindBy(xpath="//*[text()='Login Successfully']")
	private WebElement successfulPass;
	
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
	public WebElement getSignOut() 
	{
		return signOut;
	}
	public WebElement getSuccessfulPass() 
	{
		return successfulPass;
	}
}
