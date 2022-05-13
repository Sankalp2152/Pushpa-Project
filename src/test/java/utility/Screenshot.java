package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

	public class Screenshot {
	public static String capturescreen1(WebDriver driver, String name) throws IOException {
		 TakesScreenshot scrshot = (TakesScreenshot)driver;
			File source= scrshot.getScreenshotAs(OutputType.FILE);
			
			String path= System.getProperty("user.dir")+"\\Screenshot1\\"+name+".png";
			
			File Destination= new File(path);
			FileHandler.copy(source, Destination);
			
			return path;
	}

}
