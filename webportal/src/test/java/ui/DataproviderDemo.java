package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo 
{
	@Test(dataProvider="dataset1")
	
		public void test2(String username,String password)
		{
			System.out.println(username+"---"+password);
		}
	
	@Test(dataProvider="dataset")
	public void test(String username,String password)
	
	{
	System.out.println(username+"====="+password);
	}
	
	@DataProvider
	public Object[][] dataset()
	{
		Object[][] datasetinfo=new Object[4] [2];
		datasetinfo[0][0]="user1";
		datasetinfo[0][1]="pass1";
				
		datasetinfo[1][0]="user2";
		datasetinfo[1][1]="pass2";
				
		datasetinfo[2][0]="user3";
		datasetinfo[2][1]="pass3";
				
		datasetinfo[3][0]="user4";
		datasetinfo[3][1]="pass4";		
		
		return datasetinfo;
		
				}
	
	
	@DataProvider
	public Object[][] dataset1()
	{
	return new Object[][] 
			{
				{"username","password","test"},
				{"username1","password1","test1"},
				{"username2","password2","test2"},
				{"username3","password3","test3"}
			};
	}
	
	

}
