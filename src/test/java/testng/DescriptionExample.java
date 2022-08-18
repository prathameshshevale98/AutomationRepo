package testng;

import org.testng.annotations.Test;

public class DescriptionExample {

    @Test(expectedExceptions = {NullPointerException.class, ArithmeticException.class})
    public void methodA(){
        System.out.println("methodA");

        System.out.println(10 / 0);

        System.out.println("Student");
    }
    @Test(description = "verify Document")
    public void methodB(){
        System.out.println("methodB");
    }

}
