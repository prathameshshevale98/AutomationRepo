package testng;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 7)
    public void methodA() {
        System.out.println("methodC");
    }

    @Test(priority = -5)
    public void methodB() {
        System.out.println("methodB");
    }

    @Test(priority = -1)
    public void methodC() {
        System.out.println("methodA");
    }

    @Test(priority = 2)
    public void methodD() {
        System.out.println("methodD");
    }

    @Test(priority = 1)
    public void methodE() {
        System.out.println("methodE");
    }

    @Test(priority = 4)
    public void methodF() {
        System.out.println("methodF");
    }

    @Test(priority = 3)
    public void methodG() {
        System.out.println("methodG");
    }
}
