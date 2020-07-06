package Execution;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseDriver.AppDriver;
import Pages.Dashboard;
import Pages.LoginPage;
import Pages.Scheduling;

public class ExecuteScheduling extends AppDriver 
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
   	 String text = dbobj.logoutoptiontest();
   	 System.out.println("Available option  is :>>  " +text);
   	 Assert.assertEquals(text, config.getProperty("Logoutoption"));
   	 log.info("Login test Completed");
    }
    @Test(priority = 1)
    public void clickschedule() throws InterruptedException
    {
    	Dashboard dbobj = new  Dashboard();
    	dbobj.clickscheduling();
    }
    @Test(priority = 2)
    public void leftClickondate() throws InterruptedException
    {
    
    	Scheduling schobj = new Scheduling();
    	try {
    	schobj.clickschdate2(5);
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    		
    	}
    }
    @Test(priority = 2)
    public void RightClickondate() throws InterruptedException
    {
    	//Prefer click type, if right click then event will open & if left click then work order will open
    	Scheduling schobj = new Scheduling();
    	try {
    	schobj.rightclick(5);
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    		
    	}
    }
}
