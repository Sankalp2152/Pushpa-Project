package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WIKIpage {

	WebDriver driver;
	
	@FindBy(xpath= "(//table[@class='infobox vevent']//td[@class='infobox-data'])[10]")
	private WebElement releaseDate1;
	
	@FindBy(xpath= "//table[@class='infobox vevent']//td[text()='India']")
	private WebElement countryName1;
	
	public WIKIpage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public String wikiDetail1()
	{
		String wikireleasedate =releaseDate1.getText();
		return wikireleasedate;
	}
	
	public String wikiDetail2()
	{
	
		String wikiCountryName = countryName1.getText();
		return wikiCountryName;
	}

}
