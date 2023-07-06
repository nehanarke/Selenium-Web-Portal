package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInFile
{
	
	@Test(dataProvider="dataset1",dataProviderClass=DataproviderDemo.class)
	public void test1(String username,String password,String test)
	{
			System.out.println(username+"==="+password+"==="+test);
	}
}