package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WebsiteDataprovider
{
	@Test(dataProvider="create")
	public void testdata(String username,String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\driver113\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement w;
		w=driver.findElement(By.id("user-name"));
		w.sendKeys("standard_user");
		
		WebElement w1;
		w1=driver.findElement(By.id("password"));
		w.sendKeys("secret_sauce");
		
		WebElement loginbtn;
		loginbtn=driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(3000);
		driver.close();
		System.out.println(username+"="+password);
	}
	
	@DataProvider(name="create")
	public  Object[][] dataset()
	{
		Object[][] data=new Object[4][2];
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		
		data[1][0]="locked_out_user";
		data[1][1]="secret_sauce";
				
		data[2][0]="problem_user";
		data[2][1]="secret_sauce";
				
		data[3][0]="performance_glitch_user";
		data[3][1]="secret_sauce";	
		
		return data;
	}

}
