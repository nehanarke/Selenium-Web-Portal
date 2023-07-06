package TestNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLoginusingParameters 
{
	WebDriver driver;
	
	@Test (priority=1)
	@Parameters({"browser"})
	public void launchURLTest(String browser)
	{
		System.out.println("running browser is="+browser);
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\driver113\\chromedriver.exe");
				driver=new ChromeDriver();
				//driver.get("https://www.ebay.com/");
			}else if(browser.equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(browser.equals("ie"))
			{
				driver=new InternetExplorerDriver();
			}
			else if(browser.equals("safari"))
			{
				driver=new SafariDriver();
			}
			driver.get("https://www.freecrm.com/");	
	}
	@Parameters({"username","Password"})
	@Test(priority=1)
	public void login(String username,String Password)
	{
		driver.findElement(By.xpath("/html/body/div/header/div/nav/div[2]/div/div[2]/ul/a/span[1]")).click();
		System.out.println("My username="+username+"My Password="+Password);
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(Password);	
	}
	@Test(priority=3)
	public void closed()
	{
		driver.close();
	}
}
