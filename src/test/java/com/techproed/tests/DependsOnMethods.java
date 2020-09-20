package com.techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

    @Test
    public  void logIn(){
        System.out.println("This is logIn");
    }

    @Test
    public  void homePage(){
        System.out.println("This is Home page");
        Assert.assertEquals(3,4);
    }

    @Test(dependsOnMethods = "homePage")
    public  void searchTest(){
        System.out.println("This is Search test");
    }

    @Test
    public  void verifyResults(){
        System.out.println("This is Verify Results");
    }



}
