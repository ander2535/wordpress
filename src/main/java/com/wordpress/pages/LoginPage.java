package com.wordpress.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage
{

    WebDriver driver;

    public LoginPage(WebDriver ldriver)
    {

        this.driver = ldriver;

    }

    @FindBy(how = How.ID, using = "user_login")
    WebElement username;

    @FindBy(how = How.ID, using = "user_pass")
    WebElement password;

    @FindBy(how = How.ID, using = "wp-submit")
    WebElement submit;

    @FindBy(how = How.ID, using = "wp-admin-bar-my-account")
    @CacheLookup
    WebElement accountMenu;

    @FindBy(how = How.ID, using = "wp-admin-bar-logout")
    @CacheLookup
    WebElement accountLogout;

    public void validLogin(String userid, String userpw)
    {
        com.wordpress.helpers.DriverWait.fluentWait(driver, "wp-submit");

        username.sendKeys(userid);
        password.sendKeys(userpw);
        submit.click();

    }

    public void inValidLogin(String userid, String userpw)
    {

        username.sendKeys(userid);
        password.sendKeys(userpw);
        submit.click();

    }


}
