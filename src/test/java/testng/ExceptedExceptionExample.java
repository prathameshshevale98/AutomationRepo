package testng;

import org.testng.annotations.Test;

public class ExceptedExceptionExample {

    @Test(expectedExceptions = {NullPointerException.class, ArithmeticException.class})
    public void methodA(){
        System.out.println("methodA");
        try {
            System.out.println(10 / 0);
        }catch (Exception e ){
            e.printStackTrace();
        }
        System.out.println("Student");
    }
    @Test()
    public void methodB(){
        System.out.println("methodB");
    }

}
