package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Create_Branch 
{
	public static WebElement new_branch(WebDriver driver)
	{
		return driver.findElement(By.id("BtnNewBR"));
	}
	
	
}
