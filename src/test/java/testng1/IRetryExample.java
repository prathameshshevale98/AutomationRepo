package testng1;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class IRetryExample implements IRetryAnalyzer {

    public boolean retry(ITestResult iTestResult) {
        int maxcount = 2, minCount = 0;
        while (minCount < maxcount) {
            minCount++;
            return false;
        }
        return true;
    }

    @Test(retryAnalyzer = IRetryExample.class)
    public void testCaseA(){
        Assert.assertTrue(true);
    }
    @Test(retryAnalyzer = IRetryExample.class)
    public void testCaseB(){
        Assert.assertTrue(false);
    }
    @Test(retryAnalyzer = IRetryExample.class)
    public void testCaseC(){
        Assert.assertTrue(true);
    }
    @Test(retryAnalyzer = IRetryExample.class)
    public void testCaseD() {
        Assert.assertTrue(true);
    }
    @Test(retryAnalyzer = IRetryExample.class)
    public void testCaseE() {
        Assert.assertTrue(false);
    }
}

