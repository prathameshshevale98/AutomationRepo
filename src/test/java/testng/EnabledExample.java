package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnabledExample {


    @Test(enabled = false)
    public void methodA(){
        System.out.println("methodC");
        Assert.assertTrue(true);
    }

    @Test()
    public void methodB(){
        System.out.println("methodB");
    }

    @Test()
    public void methodC(){
        System.out.println("methodA");
        Assert.assertFalse(true);
    }
    @Test(enabled = false)
    public void methodD(){
        System.out.println("methodG");
    }

}
