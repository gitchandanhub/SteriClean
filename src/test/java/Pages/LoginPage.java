package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class LoginPage extends AppDriver
{
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
 
	@FindBy (id = "txtUName")  WebElement username;
	@FindBy (id = "txtUserPassword")  WebElement password;
	@FindBy (id = "imgbtnLogin")  WebElement loginbutton;
	@FindBy (xpath = "//*[@id='mylogin']/tbody/tr[3]/td/table/tbody/tr[8]/td/a") WebElement registeruserlink;
	@FindBy (xpath = "//*[@id='mylogin']/tbody/tr[3]/td/table/tbody/tr[6]/td/a")  WebElement forgetpwd;
	
	public void EnterUsername(String usrname)
	{
		username.sendKeys(usrname);
	}
	public void EnterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
    public void clickLogin()
    {
    	loginbutton.click();
    }
    public void navigateregisteruser() throws InterruptedException
    {
    	try
    	{
    	 registeruserlink.click();
    	 Thread.sleep(3000);
    	  }
    	catch(Exception e)
    	{
    	System.out.println(e);
    	driver.navigate().to("https://cleannet.steri-clean.com/hoardersQA/UserMaintain.aspx");
    	Thread.sleep(3000);

    	}
    }
    public void clickforgetpwd() throws InterruptedException
	{
		forgetpwd.click();
		Thread.sleep(3000);
	}
}
