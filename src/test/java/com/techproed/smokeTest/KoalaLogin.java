package com.techproed.smokeTest;

import com.techproed.pages.KoalaLoginPage;
import com.techproed.pages.KoalaMainPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class KoalaLogin extends TestBase {
    @Test
    public void login(){
        driver.get(ConfigReader.getProperty("url"));
        KoalaMainPage koalaMainPage = new KoalaMainPage(driver);
        KoalaLoginPage koalaLoginPage = new KoalaLoginPage(driver);
        koalaMainPage.koalaMainLoginButton.click();
        koalaLoginPage.koalaUseName.sendKeys(ConfigReader.getProperty("username"));
        koalaLoginPage.koalaPass.sendKeys(ConfigReader.getProperty("password"));
        koalaLoginPage.koalaLoginButton.click();
    }


}
