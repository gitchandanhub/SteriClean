package Execution;

import org.testng.annotations.Test;

import BaseDriver.AppDriver;
import Pages.Dashboard;
import Pages.LoginPage;
import Pages.Ticket;

public class ExecuteTicket extends AppDriver 
{
	 LoginPage lpobj;
     @Test
     public void CreateTicketNew() throws InterruptedException
     {
    	 log.info("Login test Started");
    	  lpobj = new LoginPage();
    	 lpobj.EnterUsername(config.getProperty("username"));
    	 lpobj.EnterPassword(config.getProperty("password"));
    	 lpobj.clickLogin();    
    	 log.info("You are successfully logged in");
    	 Dashboard dbobj = new Dashboard();
    	 dbobj.Createticket();
    	 Ticket tcobj = new Ticket();
    	 tcobj.Enterdate("06/26/2020");
    	 tcobj.EnterJobType(1);
    	 tcobj.EnterPriorirt(2);
    	 tcobj.clickquotecheckbox();
    	 tcobj.choosefile("D:\\eclipse_workspace\\Complete_steria\\InputFiles\\Receipt.PDF");
    	 tcobj.EnterRequest("This is chandan automated test request");
    	 tcobj.clicksubmit();
     }
}
