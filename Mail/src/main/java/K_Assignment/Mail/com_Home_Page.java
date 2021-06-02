package K_Assignment.Mail;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class com_Home_Page extends Base {

	
	@FindBy(xpath="//a[contains(text(),'Compose')]")private WebElement Compose;
	@FindBy(xpath="//input[@id='message-to-field']")private WebElement To;
	@FindBy(xpath="//input[@data-test-id='compose-subject']")private WebElement Sub;
	@FindBy(xpath="//div[@data-test-id='rte']")private WebElement Body;
	@FindBy(xpath="//button[@title='Send this email']")private WebElement Send;
	@FindBy(xpath="(//a//span[@class='H_6MGW'])[1]")private WebElement Starred;
	@FindBy(xpath="((//ul[@aria-label='Message list'])//li)[3]")private WebElement Openmail;
	@FindBy(xpath="//div[@data-test-id='message-view-body']")private WebElement MsgBody;
	
	

	
	com_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void Compose() throws InterruptedException
	{

		Compose.click();
		To.sendKeys("nimbalkaravinash@ymail.com");
		Sub.sendKeys("Test-Mail");
		Body.sendKeys("Test Email Body");
		Send.click();
		 Thread.sleep(4000);
	}
	public void Msg() throws InterruptedException
	{
      
		//driver.navigate().refresh();
		
		Starred.click();
		
	}
	
	public void Msg_Body() throws InterruptedException
	{
		Openmail.click();
		String Text = MsgBody.getText();
		System.out.println("-----Message Body-------"+Text);
		
	}
	
}
