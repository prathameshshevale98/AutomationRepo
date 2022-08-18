package testng1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExample1 implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure");

    }
    public void testCase1(){
        System.out.println("testCase1");
    }
    public void testCase2(){
        System.out.println("testCase2");
    }
    public void testCase3(){
        System.out.println("testCase3");
    }
    public void testCase4(){
        System.out.println("testCase4");
    }

}