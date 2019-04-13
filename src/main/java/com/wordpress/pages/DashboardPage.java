package com.wordpress.pages;

import com.wordpress.helpers.DriverWait;
import com.wordpress.helpers.Mouse;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage
{

    WebDriver driver;

    public DashboardPage(WebDriver ldriver)
    {

        this.driver = ldriver;

    }

    @FindBy(how = How.ID, using = "wp-admin-bar-my-account")
    @CacheLookup
    WebElement accountMenu;

    @FindBy(how = How.ID, using = "wp-admin-bar-logout")
    @CacheLookup
    WebElement accountLogout;


    public void validLogout()
    {

        com.wordpress.helpers.DriverWait.fluentWait(driver, "wp-admin-bar-my-account");

        Mouse.over(driver, accountMenu);
        DriverWait.explcitWait(1000);
        Mouse.overAndClick(driver, accountLogout);
        DriverWait.explcitWait(1000);

    }


}
