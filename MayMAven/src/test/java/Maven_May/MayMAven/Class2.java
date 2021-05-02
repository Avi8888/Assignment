package Maven_May.MayMAven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {

	@BeforeClass

    public void BC()
    {
	//Class2.main();
	    System.out.println("----CLASS2----------Before Class Running");
    }
@BeforeMethod
	public void BM()
	{
	System.out.println("----CLASS2------------Before Method Running");
	}

@BeforeTest

public void BT()
{
System.out.println("----CLASS2------------Before Test Running");
}
@AfterTest

public void AT()
{
System.out.println("----CLASS2------------After Test Running");
}
@Test
  public void Test1()
 {
	System.out.println("----CLASS2----------Test-1 Running");
  }

@Test
public void Test2()
{
System.out.println("----CLASS2----------Test-2 Running");
}


@AfterMethod
 public void AM()
 {
	System.out.println("----CLASS2----------After Method Running");
  }
@AfterClass
 public void AC()
{
	System.out.println("----CLASS2-----------After Class Running");
}
		
		
		
		
	
}
