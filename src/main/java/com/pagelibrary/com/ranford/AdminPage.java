package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage 
{

	public static WebElement branch(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@src='images/Branches_but.jpg']"));
	}
	
	public static WebElement roles(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@src='images/Roles_but.jpg']"));		
	}
	
	public static WebElement users(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@src='images/Users_but.jpg']"));
	}
	
	public static WebElement employee(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@src='images/emp_btn.jpg']"));
	}
	
}
