package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ActionsClass4 extends TestBase {

    @Test
    public void scrollUpDown() throws InterruptedException {
        //        Go to amazon
        driver.get("https://www.amazon.com/");
        Actions actions=new Actions(driver);
        //        Scroll the page down
        Thread.sleep(5000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(5000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(5000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();//ARROW_DOWN moved the page down, but it moves less than PAGE_DOWN
        Thread.sleep(5000);

        //        Scroll the page up
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(5000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(5000);
        actions.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(5000);
    }
}
