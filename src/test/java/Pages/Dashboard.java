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
	@FindBy (xpath = "//*[@id='logout']")  WebElement logoutoption;
	
	@FindBy (xpath = "//a[@id='Newlinkk']") WebElement newworkorder;
	
	@FindBy (id = "A1")  WebElement createnewticket;
	@FindBy (id = "schedules") WebElement Scheduling;
	@FindBy (id = "ticket")  WebElement ticket;
	@FindBy (id = "reports") WebElement report;
	@FindBy (id = "system")  WebElement systems;
	@FindBy (id = "A2")  WebElement newevent;
	
	public String logoutoptiontest()
	{
		String usrname = logoutoption.getText();
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
	
	public void clickscheduling() throws InterruptedException
	{
		Scheduling.click();
		Thread.sleep(2000);
		log.info("Scheduling has been clicked");
	}
	public void clicksupport() throws InterruptedException
	{
		ticket.click();
		Thread.sleep(2000);
		log.info("Support has been clicked");
	}
	public void clickreport() throws InterruptedException
	{
		report.click();
		Thread.sleep(2000);
		log.info("Report has been clicked");
	}
	public void clickSystem() throws InterruptedException
	{
		systems.click();
		Thread.sleep(2000);
		log.info("System has been clicked");
	}
	public void clicknewEevents() throws InterruptedException
	{
		newevent.click();
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		Thread.sleep(1000);
		try
		{
		driver.switchTo().frame(list.get(0));
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			driver.switchTo().frame(driver.findElement(By.id("MainContent_iframeSrc")));
			Thread.sleep(2000);
		}
		
	}
}
