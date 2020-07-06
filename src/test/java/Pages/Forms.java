package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseDriver.AppDriver;

public class Forms extends AppDriver 
{
	public Forms()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='frmCreateWorkOrder']/div[3]/table[2]/tbody/tr/td/ul/li[10]")  WebElement formtab;
	@FindBy(id = "ddlFormsType")  WebElement listbox;
	@FindBy(id = "FileUploadForms") WebElement upload;
	@FindBy(id = "btnSave")  WebElement savebutton;
	@FindBy(id = "btnCancel")  WebElement cancelbutton;
	@FindBy(id = "btnPrint")  WebElement reportbutton;
	@FindBy(id = "MainContent_cmdClosePopUp")  WebElement closepopup;

	public void clickformtab() throws InterruptedException
	{
		formtab.click();
		log.info("Forms Tab have opened");
		Thread.sleep(2000);
	}

	public void Selectvalue(int index)
	{
		Select slt = new Select(listbox);
		slt.selectByIndex(index);
	}
	public void choosefile(String path)
	{
		upload.sendKeys(path);
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
