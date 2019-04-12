package com.wordpress.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    Properties prop;

    public ConfigReader()
    {

        try
        {

            File src = new File("./properties/config.properties");
            FileInputStream fis = new FileInputStream(src);

            prop = new Properties();
            prop.load(fis);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    /***
     *
     * @depreciated Managed with WebDriverManager
     */
    @Deprecated public String getChromePath()
    {

        String path = prop.getProperty("chrome.driver");

        return path;

    }

    /***
     *
     * @depreciated Managed with WebDriverManager
     */
    @Deprecated public String getGeckoPath()
    {

        String path = prop.getProperty("gecko.driver");

        return path;

    }

    public String getBrowser()
    {

        String path = prop.getProperty("browser");

        return path;

    }

    public String getUrl()
    {

        String path = prop.getProperty("url");

        return path;

    }

}
