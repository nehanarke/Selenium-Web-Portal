package ui;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportsCode 
{
		@Test
		public void reportTest1()
		{
			System.out.println("This is test1");
		}

		@Test
		public void reportTest2()
		{
			Reporter.log("This is test");
			System.out.println("This is test2");
		}
		
		@Test
		public void reportTest3()
		{
			System.out.println("This is test3");
		}
		
		@Test
		public void reportTest4()
		{
			System.out.println("This is test4");
		}
}
