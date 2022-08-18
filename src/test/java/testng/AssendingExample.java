package testng;

import org.testng.annotations.Test;

public class AssendingExample {

    @Test()
    public void methodA(){
        System.out.println("methodC");
    }

    @Test()
    public void methodB(){
        System.out.println("methodB");
    }

    @Test()
    public void methodC(){
        System.out.println("methodA");
    }
}
