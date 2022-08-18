package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunExample {

    @Test()
    public void methodA(){
        System.out.println("methodC");
        Assert.assertFalse(true);
    }

    @Test()
    public void methodB(){
        System.out.println("methodB");
    }

    @Test(dependsOnMethods = "methodA",alwaysRun = true)
    public void methodC(){
        System.out.println("methodA");
        Assert.assertFalse(true);
    }

    @Test(enabled = false)
    public void methodD(){
        System.out.println("methodG");
    }
}
