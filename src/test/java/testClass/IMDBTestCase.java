package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IMDBTestCase extends ListenersClassPushpa{

	@Test(priority = 1)
	public void imdbDate()
	{	
		String release =ip.imdbDetail1();
//		String expectedResult ="17 December 2021 (India)";
		String expectedResult ="January 7, 2022 (United States)";
		Assert.assertEquals(release, expectedResult);
		System.out.println("the Release Date is: " +release);
	}
	
	@Test(priority = 2)
	public void imdbCountry()
	{
		String Country = ip.imdbDetail2();
		System.out.println("Country of Origin is: "+ Country);
	}
}
