package com.pagelibrary.com.ranford;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import excel.Excel;
import web_table.WebTable;


public class TestExecution extends Repository
{
	@Parameters({"url", "browser"})
	@BeforeTest
	public void verify_launch(String url, String browser)
	{
		launch(url, browser);
	}
	
	@Test(priority=0)
	public void verify_login()
	{
		login();
	}
	
	
	/*@Test(priority=1, dataProvider="branchdata")
	public void verify_new_branch(String bname, String add1, String zip, String country, String state, String city)
	{
		new_branch(bname, add1, zip, country, state, city);
	}*/
	
	/*@Test(priority=2, dataProvider="employeedata")
	public void verify_new_employee(String empName, String loginPass, String role, String brname)
	{
		new_employee(empName, loginPass, role, brname);
	}*/
	/*
	@DataProvider(name="branchdata")
	public Object[][] verify_excel()
	{
		return Excel_content("ranford_bank.xls", "Branch");
	}
	*/
	/*@DataProvider(name="employeedata")
	public Object[][] verify_excel2()
	{
		return Excel_content("ranford_bank.xls", "Employee");
	}*/
	@AfterTest
	public void verify_logout()
	{
		logout();
	}
	@Test(priority=1)
	public void verify_output_excel_content_branch()
	{
		Excel.excel_connection("ranford_bank.xls", "Branch");
		
		Excel.ouput_excel_connection("ranford_bank.xls", "Branch", "outputdata5.xls");
		
		AdminPage.branch(driver).click();
		
		for(int i=1; i<Excel.rowcount();i++)
		{
			new_branch(Excel.readdata(0	, i), Excel.readdata(1	, i), Excel.readdata(2	, i), Excel.readdata(3	, i), Excel.readdata(4	, i), Excel.readdata(5	, i));
			
			String alert= driver.switchTo().alert().getText();
			
			driver.switchTo().alert().accept();
			
			if(alert.contains("already Exist")) 
			{
				Excel.writedata(6, i, alert);
			}
			
			else if(alert.contains("created Sucessfully")) 
			{
				Excel.writedata(6, i, alert);
			}
			
			else
			{
				Excel.writedata(6, i, "failed");
			}
		}
		
		Excel.saveworkbook();
	}
	
	@Test(priority=3)
	public void verify_handle_table()
	{
		WebTable.handlingTable(driver, "edit");
	}
	@Test(priority=2)
	public void verify_output_excel_content_employee()
	{
		Excel.excel_connection("ranford_bank.xls", "Employee");
		
		Excel.ouput_excel_connection("ranford_bank.xls", "Employee", "outputdata6.xls");
		
		AdminPage.employee(driver).click();
		
		for(int i=1; i<Excel.rowcount();i++)
		{
			new_employee(Excel.readdata(0, i), Excel.readdata(1, i), Excel.readdata(2, i), Excel.readdata(3, i));
			
			String alert= driver.switchTo().alert().getText();
			
			driver.switchTo().alert().accept();
			
			if(alert.contains("Already Existed")) 
			{
				Excel.writedata(6, i, alert);
			}
			
			else if(alert.contains("created Sucessfully")) 
			{
				Excel.writedata(6, i, alert);
			}
			
			else
			{
				Excel.writedata(6, i, "failed");
			}
		}
		
		Excel.saveworkbook();
	}
}
