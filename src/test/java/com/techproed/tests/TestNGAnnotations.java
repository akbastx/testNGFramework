package com.techproed.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGAnnotations {

        // 1. create a method: setUp using @BeforeMethod annotation and print "This is BeforeMethod"
        // 2. Create a method: tearDown using @AfterMethod annotation and print "This is @AfterMethod"
        // 3. Create 3 TEST METHODS: test1,test2,test3,test4 and print "Test1", "Test2", "Test3","Test4" respectively
        //4. Skip test2
        //5. print the test in this order: Test3, Test4, Test1


    @BeforeMethod
    public void setup(){
        System.out.println("This is my Before method");
    }

   @AfterMethod
    public void tearDown(){
       System.out.println("This is my After method");
    }

    @Test (priority = 3)
    public void Test1(){
        System.out.println("This is my Test1 method");
    }

    @Test
    @Ignore
    public void Test2(){
        System.out.println("This is my Test2 method");
    }

    @Test(priority = 3)
    public void Test3(){
        System.out.println("This is my Test3 method");
    }

    @Test(priority = 1)
    public void Test4(){
        System.out.println("This is my Test4 method");
    }


}
