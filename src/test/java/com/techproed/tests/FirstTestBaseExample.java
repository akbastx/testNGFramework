package com.techproed.tests;

import com.techproed.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestBaseExample extends TestBase {

    @Test
    public void test1(){
        //        Go to https://the-internet.herokuapp.com/iframe
        driver.get("https://the-internet.herokuapp.com/iframe");
//        Verify the Bolded text contains "Editor"
        //Note that this Bolded text is NOT inside the iframe, so we don;t switch to iframe
        WebElement boldedText= driver.findElement(By.xpath("//h3"));
        //Getting the text of the element
        String boldedTextText=boldedText.getText();
        //Making the assertion
        Assert.assertTrue(boldedTextText.contains("Editor"));

        driver.switchTo().frame(0);
        WebElement textBoxElement= driver.findElement(By.xpath("//p"));
        textBoxElement.clear();
        textBoxElement.sendKeys("This is the box inside iFrame");
        driver.switchTo().defaultContent();
        String elementText = driver.findElement(By.linkText("Elemental Selenium")).getText();
        Assert.assertTrue(elementText.equals("Elemental Selenium"));

    }
}
