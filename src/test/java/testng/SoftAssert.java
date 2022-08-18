package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SoftAssert {

    public static WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "F:/PRATHAMESH SHEVALE/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test(groups = "smoke")
    public void testCase() {
        driver.get("https://www.instagram.com/accounts/login/");
        Assert.assertEquals(driver.getTitle(), "Login • Instagram", "Title should be Amazon");
        System.out.println("I am Prathamesh");
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
