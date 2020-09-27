package com.techproed.smokeTest;

import com.techproed.pages.KoalaLoginPage;
import com.techproed.pages.KoalaMainPage;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class KoalaLogin extends TestBase {
    @Test
    public void login(){
        driver.get("http://www.kaolapalace-qa-environment2.com/");
        KoalaMainPage koalaMainPage = new KoalaMainPage(driver);
        KoalaLoginPage koalaLoginPage = new KoalaLoginPage(driver);
        koalaMainPage.koalaMainLoginButton.click();
        koalaLoginPage.koalaUseName.sendKeys("manager2");
        koalaLoginPage.koalaPass.sendKeys("Man1ager2!");
        koalaLoginPage.koalaLoginButton.click();


    }


}
