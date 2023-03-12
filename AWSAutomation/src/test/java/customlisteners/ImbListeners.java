package customlisteners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ImbListeners implements ISuiteListener, ITestListener {
	@Override
	public void onStart(ISuite suite) {
		System.out.println(suite.getName() + "Execution has been Started");

	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println(suite.getName() + "Execution has been Finished");
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " : is failed and Screenshot has been Taken");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName() + "Started Executing");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName() + "Finished Executing");
	}

}
