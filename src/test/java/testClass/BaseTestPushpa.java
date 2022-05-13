package testClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.IMDBpage;
import pages.WIKIpage;

public class BaseTestPushpa {

	public static WebDriver driver;
	public IMDBpage ip;
	public WIKIpage wp;
	
	@SuppressWarnings("deprecation")
	@BeforeSuite 
	public void LaunchSite1()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@BeforeSuite
	public void LaunchSite2()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		
	}
	
	@BeforeClass
	public void createobjects()
	{
		ip = new IMDBpage(driver);
		wp= new WIKIpage(driver);
	}

}
