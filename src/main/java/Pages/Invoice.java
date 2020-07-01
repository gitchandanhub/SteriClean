package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class Invoice extends AppDriver 
{
	public Invoice()
	{
		PageFactory.initElements(driver, this);
	}

    @FindBy (xpath = "//*[@id='frmCreateWorkOrder']/div[3]/table[2]/tbody/tr/td/ul/li[9]") WebElement invoicetab;
    @FindBy (id = "FileUploadInvoiceAttchments")  WebElement choosefile;
    @FindBy (id = "txtInvoiceAmount") WebElement invoiceamt;
    
    public void ClickInvoicetab() throws InterruptedException
    {
    	invoicetab.click();
    	log.info("Invoice Tab have opened");
 	   Thread.sleep(2000);
    }
    
    public void uploadfile(String path)
    {
    	choosefile.sendKeys(path);
    	log.info("Invoice file have selected");
    }
    
    public String getInvoiceamount()
    {
    	String amount = invoiceamt.getText();
    	return amount;
     }
    
    public void Enteramount(float amt)
    {
    	invoiceamt.click();
    	invoiceamt.sendKeys(String.valueOf(amt));
    }
}
