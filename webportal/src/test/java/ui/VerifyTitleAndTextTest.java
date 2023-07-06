package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleAndTextTest
{
	@Test
	public void titleTest()
	{
		SoftAssert softassert=new SoftAssert();
		String ExpectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String ExpectedText="Search";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String ActualTitle=driver.getTitle();
		System.out.println("The Title is="+ActualTitle);
		
		String ActualText=driver.findElement(By.id("gh-btn")).getAttribute("value");
		softassert.assertEquals(ExpectedTitle, ActualTitle);//softerror is equal to verify..
		
		softassert.assertEquals( ActualText,ExpectedText,"Test Verification Failed/Passed");
		System.out.println("Closing browser");
		driver.close();
		softassert.assertAll();
		
		
		
	}

}
