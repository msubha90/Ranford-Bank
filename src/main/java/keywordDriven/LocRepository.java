package keywordDriven;

import org.openqa.selenium.By;

public class LocRepository {
	
	public static By locvalue(String Loctype, String Locprop)
	{
		By loc=null;
		
		switch(Loctype)
		{
		
		
		case "id":
			loc=By.id(Locprop);
			break;
		
		case "name":
			loc=By.name(Locprop);
			break;
			
		case "xpath":
			loc=By.xpath(Locprop);
			break;
		
		}
		return loc;
	}
	
	

}
