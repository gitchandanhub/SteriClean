package Pages;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class Forgetpassword  extends AppDriver 
{
	public Forgetpassword()
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy (xpath = "//input[@id='txtUName']")  WebElement usrnm;
	@FindBy (xpath = "//input[@id='txtUserEmail']")  WebElement email;
	@FindBy (xpath = "//input[@id='rdtxtUserEmail']")  WebElement emailradiobutton;
	@FindBy (xpath = "//input[@id='btnSubmit']")  WebElement submitbutton;

	
	public void verifyforgetpwd() throws InterruptedException
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Do you have valid registered email access, reply in yes or no");
		String userereply = scn.next();
		if(userereply.equalsIgnoreCase("Yes")) {
			System.out.println("To recorver the password what will you prefer username or email?");
			String input = scn.next();
			if(input.equalsIgnoreCase("Username"))
			{
				System.out.println("Please Enter your username");
				String uname = scn.next();
				usrnm.sendKeys(uname);
				
				submitbutton.click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				String alerttext = driver.switchTo().alert().getText();
				System.out.println(alerttext);
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
				Thread.sleep(3000);

			}
			else if(input.equalsIgnoreCase("Email"))
			{
				System.out.println("Please Enter your Email");
				String emails = scn.next();
				
				emailradiobutton.click();
				
				email.sendKeys(emails);
				
				submitbutton.click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				String alerttext = driver.switchTo().alert().getText();
				Thread.sleep(3000);
				System.out.println(alerttext);
				Thread.sleep(3000);
				driver.switchTo().alert().accept();

			}


		}
		else
		{
			System.out.println("Sorry you can't recover your password, contact to admin");
		}

	}
}
