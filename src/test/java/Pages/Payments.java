package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class Payments extends AppDriver 
{
	public Payments()
	{
		PageFactory.initElements(driver, this);
	}

   @FindBy (xpath = "//*[@id='frmCreateWorkOrder']/div[3]/table[2]/tbody/tr/td/ul/li[7]")  WebElement clickpaymenttab;
   @FindBy (id = "txtDepositAmt") WebElement depositeamount;
   
   public void Clickpaymenttab() throws InterruptedException
   {
	   clickpaymenttab.click();
	   log.info("Payment Tab have opened");
	   Thread.sleep(1500);
   }
   
   public void depositeamount(float amount)
   {
	   depositeamount.click();
	   depositeamount.sendKeys(String.valueOf(amount));
   }

}
