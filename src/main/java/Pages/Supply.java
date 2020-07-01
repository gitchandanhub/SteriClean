package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class Supply extends AppDriver 
{
	public Supply()
	{
		PageFactory.initElements(driver, this);
	}

   @FindBy (xpath = "//*[@id='frmCreateWorkOrder']/div[3]/table[2]/tbody/tr/td/ul/li[6]")  WebElement Clicksupplytab;
   
   public void Clicksupplytab() throws InterruptedException
   {
	   Clicksupplytab.click();
	   log.info("Estimatetab have opened");
	   Thread.sleep(2000);
   }
}
