package TestNGBasics;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGFeatures

{
	@Test
	public void loginTest() //if its getting failed than the below method will be ignored as it depends upon 2nd test
	{
		System.out.println("Login test");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="loginTest")//it depends on above testcase.If above method gets failed than this will be ignored.
	public void HomePageTest()
	{
		System.out.println("HomePageTest test");
	}
	
	@Test
	public void SearchPageTest()
	{
		System.out.println("SearchPageTest ");
	}
	
	
	
	
}
