package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class Receipts extends AppDriver 
{
	public Receipts()
	{
		PageFactory.initElements(driver, this);
	}

   @FindBy (xpath = "//*[@id='frmCreateWorkOrder']/div[3]/table[2]/tbody/tr/td/ul/li[8]") WebElement reciptstab2;
   @FindBy (id = "FileUploadReceiptAttachments") WebElement choosefile;
   
   
   public void clickreceipttab() throws InterruptedException
   {
	   reciptstab2.click();
	   log.info("Receipt Tab have opened");
	   Thread.sleep(2000);
   }

   public void uploadfile(String path) throws InterruptedException
   {
	   choosefile.sendKeys(path);
	   log.info("File in Receipt Tab have selected");
	   Thread.sleep(2000);
   }

}
