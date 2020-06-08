package Execution;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseDriver.AppDriver;
import Pages.Forgetpassword;
import Pages.LoginPage;
@Listeners(Listen.TestNG_Listeners.class)
public class ExecuteForgetPassword extends AppDriver 
{
	@Test(priority = 0)
	public void opneforgetpwdpage() throws InterruptedException
	{
		LoginPage lpobj = new LoginPage();
		lpobj.clickforgetpwd();
	}
	@Test(priority = 1)
	public void verifyforgetpassword() throws InterruptedException
	{
		Forgetpassword fpobj = new Forgetpassword();
		log.info("Forgetpassword  test Started");
	
		fpobj.verifyforgetpwd();
		log.info("Forgetpassword  test Completed");
	}
}
