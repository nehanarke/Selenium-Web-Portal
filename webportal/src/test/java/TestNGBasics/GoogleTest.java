package TestNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\driver113\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Test(priority=3,groups="subtitle")
	public void getTitle()
	{
		String title=driver.getTitle();
		System.out.println("Title is="+title);
	}
	
	@Test(priority=1,groups="logo")
	public void  Logotest()
	{
		boolean b=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
		
	}
	
	@Test(priority=2,groups="logo")
	public void links()
	{
		boolean b1=driver.findElement(By.linkText("Gmail")).isDisplayed();
		
	}
	
	@Test(priority=5,groups="subtitle")
	public void test1()
	{
		System.out.println("test1 executed");
	}
	
	
	@Test(priority=4,groups="re")
	public void test2()
	{
		System.out.println("test2 executed");
	}
	
	@Test(groups="re")
	public void Retest() 
	{
		System.out.println("Retest in future");
	}
	@AfterMethod
	public void quite()
	{
		driver.close();
	}
}
