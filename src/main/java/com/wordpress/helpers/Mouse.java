package com.wordpress.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouse
{

    public static void over(WebDriver driver, WebElement we)
    {

        Actions action = new Actions(driver);
            action.moveToElement(we).build().perform();

    }

    public static void overAndClick(WebDriver driver, WebElement we)
    {

        Actions action = new Actions(driver);
        action.moveToElement(we).click().build().perform();

    }

}
