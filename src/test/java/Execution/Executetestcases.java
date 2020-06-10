package Execution;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseDriver.AppDriver;
import Pages.Dashboard;
import Pages.LoginPage;
import Pages.WorkOrder_callTracker;
import Pages.WorkOrder_workorder;
import Utility.ExcelUtility;
import Utility.NumberReader;

@Listeners(Listen.TestNG_Listeners.class)

public class Executetestcases  extends AppDriver 
{
     @Test(priority = 0)
     public void loginTest()
     { 
    	 log.info("Login test Started");
    	 LoginPage lpobj = new LoginPage();
    	 lpobj.EnterUsername(config.getProperty("username"));
    	 lpobj.EnterPassword(config.getProperty("password"));
    	 lpobj.clickLogin();
    	 Dashboard dbobj = new Dashboard();
    	 String text = dbobj.loggeduser();
    	 System.out.println(text);
    	 Assert.assertEquals(text, config.getProperty("Loggedusernme"));
    	 log.info("Login test Completed");
     }
     @Test(priority = 1)
     public void CreateOrdercalltracker() throws InterruptedException, IOException, AWTException
     {
    	 log.info("Work order call Tracker started");
        Dashboard dbobj = new Dashboard();
        dbobj.ClicknewWorkOrder();
        WorkOrder_callTracker wocobj = new WorkOrder_callTracker();
        String date = ExcelUtility.getATdata(config.getProperty("CallTrackerFilepath"), 0, 1, 0);
        wocobj.date(date);
        Thread.sleep(1000);
        log.info("Work order call Tracker date Selected");
        String eventtype = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 1);
        try
        {
        	wocobj.selectEventtype(eventtype);
        	Thread.sleep(2000);
        }
        catch(Exception e)
        {
        	wocobj.selectEventtype(2);
        	Thread.sleep(2000);
        }
        Thread.sleep(1000);
        log.info("Work order call Tracker EventType Selected");
        String calltracker  = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 2);
        wocobj.EnterCalltrackername(calltracker);
        Thread.sleep(500);
        log.info("Work order call Tracker Entered");
        try
        {
        	
        	String calltrackerphone = ExcelUtility.getATdata(config.getProperty("CallTrackerFilepath"), 0, 1, 3);
        	System.out.println(calltrackerphone);
        	wocobj.EnterCalltrackerphone(calltrackerphone);
        }
            catch(Exception e)
        {
            	System.out.println(e);
            	 try {
                 	String calltrackerphone = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 3);
                 	wocobj.EnterCalltrackerphone2(calltrackerphone);
                 	 Thread.sleep(500);
                 }
                 catch(Exception e2)
                 {
                 	String calltrackerphone2 = ExcelUtility.getATdata(config.getProperty("CallTrackerFilepath"), 0, 1, 3);
                 	wocobj.EnterCalltrackerphone2(calltrackerphone2);
                 	 Thread.sleep(500);
                 }
        }
        log.info("Work order call Tracker phone number Entered");           
              
        String calltrackeremail  = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 4);
        wocobj.EnterCalltrackeremail(calltrackeremail);
        Thread.sleep(500);
        log.info("Work order call Tracker Email address Entered");  
        String requestedby  = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 5);
        wocobj.Enterreqby(requestedby);
        Thread.sleep(500);
        log.info("Work order call Tracker Requested by Entered");
        try
        {
        String phnumber  = ExcelUtility.getATdata(config.getProperty("CallTrackerFilepath"), 0, 1, 6);
        wocobj.EnterPhonenumber(phnumber);
        Thread.sleep(500);
        }
        catch(Exception e) {
        try
        {
        String phnumber  = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 6);
        wocobj.EnterPhonenumber2(phnumber);
        Thread.sleep(500);
        }
        catch(Exception e2)
        {
        	String phnumber  = ExcelUtility.getATdata(config.getProperty("CallTrackerFilepath"), 0, 1, 6);
            wocobj.EnterPhonenumber2(phnumber);
            Thread.sleep(500);
        }
        }
        log.info("Work order call Tracker number Entered");  
        String Email  = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 7);
        wocobj.EnterEmail(Email);
        Thread.sleep(500);
        log.info("Work order call Tracker Email Entered"); 
        String  jobaddress = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 8);
        wocobj.EnterJobaddress(jobaddress);
        Thread.sleep(500);
        log.info("Work order call Tracker job address Entered"); 
        String  city = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 9);
        wocobj.EnterCity(city);
        Thread.sleep(500);
        log.info("Work order call Tracker city Entered"); 
        String  state = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 10);
        wocobj.EnterState(state);
        Thread.sleep(500);
        log.info("Work order call Tracker state Entered"); 
        try
        {
        	String  zipcode = ExcelUtility.getATdata(config.getProperty("CallTrackerFilepath"), 0, 1, 11);
        	wocobj.EnterZip(zipcode);
        }
        catch(Exception ee)
        {
        try
        {
        	String  zipcode = ExcelUtility.getATdata(config.getProperty("CallTrackerFilepath"), 0, 1, 11);
            wocobj.EnterZip2(zipcode);
            Thread.sleep(500);
        }
        catch(Exception e)
        {
        int zipcode = ExcelUtility.numreadexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 11);
        wocobj.EnterZip2(String.valueOf(zipcode));
        Thread.sleep(500);
        }
        }
        log.info("Work order call Tracker Zipcode Entered"); 
        String  casenum = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 12);
        wocobj.EnterCaseno(casenum);
        Thread.sleep(500);
        log.info("Work order call Tracker case number Entered"); 
        try
        {
        	String  refby = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 13);
        	wocobj.SelectRefferedby(refby);
        	Thread.sleep(500);
        }
        catch(Exception e)
        {
        	
        	wocobj.SelectRefferedby(2);
        	Thread.sleep(500);
        }
        log.info("Work order call Tracker reffed by selected "); 
        String  refby = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 14);
        wocobj.EnterRefferedbydesc(refby);
        Thread.sleep(500);
        log.info("Work order call Tracker reffed by description"); 
        String  techevent = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 15);
        wocobj.EnterTechorevent(techevent);
        Thread.sleep(1500);
        log.info("Work order call Tracker Tech Event Entered"); 
        String  contactmadewith = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 17);
        String  contactmadewithtext = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 18);
        if(contactmadewith.equalsIgnoreCase("Transferred To"))
        {
        	wocobj.Selectcontactmadewith(1);
        	Thread.sleep(500);
        	wocobj.EnterContactmadewithtext(contactmadewithtext);
        }
        else if(contactmadewith.equalsIgnoreCase("NO Answer To Transfer"))
        {
        	wocobj.Selectcontactmadewith(2);
        	Thread.sleep(500);
         }
        else if(contactmadewith.equalsIgnoreCase("Email Forwarded"))
        {
        	wocobj.Selectcontactmadewith(3);
        	Thread.sleep(500);
        	
        }
        else if(contactmadewith.equalsIgnoreCase("Text"))
        {
        	try{wocobj.Selectcontactmadewith(4);
        	Thread.sleep(500);
        	}
        	catch(Exception e)
        	{
        		wocobj.Selectcontactmadewith("Text");
        	}
        	wocobj.EnterContactmadewithtext(contactmadewithtext);
        }
        else if(contactmadewith.equalsIgnoreCase("None"))
        {
        	wocobj.Selectcontactmadewith(5);
        	Thread.sleep(500);
        	wocobj.EnterContactmadewithtext(contactmadewithtext);
        }
        log.info("Work order call Tracker Contact made with Entered"); 
        wocobj.Sendemailcheckbox();
        
        String  comment = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 19);        
        wocobj.Entercomments(comment);
        log.info("Work order call Tracker comment Entered"); 
        wocobj.addcmtbutton();
        log.info("Work order call Tracker Completed");
     }
     @Test(priority = 2)
     public void WorkOrder()
     {
    	 log.info("Work order started");
    	 
    	 
    	 
    	 log.info("Work order Completed");
     }
}
