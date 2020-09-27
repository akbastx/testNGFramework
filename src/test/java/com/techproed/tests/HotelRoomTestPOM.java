package com.techproed.tests;
import com.techproed.pages.HotelRoomsPage;
import com.techproed.pages.KoalaDefaultPage;
import com.techproed.pages.KoalaLoginPage;
import com.techproed.pages.KoalaMainPage;
import com.techproed.pages.KoalaDefaultPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.TestBase;
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
        //REST IS HOMEWORK
    }
}





