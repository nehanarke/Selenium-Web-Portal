package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class ListenerTestCase extends BaseTest
{
	@Test(retryAnalyzer=common.Retry.class)
	public void launchapp()
	{
		driver.get("https://www.ebay.com/");
		Assert.assertTrue(false);
	}
}
