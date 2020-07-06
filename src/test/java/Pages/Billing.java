package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class Billing extends AppDriver 
{
	public Billing()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='litest']") WebElement billingtab;
	@FindBy(id = "IndName")  WebElement name;
	@FindBy(id = "IndPhone")  WebElement phone;
	@FindBy(id = "IndEmail")  WebElement email;
	@FindBy(id = "IndStreet")  WebElement streetaddress;
	@FindBy(id = "IndCity")  WebElement city;
	@FindBy(id = "IndState")  WebElement state;
	@FindBy(id = "IndCountry")  WebElement country;
	@FindBy(id = "IndZip")  WebElement zipcode;
	@FindBy(id = "IndInvolvement")  WebElement involvement;
	public void Clickbillingtab() throws InterruptedException
	{
		billingtab.click();
		Thread.sleep(3000);
		log.info("Billing tab have opened");
	}
	public void EnterName(String nme)
	{
		name.clear();
		name.sendKeys(nme);
		log.info("Individual Name have entered");
	}
	
	public void Enterphone(String ph)
	{
		phone.clear();
		phone.sendKeys(ph);
		log.info("Individual Phone have entered");
	}
	public void EnterEmail(String emil)
	{
		email.clear();
		email.sendKeys(emil);
		log.info("Individual Email have entered");
	}
	public void EnterAddress(String addrs)
	{
		streetaddress.clear();
		streetaddress.sendKeys(addrs);
		log.info("Individual Email Address have entered");
	}
	public void Entercity(String cty)
	{
		city.clear();
		city.sendKeys(cty);
		log.info("Individual city have entered");
	}
	
	public void EnterState(String stt)
	{
		state.clear();
		state.sendKeys(stt);
		log.info("Individual state have entered");
	}
	public void EnterCountry(String cnty)
	{
		country.clear();
		country.sendKeys(cnty);
		log.info("Individual Country have entered");
	}
	public void Enterzipcode(String zipcd)
	{
		zipcode.clear();
		zipcode.sendKeys(zipcd);
		log.info("Individual Zipcode have entered");
	}
	public void EnterInvolvement(String invo)
	{
		involvement.clear();
		involvement.sendKeys(invo);
		log.info("Individual Involvement have entered");
	}
}
