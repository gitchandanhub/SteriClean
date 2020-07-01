package Execution;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseDriver.AppDriver;
import Pages.Billing;
import Pages.Dashboard;
import Pages.LoginPage;
import Pages.WorkOrder_callTracker;
import Pages.WorkOrder_workorder;
import Pages.Photos;
import Pages.Estimate;
import Pages.Supply;
import Pages.Payments;
import Pages.Invoice;
import Pages.Receipts;
import Pages.Forms;
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
    	 System.out.println("User is :>>  " +text);
    	 Assert.assertEquals(text, config.getProperty("Loggedusernme"));
    	 log.info("Login test Completed");
     }
     @Test(priority = 1)
     public void CreateOrdercalltracker() throws InterruptedException, IOException, AWTException
     {
    	 log.info("Work order call Tracker started");
        Dashboard dbobj = new Dashboard();
        dbobj.ClicknewWorkOrder();
        WorkOrder_callTracker woctobj = new WorkOrder_callTracker();
        String date = ExcelUtility.getATdata(config.getProperty("CallTrackerFilepath"), 0, 1, 0);
        woctobj.date(date);
        Thread.sleep(1000);
        log.info("Work order call Tracker date Selected");
        String eventtype = ExcelUtility.getATdata(config.getProperty("CallTrackerFilepath"), 0, 1, 1);
        System.out.println(eventtype);
        try
        {
        	woctobj.selectEventtype(eventtype);
        	Thread.sleep(2000);
        }
        catch(Exception e)
        {
        	woctobj.selectEventtype(2);
        	Thread.sleep(2000);
        }
        Thread.sleep(1000);
        log.info("Work order call Tracker EventType Selected");
        String calltracker  = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 2);
        woctobj.EnterCalltrackername(calltracker);
        Thread.sleep(500);
        log.info("Work order call Tracker Entered");
        try
        {
        	
        	String calltrackerphone = ExcelUtility.getATdata(config.getProperty("CallTrackerFilepath"), 0, 1, 3);
        	System.out.println(calltrackerphone);
        	woctobj.EnterCalltrackerphone(calltrackerphone);
        }
            catch(Exception e)
        {
            	System.out.println(e);
            	 try {
                 	String calltrackerphone = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 3);
                 	woctobj.EnterCalltrackerphone2(calltrackerphone);
                 	 Thread.sleep(500);
                 }
                 catch(Exception e2)
                 {
                 	String calltrackerphone2 = ExcelUtility.getATdata(config.getProperty("CallTrackerFilepath"), 0, 1, 3);
                 	woctobj.EnterCalltrackerphone2(calltrackerphone2);
                 	 Thread.sleep(500);
                 }
        }
        log.info("Work order call Tracker phone number Entered");           
              
        String calltrackeremail  = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 4);
        woctobj.EnterCalltrackeremail(calltrackeremail);
        Thread.sleep(500);
        log.info("Work order call Tracker Email address Entered");  
        String requestedby  = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 5);
        woctobj.Enterreqby(requestedby);
        Thread.sleep(500);
        log.info("Work order call Tracker Requested by Entered");
        try
        {
        String phnumber  = ExcelUtility.getATdata(config.getProperty("CallTrackerFilepath"), 0, 1, 6);
        woctobj.EnterPhonenumber(phnumber);
        Thread.sleep(500);
        }
        catch(Exception e) {
        try
        {
        String phnumber  = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 6);
        woctobj.EnterPhonenumber2(phnumber);
        Thread.sleep(500);
        }
        catch(Exception e2)
        {
        	String phnumber  = ExcelUtility.getATdata(config.getProperty("CallTrackerFilepath"), 0, 1, 6);
        	woctobj.EnterPhonenumber2(phnumber);
            Thread.sleep(500);
        }
        }
        log.info("Work order call Tracker number Entered");  
        String Email  = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 7);
        woctobj.EnterEmail(Email);
        Thread.sleep(500);
        log.info("Work order call Tracker Email Entered"); 
        String  jobaddress = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 8);
        woctobj.EnterJobaddress(jobaddress);
        Thread.sleep(500);
        log.info("Work order call Tracker job address Entered"); 
        String  city = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 9);
        woctobj.EnterCity(city);
        Thread.sleep(500);
        log.info("Work order call Tracker city Entered"); 
        String  state = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 10);
        woctobj.EnterState(state);
        Thread.sleep(500);
        log.info("Work order call Tracker state Entered"); 
        try
        {
        	String  zipcode = ExcelUtility.getATdata(config.getProperty("CallTrackerFilepath"), 0, 1, 11);
        	woctobj.EnterZip(zipcode);
        }
        catch(Exception ee)
        {
        try
        {
        	String  zipcode = ExcelUtility.getATdata(config.getProperty("CallTrackerFilepath"), 0, 1, 11);
        	woctobj.EnterZip2(zipcode);
            Thread.sleep(500);
        }
        catch(Exception e)
        {
        int zipcode = ExcelUtility.numreadexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 11);
        woctobj.EnterZip2(String.valueOf(zipcode));
        Thread.sleep(500);
        }
        }
        log.info("Work order call Tracker Zipcode Entered"); 
        String  casenum = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 12);
        woctobj.EnterCaseno(casenum);
        Thread.sleep(500);
        log.info("Work order call Tracker case number Entered"); 
        try
        {
        	String  refby = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 13);
        	woctobj.SelectRefferedby(refby);
        	Thread.sleep(500);
        }
        catch(Exception e)
        {
        	
        	woctobj.SelectRefferedby(2);
        	Thread.sleep(500);
        }
        log.info("Work order call Tracker reffed by selected "); 
        String  refby = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 14);
        woctobj.EnterRefferedbydesc(refby);
        Thread.sleep(500);
        log.info("Work order call Tracker reffed by description"); 
        String  techevent = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 15);
        woctobj.EnterTechorevent(techevent);
        Thread.sleep(1500);
        log.info("Work order call Tracker Tech Event Entered"); 
        String  contactmadewith = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 17);
        String  contactmadewithtext = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 18);
        if(contactmadewith.equalsIgnoreCase("Transferred To"))
        {
        	woctobj.Selectcontactmadewith(1);
        	Thread.sleep(500);
        	woctobj.EnterContactmadewithtext(contactmadewithtext);
        }
        else if(contactmadewith.equalsIgnoreCase("NO Answer To Transfer"))
        {
        	woctobj.Selectcontactmadewith(2);
        	Thread.sleep(500);
         }
        else if(contactmadewith.equalsIgnoreCase("Email Forwarded"))
        {
        	woctobj.Selectcontactmadewith(3);
        	Thread.sleep(500);
        	
        }
        else if(contactmadewith.equalsIgnoreCase("Text"))
        {
        	try{woctobj.Selectcontactmadewith(4);
        	Thread.sleep(500);
        	}
        	catch(Exception e)
        	{
        		woctobj.Selectcontactmadewith("Text");
        	}
        	woctobj.EnterContactmadewithtext(contactmadewithtext);
        }
        else if(contactmadewith.equalsIgnoreCase("None"))
        {
        	woctobj.Selectcontactmadewith(5);
        	Thread.sleep(500);
        	woctobj.EnterContactmadewithtext(contactmadewithtext);
        }
        log.info("Work order call Tracker Contact made with Entered"); 
        woctobj.Sendemailcheckbox();
        
        String  comment = ExcelUtility.readexcel(config.getProperty("CallTrackerFilepath"), 0, 1, 19);        
        woctobj.Entercomments(comment);
        log.info("Work order call Tracker comment Entered"); 
        woctobj.addcmtbutton();
        Thread.sleep(3000);
        log.info("Work order call Tracker Completed");
     }
     @Test(priority = 2)
     public void WorkOrder() throws InterruptedException, IOException, AWTException
     {
    	 log.info("Work order started");
    	 WorkOrder_workorder   woobj = new WorkOrder_workorder();
    	 woobj.clickworkordertab();
    	 String techni = ExcelUtility.readexcel(config.getProperty("WorkOrderFilepath"), 0, 1, 8);
    	 woobj.selecttechnician("shiva");
    	 String cntry = ExcelUtility.readexcel(config.getProperty("WorkOrderFilepath"), 0, 1, 13);
    	 
    	 woobj.EnterCountry(cntry);
    	 String sccon = ExcelUtility.readexcel(config.getProperty("WorkOrderFilepath"), 0, 1, 14);
    	 woobj.enteronscenecontact(sccon);
    	 String sccon2 = ExcelUtility.readexcel(config.getProperty("WorkOrderFilepath"), 0, 1, 15);
    	 woobj.entersecondonesceencontact(sccon2);
    	 
    	 String phnum = ExcelUtility.getATdata(config.getProperty("WorkOrderFilepath"), 0, 1, 16);
    	 woobj.Enterphnumber(phnum);
    	 String phnum2 = ExcelUtility.getATdata(config.getProperty("WorkOrderFilepath"), 0, 1, 17);
    	 woobj.entersecondphonenumber(phnum2);
    	 
    	 String inst = ExcelUtility.readexcel(config.getProperty("WorkOrderFilepath"), 0, 1, 18);
    	 woobj.EnterInstruction(inst);
    	 String desc = ExcelUtility.readexcel(config.getProperty("WorkOrderFilepath"), 0, 1, 19);
    	 woobj.EnterDescription(desc);
    	 log.info("Work order Completed");
     }
     @Test(priority = 3)
     public void Photos() throws InterruptedException
     {
    	 log.info("Operations on photos tab have started");
    	 Photos phobj = new Photos();
    	 phobj.clickphototab();
    	 phobj.choosephoto(config.getProperty("photospath2"));
    	 log.info("Operations on photos tab have completed");
     }
     @Test(priority = 4)
     public void Estimate() throws InterruptedException
     {
    	 log.info("Operations on Estimate tab have started");
    	 Estimate  etobj = new Estimate();
    	 etobj.clickestimatetab();
    	 try
    	 {
    	 etobj.chooseFile(config.getProperty("Estimatefilepath"));
    	 }
    	 catch(Exception e)
    	 {
    		 System.out.println(e);
    		 etobj.chooseFile("D:\\eclipse_workspace\\Complete_steria\\InputFiles\\Estimate.PDF");
    	 }
    	 log.info("Operations on Estimate tab have Completed");
     }
     @Test (priority = 5)
     public void billing() throws IOException, InterruptedException
     {
    	 log.info("Operations on billing tab have started");
    	 String name = ExcelUtility.getATdata(config.getProperty("BillingFilepath"), 0, 1, 0);
    	 String phone = ExcelUtility.getATdata(config.getProperty("BillingFilepath"), 0, 1, 1);
    	 String email = ExcelUtility.getATdata(config.getProperty("BillingFilepath"), 0, 1, 2);
    	 String add = ExcelUtility.getATdata(config.getProperty("BillingFilepath"), 0, 1, 3);
    	 String city = ExcelUtility.getATdata(config.getProperty("BillingFilepath"), 0, 1, 4);
    	 String state = ExcelUtility.getATdata(config.getProperty("BillingFilepath"), 0, 1, 5);
    	 String country = ExcelUtility.getATdata(config.getProperty("BillingFilepath"), 0, 1, 6);
    	 String zip = ExcelUtility.getATdata(config.getProperty("BillingFilepath"), 0, 1, 7);
    	 String involvement = ExcelUtility.getATdata(config.getProperty("BillingFilepath"), 0, 1, 8);
    	 Billing biobj = new Billing();
    	 biobj.Clickbillingtab();
    	 biobj.EnterName(name);
    	 biobj.Enterphone(phone);
    	 biobj.EnterEmail(email);
    	 biobj.EnterAddress(add);
    	 biobj.Entercity(city);
    	 biobj.EnterState(state);
    	 biobj.EnterCountry(country);
    	 biobj.Enterzipcode(zip);
    	 biobj.EnterInvolvement(involvement);
    	 log.info("Operations on billing tab have completed");
         
     }
     @Test (priority = 6)
     public void Supply() throws IOException, InterruptedException
     {
    	 log.info("Operations on Supply tab have started");
      Supply suobj = new Supply();
        suobj.Clicksupplytab();
        log.info("Operations on Supply tab have completed");
     }
     @Test(priority = 7)
     public void payment() throws InterruptedException
     {
    	 log.info("Operations on Payment tab have started");
    	 Payments pyobj = new Payments();
    	 pyobj.Clickpaymenttab();
    	 pyobj.depositeamount(100);
    	 log.info("Operations on Payment tab have completed");
     }
     @Test(priority = 8)
     public void Receipt() throws InterruptedException
     {
    	 log.info("Operations on Receipt tab have started");
    	 Receipts rpobj = new Receipts();
    	 rpobj.clickreceipttab();
    	 try
    	 {
    	 rpobj.uploadfile(config.getProperty("Receiptfilepath"));
    	 }
    	 catch(Exception e) 
    	 {
    		 rpobj.uploadfile("D:\\eclipse_workspace\\Complete_steria\\InputFiles\\Receipt.PDF");	 
    	 }
    	 log.info("Operations on receipt tab have completed");
     }
     @Test(priority = 9)
     public void invoice() throws InterruptedException
     {
    	 log.info("Operations on Invoice tab have started");
    	 Invoice ivobj = new Invoice();
    	 ivobj.ClickInvoicetab();
    	 try
    	 {
    	 ivobj.uploadfile(config.getProperty("Invoicefilepath"));
    	 }
    	 catch(Exception e)
    	 {
    		 ivobj.uploadfile("D:\\eclipse_workspace\\Complete_steria\\InputFiles\\Invoice.PDF");	 
    	 }
    	 log.info("Operations on invoice tab have completed");
    	 Thread.sleep(1000);
    	 }
     @Test(priority = 10)
     public void form() throws InterruptedException
     {
    	 log.info("Operations on form tab have started");
    	 Forms fmobj = new Forms();
    	 fmobj.clickformtab();
    	 Thread.sleep(1000);
    	 fmobj.Selectvalue(2);
    	 fmobj.choosefile("D:\\eclipse_workspace\\Complete_steria\\InputFiles\\W-RoomDiagram-05312020001-01062020235018479.PDF");
    	 log.info("Operations on form tab have completed");
     }
     @Test(priority = 11)
     public void Submit() throws InterruptedException
     {
		
		  log.info("Starting form submission");
		  Forms fmobj = new Forms();
		  fmobj.clicksavebutton(); 
		  String alerttext =  driver.switchTo().alert().getText();
		  Thread.sleep(3000);
		  System.out.println("Message after Submission ==>"   +alerttext); 
		  Thread.sleep(3000);
		  driver.switchTo().alert().accept(); 
		  log.info("Completed form submission");
		 
     }
}
