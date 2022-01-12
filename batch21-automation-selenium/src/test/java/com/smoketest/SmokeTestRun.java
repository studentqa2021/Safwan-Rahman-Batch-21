package com.smoketest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testrun.JavaCollectionPractice;

public class SmokeTestRun 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); //driver path
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://amazon.com/");
	}
}
