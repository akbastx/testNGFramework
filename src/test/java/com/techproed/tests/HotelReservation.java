package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotelReservation extends TestBase {

    //Create a clickOnLogin method
    //Click on Hotel Management
    //Click on Room reservations
    //Click on Add Room Reservation
    //Enter All required fields
    //To enter a price, we can send keys, OR we can use actions class to drag and drop
    //Click Save
    //Verify the message: RoomReservation was inserted successfully
    //Click OK

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

        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Room reservations")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/a/span")).click();

        //create room
        WebElement dropDownElement1 = driver.findElement(By.id("IDUser"));
        Select user = new Select(dropDownElement1);
        user.selectByIndex(1);

        WebElement dropDownElement2 = driver.findElement(By.id("IDHotelRoom"));
        Select hotelRoom = new Select(dropDownElement2);
        hotelRoom.selectByIndex(1);
        Thread.sleep(1000);

        driver.findElement(By.id("Price")).sendKeys("199");
        driver.findElement(By.id("DateStart")).sendKeys("09/28/2020");
        driver.findElement(By.id("DateEnd")).sendKeys("09/30/2020");
        driver.findElement(By.id("AdultAmount")).sendKeys("2");
        driver.findElement(By.id("ChildrenAmount")).sendKeys("2");
        driver.findElement(By.id("ContactNameSurname")).sendKeys("Doe");
        driver.findElement(By.id("ContactPhone")).sendKeys("1231231212");
        driver.findElement(By.id("ContactEmail")).sendKeys("abcd@gmail.com");
        driver.findElement(By.id("Notes")).sendKeys("nice");

        driver.findElement(By.id("Approved")).click();

        driver.findElement(By.id("IsPaid")).click();

        driver.findElement(By.id("btnSubmit")).click();
        Thread.sleep(5000);


        //fails after this

        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("(//button)[2]")).click();

        


        WebElement message= driver.findElement(By.xpath("//div[@class='bootbox-body']"));
        String actualText = message.getText();
        String expectedTest = "RoomReservation was inserted successfully";
        Assert.assertEquals(actualText,expectedTest);

        Thread.sleep(1000);


        WebElement okButton=driver.findElement(By.xpath("(//button[@type='button'])[6]"));
        okButton.click();

















    }

}
