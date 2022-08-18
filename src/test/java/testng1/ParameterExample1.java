package testng1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;


public class ParameterExample1 {

    public static WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethod(String browserName) {
       if (browserName.equals("chrome")) {
           System.setProperty("webdriver.chrome.driver", "F:/PRATHAMESH SHEVALE/chromedriver_win32/chromedriver.exe");
           driver = new ChromeDriver();
       }else
           if (browserName.equals("edge")) {
           System.setProperty("webdriver.chrome.driver", "F:/PRATHAMESH SHEVALE/edgedriver_win64/msedgedriver.exe");
           driver = new EdgeDriver();
       }else
               System.out.println("Please select correct browser");
        driver.manage().window().maximize();
    }
    @Parameters({"name", "city"})
    @Test
    public void verifyParameterization(String name, String city){
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(name + " " + city);
        element.sendKeys(Keys.ENTER);
    }
    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
