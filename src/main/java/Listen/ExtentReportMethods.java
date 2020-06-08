package Listen;

import com.aventstack.extentreports.Status;

import BaseDriver.AppDriver;

public class ExtentReportMethods extends AppDriver
{
	 public static void testpass()
     {
     extenttest = extentreport.createTest("ReportTest");
     extenttest.log(Status.PASS, "Test passed");
     }
     
     public static void testfail()
     {
     extenttest = extentreport.createTest("ReportTest");
     extenttest.log(Status.FAIL, "Test Failed");
     }
     
     public static void testskip()
     {
     extenttest = extentreport.createTest("ReportTest");
     extenttest.log(Status.SKIP, "Test skipped");
     }
}
