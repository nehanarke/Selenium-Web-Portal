package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitleTest
{
	@Test
	public void TitleTest()
	{
		String expectedtitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\driver113\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		String ActualTitle=driver.getTitle();
		Assert.assertEquals(ActualTitle,expectedtitle);
		
		
		
		
	}

}
