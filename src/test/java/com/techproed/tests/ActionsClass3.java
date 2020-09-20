package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass3 extends TestBase {

    @Test
    public void googleSearch(){
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        Actions actions = new Actions(driver);
        actions
                .keyDown(searchBox,Keys.SHIFT)
                .sendKeys("iPhone X prices")
                .keyUp(searchBox,Keys.SHIFT)
                .perform();






    }

}
