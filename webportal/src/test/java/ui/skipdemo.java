package ui;

import org.testng.annotations.Test;

public class skipdemo {


	@Test(enabled=false)
	public void test1()
	{
		System.out.println("Skip this test ");
	}
	@Test(enabled=true)
	public void test2()
	{
		System.out.println("Skip this test ");
	}
	
	@Test(enabled=false)
	public void test3()
	{
		System.out.println("Skip this test ");
	}
}
