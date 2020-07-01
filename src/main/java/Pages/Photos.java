package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseDriver.AppDriver;

public class Photos extends AppDriver 
{
	public Photos()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//*[@id='frmCreateWorkOrder']/div[3]/table[2]/tbody/tr/td/ul/li[3]")  WebElement phototab;
	
	@FindBy (xpath = "//select[@id='ddlPhotoType']") WebElement photoslistbox;
	
	@FindBy (xpath = "//input[@id='FileUploadEstimatePhoto']") WebElement choosephoto;
	
	@FindBy (xpath = "//input[@id='rbAll']")  WebElement allphotoradiobutton;
	
	@FindBy (xpath = "//input[@id='rbEstimate']")   WebElement Estimatephotosradiobutton;
	
	@FindBy (xpath = "//input[@id='rbJob']")   WebElement jobphotosradiobutton;
	
	public void clickphototab() throws InterruptedException
	{
		phototab.click();
		Thread.sleep(3000);
		log.info("Phototab have opened");
	}
	
	public void selectjobphotos(int index)
	{
       Select slt = new Select(photoslistbox);
       slt.selectByIndex(index);
       log.info("Job photos have selected");
	}
	
	public void clickallphotosradiobutton()
	{
		allphotoradiobutton.click();
	   log.info("All Photos radio button have selected");
	}
	
	public void clickestimatephotoradiobutton()
	{
		Estimatephotosradiobutton.click();
		 log.info("Extimate Photos radio button have selected");
	}
	public void clickjobphotosradiobutton()
	{
		jobphotosradiobutton.click();
		 log.info("Job Photos radio button have selected");
	}
	
	public void choosephoto(String path)
	{
		choosephoto.sendKeys(path);	
		log.info("Photo have been selected");
	}
}
