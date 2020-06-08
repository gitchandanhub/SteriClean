package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class RegisterUser extends AppDriver 
{
	public RegisterUser()
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy (xpath = "//input[@id='txtcompany']")  WebElement franchise ;
	@FindBy (xpath = "//input[@id='txtFirstName']")  WebElement firstname ;
	@FindBy (xpath = "//input[@id='txtLastName']")  WebElement lastname;
	@FindBy (xpath = "//input[@id='txtAddress']")  WebElement Address ;
	@FindBy (xpath = "//input[@id='txtCity']")  WebElement city;
	@FindBy (xpath = "//input[@id='txtState']")  WebElement state;
	@FindBy (xpath = "//input[@id='txtZip']")  WebElement zipcode ;
	@FindBy (xpath = "//input[@id='txtPhone']")  WebElement phone ;
	@FindBy (xpath = "//input[@id='txtUserName']")  WebElement username ;
	@FindBy (xpath = "//input[@id='txtPassword']")  WebElement password ;
	@FindBy (xpath = "//input[@id='txtEmailAddress']")  WebElement emailaddress ;
	@FindBy (xpath = "//input[@id='txtCountry']")  WebElement Country;
	@FindBy (xpath = "//input[@id='check_terms']")  WebElement termsconditionchk ;
	@FindBy (xpath = "//input[@id='btnSubmit']")  WebElement submitbtn ;
	@FindBy (xpath = "//input[@id='btnNew']")  WebElement newbtn ;
	@FindBy (xpath = "//input[@id='btnCancel']")  WebElement cancelbtn ;

	public void Enterfranchise(String frnch) throws InterruptedException
	{
		
		franchise.clear();
		franchise.sendKeys(frnch);
		franchise.sendKeys(Keys.TAB);
		Thread.sleep(5000);	
		
		
	}
	public void Enterfirstname(String fname)
	{
		firstname.clear();	   
		firstname.sendKeys(fname);	
	}
	public void Enterlastname(String lname)
	{
		lastname.clear();
		lastname.sendKeys(lname);
	}
	public void Enteraddress(String address)
	{
		Address.clear();
		Address.sendKeys(address);
	}
	public void Entercity(String cty)
	{
		city.clear();
		city.sendKeys(cty);
	}
	public void Enterstate(String stt)
	{
		state.clear();
		state.sendKeys(stt);
	}
	public void Enterzipcode(int zipc )
	{
		zipcode.clear();
		zipcode.sendKeys(String.valueOf(zipc));
	}
	
	public void Enterzipcode2(String zipc )
	{
		zipcode.clear();
		zipcode.sendKeys(zipc);
	}
	public void Enterphn(int phne)
	{
		phone.clear();
		phone.sendKeys(String.valueOf(phne));
	}
	public void Enterphn(String phne)
	{
		phone.clear();
		phone.sendKeys(phne);
	}
	public void Enteruname(String usrname)
	{
		username.clear();
		username.sendKeys(usrname);
	}
	public void Enterpassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}
	public void Enteremail(String email)
	{
		emailaddress.clear();
		emailaddress.sendKeys(email);
	}
	public void EnterCountry(String cntry)
	{
		Country.clear();
		Country.sendKeys(cntry);
	}
	public void CheckTermCondition()
	{
		termsconditionchk.click();
	}
	public void clicksubmit()
	{
		submitbtn.click();
	}
	public void clicknew() throws InterruptedException
	{
		newbtn.click();
		Thread.sleep(3000);
	}
	public void clickcancel()
	{
		cancelbtn.click();
	}

}
