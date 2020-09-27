package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KoalaLoginPage {

    WebDriver driver;

    public KoalaLoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "UserName")
    public WebElement koalaUseName;

    @FindBy(id = "Password")
    public WebElement koalaPass;

    @FindBy(id = "btnSubmit")
    public WebElement koalaLoginButton;




}
