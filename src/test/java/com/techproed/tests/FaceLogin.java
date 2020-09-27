package com.techproed.tests;

import com.techproed.pages.FaceLoginPage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FaceLogin extends TestBase {


    @Test
    public  void logInTest(){
        driver.get("http://www.facebook.com/");
        FaceLoginPage faceLoginPage = new FaceLoginPage(driver);
        faceLoginPage.username.sendKeys("abc");
        faceLoginPage.password.sendKeys("123");
        faceLoginPage.login.click();
        String actual = faceLoginPage.message.getText();
        String expected = "The email or phone number you’ve entered doesn’t match any account. Sign up for an account.";
        Assert.assertEquals(expected,actual);






    }








}
