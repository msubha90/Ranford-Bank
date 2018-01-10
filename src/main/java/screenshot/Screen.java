package screenshot;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screen 
{
	public static void screenshot(WebDriver driver, String screenshotname)
	{
		try {
			
			File ss= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File ds= new File("\\screenshot\\"+screenshotname+".png");
			
			FileUtils.copyFile(ss, ds);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void alertScreenshot(WebDriver driver, String screenshotname)
	{
		try {
			Robot r= new Robot();
			
			BufferedImage bi=r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			
			ImageIO.write(bi, "jpg", new File("\\screenshot\\"+screenshotname+".jpg"));
			
		} catch (Exception e) {

			e.printStackTrace();
		} 
		
	}
}
