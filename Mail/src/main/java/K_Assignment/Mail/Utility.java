package K_Assignment.Mail;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Utility {

	
	public static String Get_Property(String key) throws IOException
	{
		
		Properties obj=new Properties();
		FileInputStream File=new FileInputStream("E:\\Selenium Practice\\Mail\\Properties.properties");
	     obj.load(File);
	     String value = obj.getProperty(key);
	     
	     return value;
	
	}

	
}
