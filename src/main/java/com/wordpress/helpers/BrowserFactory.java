package com.wordpress.helpers;

import com.wordpress.utilities.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory
{

    static WebDriver driver;
    static ConfigReader config;

    public static WebDriver startBrowser(String broswerName, String url)
    {

        config = new ConfigReader( );

        if (broswerName.equalsIgnoreCase("chrome"))
        {

            WebDriverManager.chromedriver( ).setup( );
            driver = new ChromeDriver( );
            driver.manage( ).window( ).fullscreen( );

        }
        else if (broswerName.equalsIgnoreCase("firefox"))
        {

            WebDriverManager.firefoxdriver( ).setup( );
            driver = new FirefoxDriver( );
            driver.manage( ).window( ).fullscreen( );

        }
        else if (broswerName.equalsIgnoreCase("edge"))
        {

            WebDriverManager.edgedriver( ).setup( );
            driver = new EdgeDriver( );

        }

        driver.get(url);

        return driver;

    }


}
