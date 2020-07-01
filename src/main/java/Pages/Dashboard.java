package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class Dashboard  extends AppDriver 
{
	public Dashboard()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//*[@id='UserName']")  WebElement username;
	
	@FindBy (xpath = "//a[@id='Newlinkk']") WebElement newworkorder;
	
	@FindBy (id = "A1")  WebElement createnewticket;
	
	public String loggeduser()
	{
		String usrname = username.getText();
		return usrname;
	}
	
	public void ClicknewWorkOrder() throws InterruptedException
	{
		newworkorder.click();
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
	
		driver.switchTo().frame(list.get(0));
		Thread.sleep(2000);
	}
	
	public void Createticket() throws InterruptedException 
	{
		createnewticket.click();
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
	
		driver.switchTo().frame(list.get(0));
		Thread.sleep(2000);
		log.info("Create New Ticket Window Opened");
	}
}
