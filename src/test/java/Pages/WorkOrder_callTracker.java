package Pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseDriver.AppDriver;
import Utility.NumberReader;

public class WorkOrder_callTracker extends AppDriver
{
       public WorkOrder_callTracker()
       {
    	   PageFactory.initElements(driver, this);
       }
       @FindBy (id = "txtDate") WebElement date;
       @FindBy (xpath = "//*[@id='taabs-11']/td[1]/table/tbody/tr[1]/td[2]/span/span/span/div/div[5]") WebElement datecrossbutton;
       @FindBy (css = "body.AddNewTicket:nth-child(2) div.Page:nth-child(12) table.WorkOrderTable:nth-child(3) td.main_tabs div.tab-content.current:nth-child(2) table.calltaker_maintabs td.txtDateCssClass.DateZIndex span.DateSpanClass span.DateSpanClass span.DateSpanClass div.JsDatePickBox > div.jsDatePickCloseButton") WebElement datecrossbutton2;
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
       @FindBy (id = "txtTransferredTo") WebElement cmwtextbox;
       @FindBy(id = "txtComments") WebElement cmnttxtbx;
       @FindBy(id = "Button1") WebElement addbtn;
       
       public void date(String mydate) throws InterruptedException
       {
    	   date.click();
    	   Thread.sleep(1000);
    	   date.clear();
    	   date.sendKeys(mydate);
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
       }
       
       public void selectEventtype(int seq)
       {
    	   Select select  = new Select(EventType);
    	   select.selectByIndex(seq);
       }
       public void selectEventtype(String type)
       {
    	   Select select  = new Select(EventType);
    	   select.selectByVisibleText(type);
       }
          
       public void EnterCalltrackername(String caltrkrname)
       {
      calltaker.clear();
      calltaker.sendKeys(caltrkrname);
       }
       public void EnterCalltrackerphone(String caltrkrpn) throws AWTException
       {
    	   calltakerph.click();
           calltakerph.clear();
           calltakerph.click();
           NumberReader.readnum(caltrkrpn);
       }
       public void EnterCalltrackerphone2(String caltrkrpn)
       {
    	   calltakerph.click();
           calltakerph.clear();
           calltakerph.sendKeys(caltrkrpn);
       }
       public void EnterCalltrackeremail(String caltrkrmail)
       {
      calltakeremail.clear();
      calltakeremail.sendKeys(caltrkrmail);
       }
       public void Enterreqby(String requby)
       {
      reqby.sendKeys(requby);
       }
       public void EnterPhonenumber(String pnnum) throws AWTException
       {
         calltakerph2.click();
         NumberReader.readnum(pnnum);
       }
       public void EnterPhonenumber2(String pnnum)
       {
      calltakerph2.sendKeys(pnnum);
       }
       public void EnterEmail(String mail)
       {
      calltakerEmail2.sendKeys(mail);
       }
       public void EnterJobaddress(String jobaddr)
       {
      Address.sendKeys(jobaddr);
       }
       public void EnterCity(String cty)
       {
      calltakercity.sendKeys(cty);
       }
       public void EnterState(String st)
       {
      calltakerstate.sendKeys(st);
       }
       public void EnterZip(String zp) throws AWTException
       {
      calltakerzip.click();
      NumberReader.readnum(zp);
       }
       public void EnterZip2(String zp)
       {
      calltakerzip.sendKeys(zp);
       }
       public void EnterCaseno(String cno)
       {
      calltrackercase.sendKeys(cno);
       }
       public void SelectRefferedby(int refby)
       {
        Select selectref = new Select(refferedby);
        selectref.selectByIndex(refby);
       }
       public void SelectRefferedby(String refby)
       {
        Select selectref = new Select(refferedby);
        selectref.selectByVisibleText(refby);
       }
       public void EnterRefferedbydesc(String refbydesc)
       {
      refferedbydesk.sendKeys(refbydesc);
       }
       public void EnterTechorevent(String techrevent)
       {
      techevent.sendKeys(techrevent);
       }
       public void Selectcontactmadewith(String conmdwd)
       {
      Select contactselect = new Select(conmadewith);
      contactselect.selectByVisibleText(conmdwd);
       }
       public void Selectcontactmadewith(int conmdwd)
       {
      Select contactselect = new Select(conmadewith);
      contactselect.selectByIndex(conmdwd);
       }
       public void EnterContactmadewithtext(String cmwtext)
       {
    	   cmwtextbox.sendKeys(cmwtext);
       }
       public void Entercomments(String cmnttxt)
       {
      cmnttxtbx.sendKeys(cmnttxt);
       }
       public void addcmtbutton()
       {
    	   addbtn.click();
       }
       public void Sendemailcheckbox()
       {
      if(chkemailuser.isEnabled())
      {
      System.out.println("Check box is selected");
      }
      else
      {
      System.out.println("Check box is not selected");
      chkemailuser.click();
      }
      
      }
       public void SavePrintCheckbox()
       {
      if(chkSaveprintreport.isEnabled())
      {
      System.out.println("Check box is selected");
      }
      else
      {
      System.out.println("Check box is not selected");
      chkSaveprintreport.click();
      }
      
       }
       
       
       public void printreportbutton()
       {
      printreportbutton.click();
       }
       
       
}
