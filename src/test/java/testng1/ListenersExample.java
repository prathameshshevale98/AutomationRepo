package testng1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class ListenersExample {

    public static WebDriver driver;

    @Test
    public void testCaseA(){

        System.out.println("testCaseA");
        Assert.assertTrue(true);
    }

    @Test
    public void testCaseB(){

        System.out.println("testCaseB");
        Assert.assertTrue(false);
    }

    @Test
    public void testCaseC(){

        System.out.println("TestCaseC");
        Assert.assertTrue(true);
    }
}
