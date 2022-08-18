package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

    @Test(groups = "smoke")
    public void methodA(){
        System.out.println("methodC");
        Assert.assertTrue(true);
    }

    @Test(dependsOnGroups = "smoke")
    public void methodB(){
        System.out.println("methodB");
    }

    @Test()
    public void methodC(){
        System.out.println("methodA");
        Assert.assertFalse(true);
    }
    @Test(dependsOnGroups = "smoke")
    public void methodD(){
        System.out.println("methodG");
    }
}
