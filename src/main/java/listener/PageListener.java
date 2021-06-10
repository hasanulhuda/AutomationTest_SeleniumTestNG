package listener;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;
import report.ReportListener;
import report.TestReportListener;
import utils.Utility;
import com.aventstack.extentreports.markuputils.Markup;

import java.io.IOException;

public class PageListener  extends Utility implements ITestListener {

    public void onStart(ITestContext context) {
        System.out.println("*** Test Suite " + context.getName() + " started ***");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
        TestReportListener.endTest();
        ReportListener.getInstance().flush();
        Reporter.log("*** Test Suite \" + context.getName() + \" ending ***");
    }
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
        TestReportListener.startTest(result.getMethod().getMethodName());
        Reporter.log("*** Running test method " + result.getMethod().getMethodName() + "...");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("*** Executed " + result.getMethod().getMethodName() + " test successfully...");
        TestReportListener.getTest().log(Status.PASS, "Test passed");
        Reporter.log("*** Executed \" + result.getMethod().getMethodName() + \" test successfully...");
    }

    @Override
    public void onTestFailure(ITestResult result) {
            String src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
        try {
            String path = "<img src=\"data:image/png;base64, " + src + "\" width=\"500\" height=\"800\" />";

            TestReportListener.getTest().addScreenCaptureFromPath(path);
            Reporter.log(path);
            System.out.println("Failure of test cases and its details are : "+result.getName()+result.getTestName());
            Reporter.log(result.getName()+" GAGAL BROO");
            TestReportListener.getTest().log(Status.FAIL, "Failed Case is: " + result.getMethod().getMethodName());
//            TestReportListener.getTest().addScreenCaptureFromPath(TestUtilities.takeScreenShot(result.getMethod().getMethodName()));
            TestReportListener.getTest().log(Status.FAIL, result.getMethod().getMethodName()+" FAIL with error " + result.getThrowable());

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("*** Test " + result.getMethod().getMethodName() + " skipped...");
        TestReportListener.getTest().log(Status.SKIP, "Test Skipped");
        TestReportListener.getTest().fail(result.getThrowable());
        Reporter.log("*** Test \" + result.getMethod().getMethodName() + \" skipped...");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
        Reporter.log("*** Test failed but within percentage % " + result.getMethod().getMethodName());
    }
}
