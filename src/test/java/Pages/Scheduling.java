package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class Scheduling extends AppDriver 
{
	public Scheduling()
	{
		PageFactory.initElements(driver, this);
	}

	@FindAll (@FindBy (xpath = "//*[@id='fullcal']/div/div/table/tbody/tr[*]/td[*]/div/div[1]"))  List<WebElement> list;
	
	public void clickschdate(int datenum) throws InterruptedException
	{
		for(int i =0; i<list.size(); i++)
		{
			String num = list.get(i).getText();
			int lnum = Integer.parseInt(num);
			if(datenum==lnum)
			{
			  list.get(i).click();
			  Thread.sleep(2000);
			}
		}
	}
	
	public void clickschdate2(int datenum) throws InterruptedException
	{
		for(int j = 1; j<7 ;j++ )
			{
				for(int k =1; k<8; k++)
				{
					String num = driver.findElement(By.xpath("//*[@id='fullcal']/div/div/table/tbody/tr["+j+"]/td["+k+"]/div/div[1]")).getText();
				
				int lnum = Integer.parseInt(num);
				if(datenum==lnum)
				{
					driver.findElement(By.xpath("//*[@id='fullcal']/div/div/table/tbody/tr["+j+"]/td["+k+"]/div/div[1]")).click();
				}
				
				}
				
			}
			Thread.sleep(3000);			
		
	}
	
	public void rightclick(int datenum) throws InterruptedException
	{
		for(int j = 1; j<7 ;j++ )
		{
			for(int k =1; k<8; k++)
			{
				String num = driver.findElement(By.xpath("//*[@id='fullcal']/div/div/table/tbody/tr["+j+"]/td["+k+"]/div/div[1]")).getText();
			
			int lnum = Integer.parseInt(num);
			if(datenum==lnum)
			{
				WebElement date = driver.findElement(By.xpath("//*[@id='fullcal']/div/div/table/tbody/tr["+j+"]/td["+k+"]/div/div[1]"));
				Actions act = new Actions(driver);
				act.contextClick(date).build().perform();
			}
			
			}
			
		}
		Thread.sleep(3000);	
	}
}
