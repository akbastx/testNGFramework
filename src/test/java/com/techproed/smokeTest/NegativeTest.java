package com.techproed.smokeTest;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeTest extends TestBase {

    @BeforeMethod
    public void setup(){
        driver.get("http://www.kaolapalace-qa-environment2.com/");
        driver.findElement(By.linkText("Log in")).click();
    }

    @Test (priority = 1)
    public void invalidPassword(){
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("1234");
        driver.findElement(By.id("btnSubmit")).click();
        WebElement errorMessage = driver.findElement(By.id("divMessageResult"));
        String  errorMessageTest = errorMessage.getText();
        Assert.assertTrue(errorMessageTest.contains("Wrong password"));
    }

    @Test (priority = 2)
    public void invalidID(){
        driver.findElement(By.id("UserName")).sendKeys("abcd");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!");
        driver.findElement(By.id("btnSubmit")).click();
        WebElement errorMessage = driver.findElement(By.id("divMessageResult"));
        String  errorMessageTest = errorMessage.getText();
        Assert.assertTrue(errorMessageTest.contains("Try again please"));
    }

    @Test (priority = 3)
    public void invalidIDAndPassword(){
        driver.findElement(By.id("UserName")).sendKeys("1234");
        driver.findElement(By.id("Password")).sendKeys("1234");
        driver.findElement(By.id("btnSubmit")).click();
        WebElement errorMessage = driver.findElement(By.id("divMessageResult"));
        String  errorMessageTest = errorMessage.getText();
        Assert.assertTrue(errorMessageTest.contains("Try again please"));
    }

}
