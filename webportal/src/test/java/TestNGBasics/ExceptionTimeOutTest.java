package TestNGBasics;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest
{
	@Test(timeOut=2000)
	public void infiniteloopTest()
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}

}
