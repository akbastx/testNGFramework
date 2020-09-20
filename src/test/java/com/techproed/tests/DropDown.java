package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.List;

public class DropDown {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    @Test
    public void dropdownTest() throws InterruptedException {
        //1. Locate teh dropdown
        WebElement dropdownElement=driver.findElement(By.id("dropdown"));
        //2. Create Select Object
        Select options = new Select(dropdownElement);
        Thread.sleep(3000);
        //1.Select and Print Option 1 using index
        //Step3 Select the option byindex, or byvalue, or byvisibletext
        options.selectByIndex(1);


    }

    @Test
    public void selectByValue() throws InterruptedException {
        WebElement dropdownElement=driver.findElement(By.id("dropdown"));
        Select options = new Select(dropdownElement);
        Thread.sleep(3000);
        options.selectByValue("2");

    }

    @Test
    public void selectByText() throws InterruptedException {
        WebElement dropdownElement=driver.findElement(By.id("dropdown"));
        Select options = new Select(dropdownElement);
        Thread.sleep(3000);
        options.selectByVisibleText("Option 1");

    }

    @Test
    public void printAllValues(){
        WebElement dropdownElement=driver.findElement(By.id("dropdown"));
        Select options = new Select(dropdownElement);
        List<WebElement> allOptions = options.getOptions();
        for (WebElement option:allOptions) {
            System.out.println(option.getText());
        }
    }

    @Test
        public void dropdownsize(){
        WebElement dropdownElement=driver.findElement(By.id("dropdown"));
        Select options = new Select(dropdownElement);
        int actualSize=options.getOptions().size();
        Assert.assertEquals(actualSize, 4);
    }

    @Test
    public void getFirstSelectedOptionTest(){
        WebElement dropdownElement=driver.findElement(By.id("dropdown"));
        Select options = new Select(dropdownElement);
        String firstSelectedOption= options.getFirstSelectedOption().getText();
        System.out.println("First Selected Option: "+ firstSelectedOption);


    }



//    @AfterMethod
//    public void tearDown(){
//        driver.close();
//    }


}
