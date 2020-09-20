package com.techproed.smokeTest;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PositiveTest extends TestBase {

    public void clickOnLogin(){
        driver.get("http://www.kaolapalace-qa-environment2.com/");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!");
        driver.findElement(By.id("btnSubmit")).click();
    }

    @Test
    public void positiveTestCase(){
        clickOnLogin();
        WebElement date = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(date.isDisplayed());

    }




}
