package Pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseDriver.AppDriver;
import Utility.NumberReader;

public class Event  extends AppDriver 
{
      public Event()
      {
    	  PageFactory.initElements(driver, this);
      }
      @FindBy(id = "txtDate")  WebElement date;
      @FindBy(xpath = "//td[@class='txtDateCssClass DateZIndex']//div[@class='jsDatePickCloseButton']") WebElement datecrossbutton;
      @FindBy(xpath = "//*[@id='frmCreateWorkOrder']/div[3]/table/tbody/tr[3]/td[1]/table/tbody/tr[1]/td[2]/span/div/div[5]") WebElement datecrossbutton2;
      @FindBy(id = "txtWODate") WebElement startdate;
      @FindBy(id = "txtWOCompleteDate") WebElement completedata;
      @FindBy(id = "ddlWOType")  WebElement type;
      @FindBy(id = "txtCallTaker")  WebElement calltracker;
      @FindBy(id = "txtCallTakerPhone")  WebElement calltackerph;
      @FindBy (id = "txtCallTakerEmail") WebElement calltrackeremail;
      @FindBy(id = "txtJobTypeDescription")  WebElement subject;
      @FindBy (id = "txtInstructions")  WebElement instruction;
      @FindBy (id = "txtComments")  WebElement notes;
      @FindBy (id = "Button1")  WebElement add;
      @FindBy(xpath = "//*[@id='tabs']/ul/li[2]/a")  WebElement attachmenttab;
      @FindBy (id = "FileUploadInvoiceAttchments") WebElement choosefile;
      @FindBy (xpath = "//*[@id='tabs']/ul/li[3]/a")  WebElement workdaytab;
      @FindBy (id = "chkMultipleDay")  WebElement multipleday;
      @FindBy (id = "txtWD")  WebElement workdaydate;
      @FindBy(xpath = "//*[@id='UpdatePanelWD']/table/tbody/tr[3]/td[1]/span/div/div[5]") WebElement crossbtn;
      @FindBy(xpath = "//div[@id='UpdatePanelWD']//div[@class='jsDatePickCloseButton']")  WebElement crossbtn2;
      @FindBy (id = "txtWDSTime")  WebElement starttime;
      @FindBy (id = "txtWDETime")  WebElement endtime;
      @FindBy (id = "btnSaveWD")  WebElement workdayadd;
      @FindBy (id = "Edit")  WebElement workdayedit;
      @FindBy(id = "Remove")  WebElement worddaycross;
      @FindBy (id = "btnSave")  WebElement savebtn;
      @FindBy(id = "btnCancel")  WebElement cnlbtn;
      @FindBy(id = "MainContent_cmdClosePopUp")  WebElement crsbtn;
      
      public void Enterdate(String dat) throws InterruptedException
      {
    	  date.click();
    	  date.clear();
    	  date.sendKeys(dat);
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
      public void selecttype(String text)
      {
    	  Select slt = new Select(type);
    	  slt.selectByVisibleText(text);
      }
      public void EnterCalltracker(String calltrcker)
      {
    	  calltracker.clear();
    	  calltracker.sendKeys(calltrcker);
      }
      public void Entercalltracketph(String phn) throws AWTException
      {
    	  calltackerph.click();
    	  calltackerph.clear();
    	  calltackerph.click();
    	  NumberReader.readnum(phn);
      }
      public void EnterEmail(String emails)
      {
    	  calltrackeremail.clear();
    	  calltrackeremail.sendKeys(emails);
      }
      public void EnterSubject(String sub)
      {
    	  subject.clear();
    	  subject.sendKeys(sub);
      }
      public void EnterInstruction(String inst)
      {
    	  instruction.clear();
    	  instruction.sendKeys(inst);
      }
      public void Enternote(String notetext) throws InterruptedException
      {
    	  notes.clear();
    	  notes.sendKeys(notetext);
    	  Thread.sleep(1000);
    	  add.click();
      }
      public void attachment(String filepath) throws InterruptedException
      {
    	  attachmenttab.click();
    	  Thread.sleep(1500);
    	  choosefile.sendKeys(filepath);
      }
      public void workday(String wddate, String sttime, String edtime) throws InterruptedException
      {
    	  workdaytab.click();
    	  multipleday.click();
    	  workdaydate.click();
    	  workdaydate.clear();
    	  workdaydate.sendKeys(wddate);
    	  Thread.sleep(1000);
   	   try
   	   {
   		crossbtn.click();
   	   }
   	   catch(Exception e)
   	   {
   		   System.out.println(e);
   		crossbtn2.click();
   	   }
   	starttime.click();
   	starttime.sendKeys(sttime);
   	endtime.click();
   	endtime.sendKeys(edtime);
   	workdayadd.click();
      }
      public void clicksave() throws InterruptedException
      {
    	  savebtn.click();
    	  Thread.sleep(2000);
      }
      public void clickcnc() throws InterruptedException
      {
    	  cnlbtn.click();
    	  Thread.sleep(2000);
      }
      public void clickcrs()
      {
    	  crsbtn.click();
      }
}
