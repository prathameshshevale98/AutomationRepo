package testng;

import org.testng.annotations.Test;

public class InvocationExample {

    @Test(priority = 3, invocationCount = 7,invocationTimeOut = 05)
    public void methodA(){
        System.out.println("methodC");
    }

    @Test(priority = 1, invocationCount = 5,invocationTimeOut = 10)
    public void methodB(){
        System.out.println("methodB");
    }

    @Test(priority = 2, invocationCount = 2,invocationTimeOut = 200)
    public void methodC(){
        System.out.println("methodA");
    }
}
