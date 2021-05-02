package Maven_May.MayMAven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class Test_1 extends Class2 {

	
@BeforeClass

      public void BC()
      {
	//Class2.main();
	    System.out.println("--WELCOME--------Before Class Running");
      }
@BeforeMethod
	public void BM()
	{
	System.out.println("------------Before Method Running");
	}

@BeforeTest

public void BT()
{
System.out.println("------------Before Test Running");
}
@AfterTest

public void AT()
{
System.out.println("------------After Test Running");
}
@Test
    public void Test1()
   {
	System.out.println("----------Test-1 Running");
    }

@Test
public void Test2()
{
System.out.println("----------Test-2 Running");
}


@AfterMethod
   public void AM()
   {
	System.out.println("----------After Method Running");
    }
@AfterClass
   public void AC()
  {
	System.out.println("-----------After Class Running");
  }
	
	
}
