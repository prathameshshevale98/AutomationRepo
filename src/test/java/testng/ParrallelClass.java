package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParrallelClass {

    public static WebDriver driver;

    @BeforeMethod
    public void beforeMetghod() {
        System.setProperty("webdriver.chrome.driver", "F:/PRATHAMESH SHEVALE/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void testCase1(){
        driver.get("https://www.facebook.com/");
    }
    @Test
    public void testCase2() {
        driver.get("https://www.instagram.com/accounts/login/");
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
