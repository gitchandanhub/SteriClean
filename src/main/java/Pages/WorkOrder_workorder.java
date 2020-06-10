package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class WorkOrder_workorder extends AppDriver  
{
    public WorkOrder_workorder()
    {
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy (xpath = "//li[@class='tab-link current']")   WebElement workordertab;
    @FindBy (id = "txtWODate")  WebElement starttdate  ;
    @FindBy (id = "txtWOStartTime")  WebElement  starttime;
    @FindBy (id = "txtWOCompleteDate")  WebElement completedate ;
    @FindBy (id = "txtWOCompleteTime")  WebElement completetime ;
    @FindBy (id = "ChkAllDay")  WebElement  alldaycheckbox;
    @FindBy (id = "txtWD")  WebElement workday ;
    @FindBy (id = "txtWDSTime")  WebElement Starttime ;
    @FindBy (id = "txtWDETime")  WebElement Endtime ;
    @FindBy (xpath = "//button[@class='multiselect dropdown-toggle btn btn-default']")  WebElement technician ;
    @FindBy (id = "ImgAdd") WebElement addbutton;
    @FindBy (id = "txtWOAddress")  WebElement  address;
    @FindBy (id = "txtWOCity")  WebElement city;
    @FindBy(id = "txtWOState")  WebElement state;
    @FindBy(id = "txtWOZip")  WebElement zipcode;
    @FindBy(id = "txtWOCountry")  WebElement country;
    @FindBy(id = "txtWOOnSceneContact")  WebElement onescenecontact;
    @FindBy(id = "txtWO2ndOnSceneContact")  WebElement secondscenecontact;
    @FindBy(id = "txtWOPhoneNumber")  WebElement phonenumber;
    @FindBy(id = "txtWO2ndPhoneNumber")  WebElement secondphnumber;
    @FindBy(id = "txtInstructions")  WebElement instructionbox;
    @FindBy(id = "txtWOSceneDescription")  WebElement description;
    @FindBy(id = "btnSave")  WebElement savebutton;
    @FindBy(id = "btnCancel")  WebElement cancelbutton;
    @FindBy(id = "btnPrint")  WebElement reportbutton;
    @FindBy(id = "MainContent_cmdClosePopUp")  WebElement closepopup;
    public void clickworkorder()
    {
    	workordertab.click();
    }
    public void selectstartdate()
    {
    	
    }
    public void selectstarttime()
    {
    	
    }
    public void selctcompletedate()
    {
    	
    }
    public void selectcompletetime()
    {
    	
    }
    public void selectalldatcheckbox()
    {
    	
    }
    public void selectworkday()
    {
    	
    }
    public void selectworkdaystarttime()
    {
    	
    }
    public void selectworkdayendtime()
    {
    	
    }
    public void selecttechnician()
    {
    	
    }
    public void clickaddbutton()
    {
    	
    }
    public void Enteraddress()
    {
    	
    }
    public void Entercity()
    {
    	
    }
    public void EnterState()
    {
    	
    }
    public void Enterzipcode()
    {
    	
    }
    public void EnterCountry()
    {
    	
    }
    public void enteronscenecontact()
    {
    	
    }
    public void entersecondonesceencontact()
    {
    	
    }
    public void Enterphnumber()
    {
    	
    }
    public void entersecondphonenumber()
    {
    	
    }
    public void EnterInstruction()
    {
    	
    }
    public void EnterDescription()
    {
    	
    }
    public void clicksavebutton() throws InterruptedException
    {
    	savebutton.click();
    	Thread.sleep(3000);
    }
    public void clickcancelbutton() throws InterruptedException
    {
    	cancelbutton.click();
    	Thread.sleep(3000);
    }
    public void clickreportbutton() throws InterruptedException
    {
    	reportbutton.click();
    	Thread.sleep(3000);
    }
}
