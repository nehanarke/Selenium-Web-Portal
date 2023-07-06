package TestNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngbasic
{
	//preconditions annotations starting with @Before keyword
	@BeforeSuite //1
	public void setup()
	{
		System.out.println("setup system property");
	}
	@BeforeTest //2
	public void launchbrowser()
	{
		System.out.println(" launcht he browser");
	}
	@BeforeClass //3
	public void Login()
	{
		System.out.println("Login page ");
	}
	@BeforeMethod //4
	public void enterURL()
	{
		System.out.println("Entre url");
	}
	

	//Testcase starting with @Test
	@Test //5
	public void  googletitletest()
	{
		System.out.println("googletitle test");
	}
	
	//Post conditions starting with @Aftre 
	@AfterMethod //6
	public void Logout()
	{
		System.out.println("logout from app");
	}
	
	@AfterTest() //8
	public void deleteallcoockies()
	{
		System.out.println("delete all cookies");
	}
	@AfterClass //7
	public void closebrowser()
	{
		System.out.println("Closebrowser");
	}
	@AfterSuite //9
	public void generateTestReport()
	{
		System.out.println("generate reports");
	}
}
