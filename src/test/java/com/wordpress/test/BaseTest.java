package com.wordpress.test;

import com.wordpress.helpers.BrowserFactory;
import com.wordpress.utilities.ConfigReader;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.apache.commons.io.FileUtils;
import java.io.File;

//@Listeners(com.wordpress.wplisteners.WpITestListener.class)
public class BaseTest
{

    ConfigReader config = new ConfigReader();

    WebDriver driver;
    String browserType = config.getBrowser();
    String browserUrl = config.getUrl();

    @BeforeClass
    public void beforeClass()
    {

        Reporter.log("Starting browser "+browserType+"...", true);
        driver = BrowserFactory.startBrowser(browserType, browserUrl);

    }

    @AfterClass
    public void afterClass()
    {

        Reporter.log("Closing browser "+browserType+"...", true);
        driver.quit();

    }

    /***
     * Take screen shot on test failure
     * @param result
     */
    @AfterMethod
    public void takeScreenshot(ITestResult result)
    {

        if(ITestResult.FAILURE == result.getStatus())
        {

            try
            {

                TakesScreenshot screenshot = (TakesScreenshot)driver;
                File src = screenshot.getScreenshotAs(OutputType.FILE);

                String folderName = "screenshots";

                File dir = new File("./"+folderName);

                // File fully qualified name
                String fileFqn = dir.getCanonicalPath()+"/"+result.getName()+".jpg";

                FileUtils.copyFile(src, new File(fileFqn));
                System.out.println("Successfully captured a screenshot: "+fileFqn);

            }
            catch(Exception e)
            {

                System.out.println("Exception while taking screenshot: "+e.getMessage());

            }

        }


    }


}
