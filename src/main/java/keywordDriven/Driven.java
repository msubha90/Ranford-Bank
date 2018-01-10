package keywordDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import excel.Excel;

public class Driven {
	
	WebDriver driver;
	
	@Test
	public void excel_keyword()
	{
		Excel.excel_connection("keyword_driven.xls", "kwdrvn");
		
		for(int i=1; i<Excel.rowcount();i++)
		{
			String Loctype=Excel.readdata(2, i);
			String Locprop=Excel.readdata(3, i);
			String Keyword=Excel.readdata(4, i);
			String Input=Excel.readdata(5, i);
			
			switch(Keyword)
			{
				
			case "editbox":
				driver.findElement(LocRepository.locvalue(Loctype, Locprop)).sendKeys(Input);
				break;
				
			case "btn":	
				driver.findElement(LocRepository.locvalue(Loctype, Locprop)).click();
				break;
				
			case "alert":
				driver.switchTo().alert().accept();
				break;
				
			case "wait":
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				break;
				
			case "dropdown":
				new Select(driver.findElement(LocRepository.locvalue(Loctype, Locprop))).selectByVisibleText(Input);
				break;
						
			}
		}
			
	}
	
	@BeforeTest
	public void launchbr()
	{
		driver= new FirefoxDriver();
	}

}
