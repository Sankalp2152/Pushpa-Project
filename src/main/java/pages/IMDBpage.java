package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDBpage {

	WebDriver driver;
	@FindBy(xpath= "//section[@data-testid='Details']//a[text()='January 7, 2022 (United States)']")
	private WebElement releaseDate;
	
	@FindBy(xpath= "//section[@data-testid='Details']//a[text()='India']")
	private WebElement countryName;
	
	public IMDBpage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public String imdbDetail1()
	{
		String imdbReleaseDate=releaseDate.getText();
		return imdbReleaseDate;
	}
	
	public String imdbDetail2()
	{
		String imdbCountryName = countryName.getText();
		return imdbCountryName;
	}
}
