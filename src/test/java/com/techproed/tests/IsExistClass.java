package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class IsExistClass{


    @Test
    public void isExist(){
        String pathOfTheFile = "/Users/akbas/Desktop/FLOWER.jpg";
        Assert.assertNotNull("/Users/akbas/Desktop/FLOWER.jpg");




    }


}
