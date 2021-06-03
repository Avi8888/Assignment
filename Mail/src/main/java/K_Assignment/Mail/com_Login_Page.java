package K_Assignment.Mail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class com_Login_Page extends Base {

	@FindBy(xpath="//input[@id='login-username']")private WebElement Email;
	@FindBy(xpath="//input[@id='login-signin']")private WebElement NextBtn;
	@FindBy(xpath="//label[contains(text(),'Stay signed')]")private WebElement Staysignin;
	@FindBy(xpath="//input[@id='login-passwd']")private WebElement PW;
	@FindBy(xpath="//button[@id='login-signin']")private WebElement PWNextBtn;
	
	com_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void Login() throws InterruptedException
	{
		System.out.println("Login page open in POM");
		Thread.sleep(4000);
		//Email.click();
	Email.sendKeys("xyz@ymail.com");
	Staysignin.click();
	NextBtn.click();
	PW.sendKeys("Enter Password Here");
	PWNextBtn.click();
	
	}
	
}
