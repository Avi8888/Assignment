package K_Assignment.Mail;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	 WebDriver driver;
	public void Open_Browser() throws IOException {
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\AVINSH\\Downloads\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVINSH\\Downloads\\Chrome 91\\chromedriver.exe");
		// driver =new FirefoxDriver();
		 driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.get("https://www.facebook.com/");
		driver.get(Utility.Get_Property("URL"));
		//System.out.println(Utility.Get_Property("URL"));
		
		
		
		
		
		
		
	}
}
