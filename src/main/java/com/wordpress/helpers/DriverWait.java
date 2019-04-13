package com.wordpress.helpers;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverWait
{


    public static boolean untilVisible(WebDriver drv, By by, int seconds)
    {

        // If null/empty default to 20 seconds.
        if (seconds == 0)
        {
            seconds = 20;
        }

        WebDriverWait wait = new WebDriverWait(drv, seconds);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac-box2")));
        wait.ignoring(NoSuchElementException.class);

        return element.isDisplayed( );

    }

    public static void waitForPageLoad(WebDriver driver)
    {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfAllElements( ));

    }

    public static void explcitWait(int ms)
    {

        try
        {
            Thread.sleep(ms);
        }
        catch (Exception x)
        {
            System.out.println("Sleep time out error caught.");
        }

    }

    public static void fluentWait(WebDriver driver, final String id)
    {

        // Waiting 30 seconds for an element to be present on the page, checking
        // for its presence once every 5 seconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>( )
        {
            public WebElement apply(WebDriver driver)
            {
                return driver.findElement(By.id(id));
            }
        });


    }


}
