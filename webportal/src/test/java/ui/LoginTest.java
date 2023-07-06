package ui;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest{
	
	@BeforeTest
	public void loginapp()
	{
		System.out.println("Login Application");
	}
	@AfterTest
	public void Logout()
	{
		System.out.println("Logout Application");
	}
	
	@BeforeMethod
	public void connectDB()
	{
		System.out.println("connect DB");
	}
	
	@AfterMethod
	public void disconnectDB()
	{
		System.out.println("disconnect DB");
	}
	
	@Test(priority=2,description="this is login")
	public void Test1()
	{
		System.out.println("Login successfully");
	}
	
	@Test(priority=1,description="this is logout")
	public void Test2()
	{
		System.out.println("Logout successful");
		Assert.assertTrue(false);
	}
	
}
