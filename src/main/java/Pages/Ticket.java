package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseDriver.AppDriver;

public class Ticket extends AppDriver
{
      public Ticket()
      {
    	  PageFactory.initElements(driver, this);  
    	  
      }
      
      @FindBy(id = "txtTicket_Number")   WebElement trcketnumber;
      @FindBy(id = "txtDate_Time")   WebElement trcketdate;
      @FindBy (xpath = "//div[@class='jsDatePickCloseButton']") WebElement datecrossbutton;
      @FindBy (xpath = "//*[@id='form1']/table/tbody/tr[3]/td[4]/span/div/div[5]") WebElement datecrossbutton2;
      @FindBy(id = "ddlServiceType")   WebElement jobtype;
      @FindBy(id = "ddlPriority_Type")   WebElement priority;
      @FindBy(id = "chkQuote")   WebElement quote;
      @FindBy(id = "FileUploadAttach1")   WebElement choosefile;
      @FindBy(id = "txtService_Request")  WebElement servicerequest;
      @FindBy(id = "btnSubmit")  WebElement Submit;
      @FindBy(id = "btnCancel")  WebElement cancel;
      
      public void getticketnum()
      {
    	 String  tnum = trcketnumber.getText();
      }

      public void EnterTicketnum(String tnum)
      {
    	  trcketnumber.sendKeys(tnum);
      }
      public void Enterdate(String mydate) throws InterruptedException
      {
    	  trcketdate.click();
   	   Thread.sleep(1000);
   	trcketdate.clear();
   	trcketdate.sendKeys(mydate);
   	   Thread.sleep(1000);
   	   try
   	   {
   		   datecrossbutton.click();
   	   }
   	   catch(Exception e)
   	   {
   		   System.out.println(e);
   		   datecrossbutton2.click();
   	   }
   	log.info("Date has been entered"  + mydate);
      }
      public void EnterJobType(int index) 
      {
    	  Select slt = new Select(jobtype);
    	  slt.selectByIndex(index);
    	  log.info("Job Type at position "  + index + " has been selected");
      }
      
      public void EnterPriorirt(int index)
      {
    	  Select slt = new Select(jobtype);
    	  slt.selectByIndex(index);
    	  log.info("Priority at position "  + index + " has been selected") ;
      }
      public void clickquotecheckbox()
      {
    	  quote.click();
    	  log.info("Quote checkbix has been checked");
      }
      public void choosefile(String path)
      {
    	  choosefile.sendKeys(path);
      }
      public void EnterRequest(String RequestText)
      {
    	  servicerequest.sendKeys(RequestText);
    	  log.info("Request Text has been Entered");
      }
    	  public void clicksubmit() throws InterruptedException
      {
    	  Submit.click();
    	  log.info("Submit button has been clicked");
    	  String alerttext =  driver.switchTo().alert().getText();
		  Thread.sleep(3000);
		  System.out.println("Message after Submission ==>"   +alerttext); 
		  Thread.sleep(3000);
		  driver.switchTo().alert().accept(); 
		 
      }
      public void clickcancel()
      {
    	  cancel.click();
    	  log.info("Cancel button has been clicked");
      }
}
