package Execution;

import java.awt.AWTException;

import org.testng.annotations.Test;

import BaseDriver.AppDriver;
import Pages.Dashboard;
import Pages.Event;
import Pages.LoginPage;

public class ExecuteEvent extends AppDriver 
{
    Dashboard dbobj;
    Event evobj;
    @Test(priority = 0)
    public void login() throws InterruptedException
    {
    	log.info("Login test Started");
      	 LoginPage lpobj = new LoginPage();
      	 lpobj.EnterUsername(config.getProperty("username"));
      	 lpobj.EnterPassword(config.getProperty("password"));
      	 lpobj.clickLogin();
      	 Thread.sleep(5000);
    }
    
    @Test(priority = 1)
    public void validateEvent() throws InterruptedException, AWTException
    {
    	 dbobj = new Dashboard();
    	 dbobj.clicknewEevents();
    	 System.out.println("Event tab opened");
    	evobj.Enterdate("07-06-2020");
    	 log.info("Event date entered");
    	 evobj.selecttype("MEETING");
    	 evobj.EnterCalltracker("Chandan");
    	 evobj.Entercalltracketph("8448740496");
    	 evobj.EnterEmail("schandan@pisoftek.com");
    	 evobj.EnterSubject("This is my subject");
    	 evobj.EnterInstruction("This is my instruction");
    	 evobj.Enternote("This is my notes");
    	 evobj.attachment("C:\\Users\\cchauhan\\git\\Strie\\Photos\\diamond.jpg");
    	 evobj.workday("07-06-2020", "10:00 PM", "12:20 PM");
    }
    
}
