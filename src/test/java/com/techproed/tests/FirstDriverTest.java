package com.techproed.tests;

import com.techproed.pages.KoalaLoginPage;
import com.techproed.pages.KoalaMainPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.annotations.Test;

public class FirstDriverTest {

    @Test
    public void firstDriverTest(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        KoalaMainPage koalaMainPage = new KoalaMainPage(Driver.getDriver());
        KoalaLoginPage koalaLoginPage = new KoalaLoginPage(Driver.getDriver());
        koalaMainPage.koalaMainLoginButton.click();
        koalaLoginPage.koalaUseName.sendKeys(ConfigReader.getProperty("username"));
        koalaLoginPage.koalaPass.sendKeys(ConfigReader.getProperty("password"));
        koalaLoginPage.koalaLoginButton.click();

        Driver.closeDriver();


    }



}
