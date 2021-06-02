package K_Assignment.Mail;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Gmail_Test extends Base{
	

	 private static final int priority = 0;
	com_Login_Page login;
	 com_Home_Page compose;
	
  @BeforeMethod
  public void beforeMethod() throws IOException {
	
 
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() throws IOException {
	  Open_Browser();
	  login=new com_Login_Page(driver);
	  compose=new com_Home_Page(driver);
  }

  @AfterClass
  public void afterClass() {
  }

  @Test(priority=0)
  public void Verify_Login_Page() throws InterruptedException
  {
	  System.out.println("Login page open");
	  login.Login();  
	  System.out.println("-----USER SUCCESSFULLY LOGIN--------");
  }
  @Test(priority=1)
  public void Verify_Compose_Page() throws InterruptedException
  {
	  System.out.println("Home page open");
	  compose.Compose();
	  System.out.println("-----USER SUCCESSFULLY COMPOSE MESSAGE--------");
  }
  
  @Test(priority=2)
  public void Verify_MSg_Page() throws InterruptedException
  {
	  System.out.println("Home page open");
	  System.out.println("-----USER SUCCESSFULLY SEND MESSAGE-------");
	  driver.navigate().refresh();
	  System.out.println("Page Refreshed");
	  compose.Msg();
  }
  @Test(priority=3)
  public void Verify_MsgBody_Page() throws InterruptedException
  {
	  Thread.sleep(5000);
	  compose.Msg_Body();
	  System.out.println("-----Msg OPen--------");
  }
  
  
}
