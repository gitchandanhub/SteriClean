package Execution;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseDriver.AppDriver;
import Pages.Dashboard;
import Pages.LoginPage;
import Pages.WorkOrder_callTracker;

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
     public void CreateOrder() throws InterruptedException
     {
    	 log.info("Work order started");
        Dashboard dbobj = new Dashboard();
        dbobj.ClicknewWorkOrder();
        WorkOrder_callTracker wocobj = new WorkOrder_callTracker();
        wocobj.selectEventtype(2);
        Thread.sleep(2000);
        wocobj.Enterreqby("chandan");
     }
}
