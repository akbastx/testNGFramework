package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class InfoForm {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.gradulet.org/contact-us/");

            WebElement name = driver.findElement(By.id("tfa_1"));
           name.sendKeys("Osman");

            WebElement message = driver.findElement(By.id("tfa_6"));
            message.sendKeys("I need more information");

            WebElement phone = driver.findElement(By.id("tfa_5"));
            phone.sendKeys("9567786161");

            WebElement email = driver.findElement(By.id("tfa_3"));
            email.sendKeys("akbastx@gmail.com");


        }


    }

