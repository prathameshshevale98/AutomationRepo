package testng;

import org.testng.annotations.*;

public class BeforeAfterExample {

    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("Before Suite");
    }

        @BeforeTest
        public void beforeTest () {
            System.out.println("Before Test");
        }
        @BeforeClass
        public void beforeClass () {
            System.out.println("Before Class");
        }
        @BeforeMethod
        public void beforeMethod () {
            System.out.println("Before Method");
        }
        @Test
        public void test1 () {
            System.out.println("Test case 1");
        }
        @Test
        public void test2 () {
            System.out.println("Test case 2");
        }
        @BeforeMethod
        public void afterMethod () {
            System.out.println("After Method");
        }
        @BeforeClass
        public void afterClass () {
            System.out.println("After Class");
        }
        @AfterTest
        public void afterTest () {
            System.out.println("After Test");
        }
        @AfterSuite
        public void afterSuite () {
            System.out.println("After Suite");

        }
    }