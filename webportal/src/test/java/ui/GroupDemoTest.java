package ui;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups="User register")
public class GroupDemoTest
{
	
	
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
	
	@Test(priority=1,groups="regression")
	public void Test1()
	{
		
		System.out.println("Login successfully");
	}
	
	@Test(priority=2,groups="regression")
	public void Test2()
	{
		System.out.println("Logout successful");
	}
	
	@Test(groups={"regression","Bvt"})
	public void Test3()
	{
		System.out.println("Test3");
	}
	@Test(groups="Bvt")
	public void Test4()
	{
		System.out.println("Test4");
	}
	@Test(groups="Bvt")
	public void Test5()
	 {
		System.out.println("Test5");
		 
	 }
	
}
