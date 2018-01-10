package com.pagelibrary.com.ranford;

import org.openqa.selenium.WebDriver;

public class Generic 
{
	public static void isAlertPresent(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	
	}
	
	
}
