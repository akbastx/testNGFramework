package com.techproed.tests;

import com.techproed.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.Set;

public class shiftTab extends TestBase {


    @Test
    public void newWindowTest(){

        driver.get("https://the-internet.herokuapp.com/windows");

        String actualNewWindowText=driver.findElement(By.xpath("//div[@class='example']//h3")).getText();
        String expectedNewWindowText="Opening a new window";
        Assert.assertEquals(actualNewWindowText,expectedNewWindowText);
        String expectedTitle = "The Internet";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title is incorrect");
        String window1=driver.getWindowHandle();
        System.out.println("Default Window Handle : "+window1);
        WebElement box= driver.findElement(By.linkText("Click Here"));
        box.click();

        Actions actions = new Actions(driver);
        actions
                .keyDown(box, Keys.SHIFT)
                .sendKeys(Keys.TAB)
                .perform();


        String actualNewPageTitle=driver.getTitle();
        String expectedNewPageTitle="New Window";
        Assert.assertEquals(actualNewPageTitle,expectedNewPageTitle,"New Page Title is not equal");


    }
}
