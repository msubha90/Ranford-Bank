package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewBranch 
{
	public static WebElement branch_name(WebDriver driver)
	{
		return driver.findElement(By.id("txtbName"));
	}
	
	public static WebElement address_1(WebDriver driver)
	{
		return driver.findElement(By.id("txtAdd1"));
	}
	
	public static WebElement address_2(WebDriver driver)
	{
		return driver.findElement(By.id("Txtadd2"));
	}

	public static WebElement address_3(WebDriver driver)
	{
		return driver.findElement(By.id("txtadd3"));
	}
	
	public static WebElement area(WebDriver driver)
	{
		return driver.findElement(By.id("txtArea"));
	}
	
	public static WebElement zipcode(WebDriver driver)
	{
		return driver.findElement(By.id("txtZip"));
	}
	
	public static Select country(WebDriver driver)
	{
		return new Select(driver.findElement(By.id("lst_counrtyU")));
	}
	
	public static Select state(WebDriver driver)
	{
		return new Select(driver.findElement(By.id("lst_stateI")));
	}
	
	public static Select city(WebDriver driver)
	{
		return new Select(driver.findElement(By.id("lst_cityI")));
	}
	
	public static WebElement submit_btn(WebDriver driver)
	{
		return driver.findElement(By.id("btn_insert"));
	}
	
	public static WebElement reset_btn(WebDriver driver)
	{
		return driver.findElement(By.id("Btn_Reset"));
	}
	
	public static WebElement cancel_btn(WebDriver driver)
	{
		return driver.findElement(By.id("Btn_cancel"));
	}
}
