package testbase;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class TestBase 
{
	static Properties property;
	
	public static void loadProperty()
	{
		try {
			property= new Properties();
			
			File f= new File(System.getProperty("user.dir")+"\\src\\main\\java\\config\\OR.properties");
			
			FileReader fir= new FileReader(f);
			
			property.load(fir);
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}
	
	public static String getbuild1(String url1)
	{
		loadProperty();
		
		return property.getProperty(url1);
		
	}
	
	public static String getbuild2(String url2)
	{
		loadProperty();
		
		return property.getProperty(url2);
		
	}
	
	public static String getchromepath(String chromepath)
	{
		loadProperty();
		
		return property.getProperty(chromepath);
	}
	
	public static String getusername(String username)
	{
		loadProperty();
		return property.getProperty(username);
	}
	
	public static String getpassword(String password)
	{
		loadProperty();
		return property.getProperty(password);
	}
		
}
