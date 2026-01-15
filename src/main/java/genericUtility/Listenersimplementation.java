package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listenersimplementation implements ITestListener{
	
     ExtentReports reports;
     ExtentTest test;
	 JavaUtility jutil = new JavaUtility();
	 String datestamp = jutil.getcalendarDetails("dd-MM-YYYY hh-mm-ss");
	 
	@Override
	public void onTestStart(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"on test started");
		Reporter.log(methodName+"on test started");
//		creating fields in generated report for every @Test method executing
		test=reports.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"on test success");
		Reporter.log(methodName+"on test success");
		test.log(Status.PASS, methodName+"on test success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"on test failure");
		Reporter.log(methodName+"on test failure");
		test.log(Status.FAIL,methodName+"fail");
		test.log(Status.INFO,result.getThrowable());
		
		 String screenshotname = methodName+"-"+datestamp;
		  seleniumUtility sutil = new seleniumUtility();
		 try {
		 String path = sutil.takewebpagescreenshot(Baseclass.sdriver,screenshotname);
		 test.addScreenCaptureFromPath(path);
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"on test skipped");
		Reporter.log(methodName+"on test skipped");
		test.log(Status.SKIP, methodName+"on test skipped executed");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("on test executed");
		Reporter.log("on start executed");
//		configuring the extent reports
		ExtentSparkReporter reporter=new ExtentSparkReporter("./Extent Reports/report-"+datestamp+".html");
		
		reporter.config().setDocumentTitle("VTiger report");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("vtiger");
		
//		generating an empty report
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base URL", "http://localhost/");
		reports.setSystemInfo("baseplatform","linux");
		reports.setSystemInfo("base browser", "chrome");
		reports.setSystemInfo("test engineer", "rwethu");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("on test started");
		Reporter.log("on finish executed");
//		flushing out the report
		reports.flush();
	}
	

}
