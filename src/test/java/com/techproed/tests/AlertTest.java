package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void acceptAlert(){
        WebElement firstButton = driver.findElement(By.xpath("(//button)[1]"));
        firstButton.click();
        String firstAlertText = driver.switchTo().alert().getText();
        Assert.assertEquals(firstAlertText, "I am a JS Alert");
        driver.switchTo().alert().accept();
        WebElement result= driver.findElement(By.id("result"));
        String resultText = result.getText();
        Assert.assertEquals(resultText, "You successfuly clicked an alert");
    }

    @Test
    public void dismissAlert(){
        WebElement secondButton = driver.findElement(By.xpath("(//button)[2]"));
        secondButton.click();
        String secondAlertText = driver.switchTo().alert().getText();
        Assert.assertEquals(secondAlertText, "I am a JS Confirm");
        driver.switchTo().alert().dismiss();
        WebElement result= driver.findElement(By.id("result"));
        String resultText = result.getText();
        Assert.assertEquals(resultText, "You clicked: Cancel");
    }

    @Test
    public void sendKeysAlert(){
        WebElement thirdButton = driver.findElement(By.xpath("(//button)[3]"));
        thirdButton.click();
        String thirdAlertText = driver.switchTo().alert().getText();
        Assert.assertEquals(thirdAlertText, "I am a JS prompt");
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();
        WebElement result= driver.findElement(By.id("result"));
        String resultText = result.getText();
        Assert.assertEquals(resultText, "You entered: Hello");
    }

    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
