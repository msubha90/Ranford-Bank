package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Create_Employee 
{
	public static WebElement new_employee(WebDriver driver)
	{
		return driver.findElement(By.id("BtnNew"));
	}
	
}
