package Execution;

import java.awt.AWTException;
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
     public void EnterDetails() throws InterruptedException, IOException, AWTException
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
    	 Thread.sleep(1000);
    	 String name = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 1);
    	 ruobj.Enterfirstname(name);
    	 Thread.sleep(1000);
    	 String lname = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 2);
    	 ruobj.Enterlastname(lname);
    	 Thread.sleep(1000);
    	 String add = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 3);
    	 ruobj.Enteraddress(add);
    	 Thread.sleep(1000);
    	 String city = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 4);
    	 ruobj.Entercity(city);
    	 Thread.sleep(1000);
    	 String state = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 5);
    	 ruobj.Enterstate(state);
    	 Thread.sleep(1000);
    	 
    	 try
    	 {
          String zipc = ExcelUtility.getATdata(config.getProperty("Registeruserfilepath"), 0, 1, 6);	
          System.out.println(zipc);
    	  ruobj.Enterzipcode3(zipc);
    	 
    	 }
    	 catch(Exception e)
    	 {
    		 String zipc = ExcelUtility.getATdata(config.getProperty("Registeruserfilepath"), 0, 1, 6);
    		 ruobj.Enterzipcode2(zipc);
    	 }
    	 Thread.sleep(1000);
    	 try
    	 {
          String phn = ExcelUtility.getATdata(config.getProperty("Registeruserfilepath"), 0, 1, 7);	 
    	 ruobj.Enterphn2(phn);
    	 
    	 }
    	 catch(Exception e)
    	 {
    		 String phn = ExcelUtility.getATdata(config.getProperty("Registeruserfilepath"), 0, 1, 7);	
    		ruobj.Enterphn(phn);
    	 }
    	 Thread.sleep(1000);
    	 
    	 String uname = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 8);
    	 ruobj.Enteruname(uname);
    	 Thread.sleep(1000);
    	 String pwd = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 9);
    	 ruobj.Enterpassword(pwd);
    	 Thread.sleep(1000);
    	 String email = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 10);
    	 ruobj.Enteremail(email);
    	 Thread.sleep(1000);
    	 
    	 String cntry = ExcelUtility.readexcel(config.getProperty("Registeruserfilepath"), 0, 1, 11);
    	 ruobj.EnterCountry(cntry);
    	 Thread.sleep(1000);
    	 ruobj.CheckTermCondition();  	 
    	 Thread.sleep(1000);
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
