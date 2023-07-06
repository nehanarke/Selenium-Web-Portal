import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ReadExcelData {

	public static void main(String[] args)throws IOException 
	{
		 FileInputStream file = new FileInputStream(new File("path/to/excel/file.xlsx"));
	        
	        file.close();

	}

}
