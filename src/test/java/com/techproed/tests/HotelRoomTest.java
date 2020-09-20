package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HotelRoomTest extends TestBase {


    public void clickOnLogin() {
        driver.get("http://www.kaolapalace-qa-environment2.com/");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!");
        driver.findElement(By.id("btnSubmit")).click();
    }

        @Test
        public void hotelRoomCreate() throws InterruptedException {
            clickOnLogin();
            driver.findElement(By.id("menuHotels")).click();
            driver.findElement(By.partialLinkText("Hotel Rooms")).click();
            Thread.sleep(1000);
            driver.findElement(By.partialLinkText("ADD HOTELROOM")).click();
            Thread.sleep(1000);

            WebElement dropDownElement = driver.findElement(By.id("IDHotel"));
            Select options = new Select(dropDownElement);
            options.selectByValue("4");

            driver.findElement(By.id("Code")).sendKeys("1234");
            driver.findElement(By.id("Name")).sendKeys("Hilton");
            driver.findElement(By.id("Location")).sendKeys("Houston");
            driver.findElement(By.xpath("//textarea[@dir='ltr']")).sendKeys("Nice Hotel");
            driver.findElement(By.id("Price")).sendKeys("888");

            WebElement dropdownElement1 = driver.findElement(By.id("IDGroupRoomType"));
            Select options1= new Select(dropdownElement1);
            options1.selectByIndex(2);

            driver.findElement(By.id("MaxAdultCount")).sendKeys("2");
            driver.findElement(By.id("MaxChildCount")).sendKeys("2");
            driver.findElement(By.id("uniform-IsAvailable")).click();
            driver.findElement(By.id("btnSubmit")).click();




            WebDriverWait wait = new WebDriverWait(driver,10);
            WebElement successMessage =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bootbox-body']")));


            String successMessageText=successMessage.getText();
            Assert.assertEquals(successMessageText,"HotelRoom was inserted successfully");
            //Click OK
            WebElement okButton=driver.findElement(By.xpath("(//button[@type='button'])[6]"));
            okButton.click();



        }
}
