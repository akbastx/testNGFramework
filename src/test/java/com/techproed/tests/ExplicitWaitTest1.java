package com.techproed.tests;

import com.techproed.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWaitTest1 extends TestBase {

//    Create a class:ExplicitWaitTest1. Create a method: isEnabled
//    Go to https://the-internet.herokuapp.com/dynamic_controls
//    Click enable Button
//    And verify the message is equal to “It's enabled!”
//    And verify the textbox is enabled (I can type in the box)
//    And click on Disable button
//    And verify the message is equal to “It's disabled!”
//    And verify the textbox is disabled (I cannot type in the box)


    @Test
    public void isEnabled(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("(//button)[2]")).click();
        driver.findElement(By.id("message"));
        WebElement message1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        String message1Text = message1.getText();
        Assert.assertEquals(message1Text, "It's enabled!");
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        Assert.assertTrue(textBox.isEnabled());
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        WebElement message2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        String message2Text = message2.getText();
        Assert.assertEquals(message2Text, "It's disabled!");
        WebElement textBox1 = driver.findElement(By.xpath("//input[@type='text']"));
        Assert.assertTrue(!textBox1.isEnabled());





    }



}