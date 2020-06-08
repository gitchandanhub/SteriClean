package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseDriver.AppDriver;

public class WorkOrder_callTracker extends AppDriver
{
       public WorkOrder_callTracker()
       {
    	   PageFactory.initElements(driver, this);
       }
       @FindBy (id = "txtDate") WebElement date;
       @FindBy (id = "txtRequestedBy")  WebElement reqby;
       @FindBy (id = "ddlWOType")  WebElement EventType;
       @FindBy (id = "txtCallTaker") WebElement calltaker;
       @FindBy (id = "txtCallTakerPhone") WebElement calltakerph;
       @FindBy (id = "txtCallTakerEmail") WebElement calltakeremail;
       @FindBy (id = "txtPhoneNo") WebElement calltakerph2;
       @FindBy (id = "txtEmail") WebElement calltakerEmail2;
       @FindBy (id = "txtAddress") WebElement Address;
       @FindBy (id = "txt_Customer_City") WebElement calltakercity;
       @FindBy (id = "txt_Customer_State") WebElement calltakerstate;
       @FindBy (id = "txt_Customer_Zip") WebElement calltakerzip;
       @FindBy (id = "txtCase") WebElement calltrackercase;
       @FindBy (id = "ddlReferredBY") WebElement refferedby;
       @FindBy (id = "txtReferredBYDesc") WebElement refferedbydesk;
       @FindBy (id = "txtJobTypeDescription") WebElement techevent;
       @FindBy (id = "ddlContactMaidWith") WebElement conmadewith;
       @FindBy (id = "chkEmailUser") WebElement chkemailuser;
       @FindBy (id = "chkSavePrint") WebElement chkSaveprintreport;
       @FindBy (id = "btnSave") WebElement savebutton;
       @FindBy (id = "btnStyle") WebElement cancelbutton;
       @FindBy (id = "btnPrint") WebElement printreportbutton;
       
       public void date(String mydate)
       {
    	   date.sendKeys(mydate);
       }
       
       public void selectEventtype(int seq)
       {
    	   Select select  = new Select(EventType);
    	   select.selectByIndex(seq);
       }
              
       public void Enterreqby(String requby)
       {
    	   reqby.sendKeys(requby);
       }
}
