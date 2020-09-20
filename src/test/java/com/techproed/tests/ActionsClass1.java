package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsClass1 extends TestBase {

    @Test
    public void contextClick(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        WebElement box = driver.findElement(By.id("hot-spot"));
        actions.contextClick(box).perform();
        String alertMessage = driver.switchTo().alert().getText();
        String expectedAlertMessage="You selected a context menu";
        Assert.assertEquals(alertMessage,expectedAlertMessage);
        driver.switchTo().alert().accept();








    }

}
