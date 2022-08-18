package testng1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(ListenerExample1.class)
public class ReportsExample {

    public static WebDriver driver;
    ExtentReports reports = new ExtentReports();
    ExtentSparkReporter sparkReporter = new ExtentSparkReporter("index.html");
    ExtentTest test;

    @BeforeTest
    public void beforeTest() {
        reports.attachReporter(sparkReporter);

    }
    @Test
    public void testCaseA() {
        test = reports.createTest("Launch the browser").assignAuthor("Shiv").assignDevice("Chrome");
        test.info("User is opening the browser");
        System.out.println("testCaseA");
        Assert.assertTrue(true);
        test.pass("This test is passed");
    }

    @Test
    public void testCaseB() {
        test = reports.createTest("Launch the browser").assignAuthor("Patil").assignDevice("Internet");
        test.info("User is opening the browser");
        System.out.println("testCaseB");
        Assert.assertTrue(true);
        test.pass("This test is passed");
    }

    @Test
    public void testCaseC() {
        test = reports.createTest("Launch the browser").assignAuthor("Prasad").assignDevice("Firefox");
        test.info("User is opening the browser");
        System.out.println("testCaseC");
        Assert.assertTrue(false);
        test.pass("This test is passed");
    }

    @Test(dependsOnMethods = "testCaseB")
    public void testCaseD() {
        test = reports.createTest("Launch the browser").assignAuthor("Uday").assignDevice("Edge");
        test.info("User is opening the browser");
        System.out.println("testCaseD");
        Assert.assertTrue(true);
        test.pass("This test is passed");
    }

    @AfterTest
    public void ReportngClosed() {
        reports.flush();
    }
}