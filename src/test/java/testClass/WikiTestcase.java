package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WikiTestcase extends ListenersClassPushpa{

	@Test
	public void wikiDate()
	{
		String release =wp.wikiDetail1();
		String expectedResult ="17 December 2021 (India)";
		Assert.assertEquals(release, expectedResult);
		System.out.println("the Release Date is: " +release);
	}
	
	@Test
	public void wikiCountry()
	{
		String Country = wp.wikiDetail2();
		System.out.println("Country of Origin is: "+ Country);	
	}
}
