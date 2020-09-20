package com.techproed.tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SoftAssertTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    @Test
    public void hardAssertTest(){
        WebElement gmailLink=driver.findElement(By.linkText("Gmail"));
        //Assert if the gmail link text equals "Gmail"
        String expectedGmailText="Gmail";
        String actualGmailText=gmailLink.getText();
        Assert.assertEquals(actualGmailText,expectedGmailText);//PASS
        WebElement imagesLink=driver.findElement(By.linkText("Images"));
        //Assert if the images link text is equal to "Images"
        String actualImageLinkText=imagesLink.getText();
        String expectedImageLinkText="Images";
        Assert.assertEquals(actualImageLinkText,expectedImageLinkText);//PASS
        WebElement singInLink=driver.findElement(By.linkText("Sign in"));
        //Assert if the sign in link text "sign in"
        String expectedSignInLinkText="sign in";
        String actualSignInLinkText=singInLink.getText();
        Assert.assertEquals(actualSignInLinkText,expectedSignInLinkText);//FAIL
    }
    @Test
    public void softAssertTest(){
        WebElement gmailLink=driver.findElement(By.linkText("Gmail"));
        String expectedGmailText = "gmail";
        String actualGmailText= gmailLink.getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualGmailText,expectedGmailText);


        WebElement imagesLink=driver.findElement(By.linkText("Images"));
        String expectedImageLink = "Images";
        String actualImageLink= imagesLink.getText();
        softAssert.assertEquals(actualImageLink,expectedImageLink);


        WebElement singInLink=driver.findElement(By.linkText("Sign in"));
        String expectedSignInLink = "sign in";
        String actualSignInLink= singInLink.getText();
        softAssert.assertEquals(actualImageLink,expectedImageLink);

        softAssert.assertAll();

    }
}
