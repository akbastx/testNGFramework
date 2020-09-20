package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileTest extends TestBase {

    @Test
    public void uploadFileMethod(){

        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFile= driver.findElement(By.id("file-upload"));
        String filePath= "/Users/akbas/Desktop/FLOWER.jpg";
        chooseFile.sendKeys(filePath);
       WebElement upload= driver.findElement(By.className("button"));
       upload.click();

        WebElement fileUploadedText=driver.findElement(By.xpath("//h3"));
        String actualText=fileUploadedText.getText();
        String expectedText="File Uploaded!";
        Assert.assertTrue(actualText.equals(expectedText));






    }


}
