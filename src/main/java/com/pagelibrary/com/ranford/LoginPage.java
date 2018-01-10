package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	
	public static WebElement username(WebDriver driver)
	{
		return driver.findElement(By.id("txtuId"));
	}
	
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.id("txtPword"));
	}
	
	public static WebElement login(WebDriver driver)
	{
		return driver.findElement(By.id("login"));
	}
	
	
	
}
