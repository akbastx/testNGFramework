package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsClass2 extends TestBase {
    @Test
    public void hoverOver() {
        driver.get("https://www.amazon.com");
        WebElement hoverOver= driver.findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(hoverOver).perform();
        WebElement account= driver.findElement(By.linkText("Your Account"));
        account.click();
        String actualTitle=driver.getTitle();
        String expectedTitle= "Your Account";
        Assert.assertEquals(actualTitle,expectedTitle);

    }
}
