package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test()
    public void methodA(){
        System.out.println("methodC");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "methodA")
    public void methodB(){
        System.out.println("methodB");
    }

    @Test()
    public void methodC(){
        System.out.println("methodA");
        Assert.assertFalse(true);
    }
    @Test(dependsOnMethods = "methodC")
    public void methodD(){
        System.out.println("methodG");
    }

    @Test()
    public void methodE(){
        System.out.println("methodD");
    }

    @Test(dependsOnMethods = "methodE")
    public void methodG(){
        System.out.println("methodF");
    }
}
