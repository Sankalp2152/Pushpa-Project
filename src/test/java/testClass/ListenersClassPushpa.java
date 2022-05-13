package testClass;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utility.Screenshot;

public class ListenersClassPushpa extends BaseTestPushpa implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test Case Starts : "+ result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Passed : "+ result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed : "+ result.getName());
		try
		{
			Screenshot.capturescreen1(driver, result.getName());
		}
		catch (IOException e) 
		{
		System.out.println("Exception Arrived");	
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Skipped : "+ result.getName());
	}

	public void onStart(ITestContext context) {
		System.out.println("Test Started : "+ context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Finished : "+ context.getName());
	}

}

