package com.pagelibrary.com.ranford;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import excel.Excel;
import screenshot.Screen;
import testbase.TestBase;

public class Repository extends TestBase
{
	WebDriver driver;
	public void launch(String url, String browser)
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", getchromepath("chromepath"));
			
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(getbuild2("build2"));
		
		driver.manage().window().maximize();
		
		Screen.screenshot(driver, "launch");
		
	}
	
	public void login()
	{
		
		LoginPage.username(driver).sendKeys(getusername("username"));
		
		LoginPage.password(driver).sendKeys(getpassword("password"));
		
		LoginPage.login(driver).click();
		
		Screen.screenshot(driver, "login");
	}
	
	public void new_branch(String bname, String add1, String zip, String country, String state, String city)
	{
		
		//AdminPage.branch(driver).click();
		
		Create_Branch.new_branch(driver).click();
		
		NewBranch.branch_name(driver).sendKeys(bname);
		
		NewBranch.address_1(driver).sendKeys(add1);
		
		/*NewBranch.address_2(driver).sendKeys("wxyz12");
		
		NewBranch.address_3(driver).sendKeys("wxyz14");
		
		NewBranch.area(driver).sendKeys("wxyz16");*/
		
		NewBranch.zipcode(driver).sendKeys(zip);
		
		NewBranch.country(driver).selectByVisibleText(country);
		
		NewBranch.state(driver).selectByVisibleText(state);
		
		NewBranch.city(driver).selectByVisibleText(city);
		
		NewBranch.submit_btn(driver).click();
		
		Screen.alertScreenshot(driver, "branch_alert");
		
		//Generic.isAlertPresent(driver);
	}
		
	public void new_employee(String empName, String loginPass, String role, String brname)
	{
		
		//AdminPage.employee(driver).click();
		
		Create_Employee.new_employee(driver).click();
		
		New_Employee.employer_name(driver).sendKeys(empName);
		
		New_Employee.login_password(driver).sendKeys(loginPass);
		
		New_Employee.role(driver).selectByVisibleText(role);
		
		New_Employee.branch(driver).selectByVisibleText(brname);
		
		New_Employee.submit_b(driver).click();	
		
		Screen.alertScreenshot(driver, "emp_alert");
		
		//Generic.isAlertPresent(driver);
		
		
	}
	
	public Object[][] Excel_content(String filename, String sheetname)
	{
		Excel.excel_connection(filename, sheetname);
		
		int rr=Excel.rowcount();
		
		int cc=Excel.colcount();
		
		String[][] obj=new String [rr-1][cc];
		
		for (int r = 1; r < rr; r++) 
		{
			for (int c = 0; c < cc; c++) 
			{
				obj[r-1][c]=Excel.readdata(c, r);
			}
		}
		return obj;
		
	}
	
	public void logout()
	{
		New_Employee.logout(driver).click();
		driver.quit();
	}
	
	
	
		
}
