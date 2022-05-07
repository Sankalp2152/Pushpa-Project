package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IMDBTestCase extends ListenersClassPushpa {

	@Test
	public void imdbDate()
	{
		String release =ip.imdbDetail1();
		String expectedResult ="17 December 2021";
		
		Assert.assertEquals(release, expectedResult);
		System.out.println("the Release Date is: " +release);
	}
	
	@Test
	public void imdbCountry()
	{
		String Country = ip.imdbDetail2();
		System.out.println("Country of Origin is: "+ Country);	
	}
}
