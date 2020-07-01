package Pages;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;
import Utility.NumberReader;

public class WorkOrder_workorder extends AppDriver  
{
    public WorkOrder_workorder()
    {
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy (xpath = "//li[@class='tab-link current']")   WebElement workordertab;
    @FindBy (xpath = "//*[@id='frmCreateWorkOrder']/div[3]/table[2]/tbody/tr/td/ul/li[2]") WebElement workordertab2;
    @FindBy (id = "txtWODate")  WebElement starttdate  ;
    @FindBy (id = "txtWOStartTime")  WebElement  starttime;
    @FindBy (id = "txtWOCompleteDate")  WebElement completedate ;
    @FindBy (id = "txtWOCompleteTime")  WebElement completetime ;
    @FindBy (id = "ChkAllDay")  WebElement  alldaycheckbox;
    @FindBy (id = "txtWD")  WebElement workday ;
    @FindBy (id = "txtWDSTime")  WebElement Starttime ;
    @FindBy (id = "txtWDETime")  WebElement Endtime ;
    @FindBy (xpath = "//*[@id='UpdatePanelWD']/table/tbody/tr[2]/td[4]/span/div/button") WebElement selecttechnician;
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
	
    public void clickworkordertab()
    {
    	try
    	{
    		workordertab2.click();
    	}
    	catch(Exception e)
    	{
    	workordertab.click();
    	}
    	log.info("Work Order tab opened");
    	}
    public void selectstartdate(String date)
    {
    	starttdate.clear();
    	starttdate.sendKeys(date);  
    	log.info("Work Order Start Date Selected");
    }
    public void selectstarttime(String time)
    {
    	starttime.clear();
    	starttime.sendKeys(time);
    	log.info("Work Order Start Time Selected");
    }
    public void selctcompletedate(String date)
    {
    	completedate.click();
    	completedate.sendKeys(date);
    	log.info("Work Order Complete Time Selected");
    }
    public void selectcompletetime(String time)
    {
    	completetime.click();
    	completetime.sendKeys(time);
    	log.info("Work Order Complete Time Selected");
    }
    public void selectalldatcheckbox()
    {
    	if(alldaycheckbox.isSelected())
    	{
    		System.out.println("checkbox already selected");
    	}
    	else
    	{
    		alldaycheckbox.click();
    	}
    	log.info("Work Order All Date Checkbox Selected");
    }
    public void selectworkday(String day)
    {
    	workday.clear();
    	workday.sendKeys(day);
    	log.info("Work Order Work day Selected");
    }
    public void selectworkdaystarttime(String time)
    {
    	Starttime.clear();
    	Starttime.sendKeys(time);
    	log.info("Work Order Work start time Selected");
    }
    public void selectworkdayendtime(String endtime)
    {
    	Endtime.clear();
    	Endtime.sendKeys(endtime);
    	log.info("Work Order Work End time Selected");
    }
    public void selecttechnician(String technicianname) throws InterruptedException
    {
    	selecttechnician.click();
    	Thread.sleep(2000);
		/*
		 * JavascriptExecutor jse = (JavascriptExecutor)driver;
		 * jse.executeScript("arguments[0].scrollIntoView()", description);
		 */
    	
    	List<WebElement> list2 = driver.findElements(By.xpath("//*[@id='UpdatePanelWD']/table/tbody/tr[2]/td[4]/span/div/ul/li/a/label"));
    	//jse.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.tagName("header")));
        System.out.println(list2.size());  	
    	for(int i = 1; i<list2.size()+1; i++)
    	{
        String text = driver.findElement(By.xpath("//*[@id='UpdatePanelWD']/table/tbody/tr[2]/td[4]/span/div/ul/li["+i+"]/a/label")).getText();
    	
    	if(text.equalsIgnoreCase(technicianname))
    	{
    	driver.findElement(By.xpath("//*[@id='UpdatePanelWD']/table/tbody/tr[2]/td[4]/span/div/ul/li["+i+"]/a/label")).click();
    	}
    	}
    	Thread.sleep(1000);
    	selecttechnician.click();
    	log.info("Technician have been selected");
    }
    public void clickaddbutton() throws InterruptedException
    {
    	addbutton.click();
    	log.info("Add Button for Techinician add clicked");
    	Thread.sleep(500);
    }
    public void Enteraddress(String adress) throws InterruptedException
    {
    	address.clear();
    	address.sendKeys(adress);
    	Thread.sleep(500);
    	log.info("Work Order Address  has been entered");
    }
    public void Entercity(String cty) throws InterruptedException
    {
    	city.clear();
    	city.sendKeys(cty);
    	Thread.sleep(500);
    	log.info("Work Order City  has been entered");
    }
    public void EnterState(String stt) throws InterruptedException
    {
    	state.clear();
    	state.sendKeys(stt);
    	Thread.sleep(500);
    	log.info("Work Order State  has been entered");
    }
    public void Enterzipcode(String zipcde) throws AWTException, InterruptedException
    {
    	zipcode.clear();
    	zipcode.click();
    	NumberReader.readnum(zipcde);
    	Thread.sleep(500);
    	log.info("Work Order Zipcode  has been entered");
    }
    public void EnterCountry(String countryname) throws InterruptedException
    {
    	country.clear();
    	country.sendKeys(countryname);
    	Thread.sleep(500);
    	log.info("Country Name Entered");
    }
    public void enteronscenecontact(String onescenecontactname) throws InterruptedException
    {
    	onescenecontact.clear();
    	onescenecontact.sendKeys(onescenecontactname);
    	Thread.sleep(500);
    	log.info("onescenecontact Name Entered");
    	
    }
    public void entersecondonesceencontact(String secondscenecontactname) throws InterruptedException
    {
    	secondscenecontact.clear();
    	secondscenecontact.sendKeys(secondscenecontactname);
    	Thread.sleep(500);
    	log.info("secondscenecontact Name Entered");
    	
    }
    public void Enterphnumber(String phnum) throws AWTException, InterruptedException
    {
    	phonenumber.clear();
    	try
    	{
    		phonenumber.sendKeys(phnum);
    	}
    	catch(Exception e)
    	{
    		NumberReader.readnum(phnum);
    	}
    	Thread.sleep(500);
    	log.info("Work Order Phone number  has been entered");
    }
    public void entersecondphonenumber(String sphnum) throws AWTException, InterruptedException
    {
    	secondphnumber.click();
    	secondphnumber.clear();
    	try
    	{
    		secondphnumber.sendKeys(sphnum);
    	}
    	catch(Exception e)
    	{
    		NumberReader.readnum(sphnum);
    	}
    	Thread.sleep(500);
    	log.info("Work Order Scond phone number  has been entered");
    }
    public void EnterInstruction(String instrcn) throws InterruptedException
    {
    	instructionbox.clear();
    	instructionbox.click();
    	instructionbox.sendKeys(instrcn);
    	Thread.sleep(500);
    	log.info("Work Order Instruction  has been entered");
    }
    public void EnterDescription(String desc) throws InterruptedException
    {
    	description.clear();
    	description.sendKeys(desc);
    	Thread.sleep(500);
    	log.info("Work Order description  has been entered");
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
    public void closewindow()
    {
    	closepopup.click();
    }
}
