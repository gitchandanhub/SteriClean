package Execution;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseDriver.AppDriver;
import Pages.LoginPage;
import Pages.RegisterUser;
import Utility.ExcelUtility;

public class ExecuteRegisterUser extends AppDriver
{
	RegisterUser ruobj;
	@Test(priority = 0)
	public void openregisterpage() throws InterruptedException
	{
		LoginPage lpobj = new LoginPage();
		lpobj.navigateregisteruser();
	}
     @Test(priority = 1)
     public void EnterDetails() throws InterruptedException, IOException
     {
    	  ruobj = new RegisterUser();
    	 try
    	 {
    	 ruobj.Enterfranchise(config.getProperty("Franchise"));
    	 }
    	 catch(Exception e)
    	 {
    		 System.out.println(e);
    		 String frnch = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 0);
    		 ruobj.Enterfranchise(frnch);
    		 
    	 }
    	 String name = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 1);
    	 ruobj.Enterfirstname(name);
    	 
    	 String lname = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 2);
    	 ruobj.Enterlastname(lname);
    	 
    	 String add = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 3);
    	 ruobj.Enteraddress(add);
    	 
    	 String city = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 4);
    	 ruobj.Entercity(city);
    	 
    	 String state = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 5);
    	 ruobj.Enterstate(state);
    	 
    	 
    	 try
    	 {
          String zipc = ExcelUtility.getATdata(config.getProperty("Registeruserfilepath"), 0, 1, 6);	 
    	 ruobj.Enterzipcode2(zipc);
    	 
    	 }
    	 catch(Exception e)
    	 {
    		 System.out.println(e);
    		int zipc = ExcelUtility.numreadexcel(config.getProperty("Registeruserfilepath"), 0, 1, 6);
    		 ruobj.Enterzipcode(zipc);
    	 }
    	 try
    	 {
          String phn = ExcelUtility.getATdata(config.getProperty("Registeruserfilepath"), 0, 1, 7);	 
    	 ruobj.Enterphn(phn);
    	 
    	 }
    	 catch(Exception e)
    	 {
    		 System.out.println(e);
    		int phn = ExcelUtility.numreadexcel(config.getProperty("Registeruserfilepath"), 0, 1, 7);
    		ruobj.Enterphn(phn);
    	 }
    	 String phn = ExcelUtility.getATdata(config.getProperty("Registeruserfilepath"), 0, 1, 7);
    	 
    	 String uname = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 8);
    	 ruobj.Enteruname(uname);
    	 
    	 String pwd = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 9);
    	 ruobj.Enterpassword(pwd);
    	 
    	 String email = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 10);
    	 ruobj.Enteremail(email);
    	 
    	 
    	 String cntry = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 11);
    	 ruobj.EnterCountry(cntry);
    	 
    	 ruobj.CheckTermCondition();  	 
    	 
     }
     @Test(priority = 2)
     public void submiteform() throws InterruptedException
     {
    	 ruobj.clicksubmit();
    	 String alerttext = driver.switchTo().alert().getText();
			Thread.sleep(3000);
			System.out.println(alerttext);
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
     }
}
