package com.techproed.pages;

import com.techproed.tests.WebTables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceLoginPage {

    WebDriver driver;

    public FaceLoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    public WebElement username;

    @FindBy(id = "pass")
    public WebElement password;

    @FindBy(xpath="//button[@id='u_0_b']")
    public WebElement login;

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement message;

}
