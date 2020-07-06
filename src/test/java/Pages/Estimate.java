package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class Estimate extends AppDriver 
{
	public Estimate()
	{
		PageFactory.initElements(driver, this);
	}

   @FindBy (xpath = "//*[@id='frmCreateWorkOrder']/div[3]/table[2]/tbody/tr/td/ul/li[4]") WebElement estimatetab;
   
   @FindBy (xpath = "//*[@id='FileUploadEstimateAttachments']") WebElement choosefile;
   
   @FindBy (id = "txtEstimateAmount") WebElement estimateamount;
   
   public void clickestimatetab() throws InterruptedException
   {
	   estimatetab.click();
	   log.info("Estimatetab have opened");
	   Thread.sleep(2000);
   }
   
   public void chooseFile(String path) throws InterruptedException
   {
	   choosefile.sendKeys(path);
	   Thread.sleep(1000);
   }
   
   public String Estimateamount()
   {
	   String amount = estimateamount.getText();
	   return amount;
   }
}
