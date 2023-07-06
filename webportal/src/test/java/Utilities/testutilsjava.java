package Utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseTest;

public class testutilsjava extends BaseTest
{
	private static final String TakesScreenshot = null;

	public void getScreenshot() throws IOException
	
	{
		File Srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destfile=new File("C:\\Users\\Admin\\Pictures\\Screenshots\\image6.png");
		Files.copy(Srcfile.toPath(),destfile.toPath());	
	}
}
