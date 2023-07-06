package common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Utilities.testutilsjava;

public class Listeners extends testutilsjava implements ITestListener 
	{
	public void onTestStart(ITestResult result)
	{
		Reporter.log("Method name is="+result.getName()); 
		System.out.println("testcase starting");
	}
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("status of execution is ="+result.getStatus());
	}
	public void 	onTestFailure(ITestResult result)
	{
		System.out.println("Test failed take sscreenshot");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void onTestSkipped(ITestResult result)
	{
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	
	public void onFinish(ITestResult result)
	{
		
	}
}