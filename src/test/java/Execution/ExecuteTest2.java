package Execution;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ExecuteTest2 
{
@BeforeTest
public void g()
{
System.out.println("this is test g");	
}

@Test
public void h()
{
	System.out.println("this is test h");	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	String x =    dtf.format(now);
    System.out.println(x);
}
}
