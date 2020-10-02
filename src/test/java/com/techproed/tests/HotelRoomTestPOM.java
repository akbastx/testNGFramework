package com.techproed.tests;
import com.techproed.pages.HotelRoomsPage;
import com.techproed.pages.KoalaDefaultPage;
import com.techproed.pages.KoalaLoginPage;
import com.techproed.pages.KoalaMainPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
public class HotelRoomTestPOM extends TestBase {

    public void koalaLogin() {
        driver.get(ConfigReader.getProperty("url"));
        KoalaMainPage koalaMainPage = new KoalaMainPage(driver);
        KoalaLoginPage koalaLoginPage = new KoalaLoginPage(driver);
        koalaMainPage.koalaMainLoginButton.click();
        koalaLoginPage.koalaUseName.sendKeys(ConfigReader.getProperty("username"));
        koalaLoginPage.koalaPass.sendKeys(ConfigReader.getProperty("password"));
        koalaLoginPage.koalaLoginButton.click();
    }
    @Test
    public void hotelRoomTest() throws InterruptedException {
        koalaLogin();
        KoalaDefaultPage koalaDefaultPage=new KoalaDefaultPage(driver);
        koalaDefaultPage.hotelManagement.click();
        koalaDefaultPage.hotelRooms.click();
        Thread.sleep(5000);
        HotelRoomsPage hotelRoomsPage=new HotelRoomsPage(driver);
        hotelRoomsPage.addHotelRoomButton.click();

        //Send keys to each box
        Select options = new Select(hotelRoomsPage.hotelIDropDown);
        options.selectByIndex(2);
        hotelRoomsPage.code.sendKeys("1234");
        hotelRoomsPage.name.sendKeys("Hilton");
        hotelRoomsPage.location.sendKeys("Houston");
        hotelRoomsPage.description.sendKeys("Nice Hotel");
        hotelRoomsPage.price.sendKeys("888");
        Select options1= new Select(hotelRoomsPage.roomType);
        options1.selectByIndex(2);
        hotelRoomsPage.maxAdult.sendKeys("2");
        hotelRoomsPage.maxChild.sendKeys("2");
        Thread.sleep(2000);
        hotelRoomsPage.approve.click();
        hotelRoomsPage.submitButton.click();
        Thread.sleep(2000);

        //Assert
        String actualMessage = hotelRoomsPage.successMessage.getText();
        String expectedMessage = "HotelRoom was inserted successfully";
        Assert.assertEquals(actualMessage,expectedMessage);

        hotelRoomsPage.okButton.click();

    }
}





