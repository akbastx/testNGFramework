package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice extends TestBase {


    @Test
    public void uploadFileMethod() {

        driver.get("http://webdriveruniversity.com/File-Upload/");
        WebElement chooseFile = driver.findElement(By.id("myFile"));
        String filePath = "/Users/akbas/Desktop/Logo.png";
        chooseFile.sendKeys(filePath);
        WebElement upload = driver.findElement(By.id("submit-button"));
        upload.click();

        String message= driver.switchTo().alert().getText();
        String expected = "Your file has now been uploaded!";
        Assert.assertEquals(message,expected);
        driver.switchTo().alert().accept();



    }
}
