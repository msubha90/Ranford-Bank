package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class New_Employee 
{
	public static WebElement employer_name(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@name='txtUname']"));
	}
	
	public static WebElement login_password(WebDriver driver)
	{
		return driver.findElement(By.id("txtLpwd"));
	}
	
	public static Select role(WebDriver driver)
	{
		return new Select(driver.findElement(By.id("lst_Roles")));
	}
	
	public static Select branch(WebDriver driver)
	{
		return new Select(driver.findElement(By.id("lst_Branch")));
	}
	
	public static WebElement submit_b(WebDriver driver)
	{
		return driver.findElement(By.id("BtnSubmit"));
	}
	
	public static WebElement logout(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@src='images/admin_but_03.jpg']"));
	}
	
	
}
