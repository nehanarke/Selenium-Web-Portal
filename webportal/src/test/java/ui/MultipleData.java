package ui;

import org.testng.annotations.DataProvider;

public class MultipleData
{
	@DataProvider
	public Object[][] dataset()
	{
		return new Object[][]
				{
					{"Neha","Narke"},
					{"Komal","Narke"},
					{"aniket","Kudale"},
					{"Brownie","NK"}
				};

	}
}
