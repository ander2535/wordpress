package com.wordpress.test;

import com.wordpress.pages.DashboardPage;
import com.wordpress.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DashboardPageTest extends BaseTest
{

    @Test(description="Test valid user login")
    public void validLoginTest()
    {

        LoginPage theLoginPage = PageFactory.initElements(driver, LoginPage.class);
        theLoginPage.validLogin("admin", "demo123");

        //TODO: Validate test here.

        assertTrue( true);

    }

    @Test(description="Test valid user logout")
    public void validLogoutTest()
    {

        DashboardPage theDashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        theDashboardPage.validLogout();

        //TODO: Validate test here.

        assertTrue( true);

    }

//    @Test(description="Test invalid user login")
//    public void inValidLoginTest()
//    {
//
//        LoginPage theLoginPage = PageFactory.initElements(driver, LoginPage.class);
//        theLoginPage.validLogin("admin1", "demo1");
//
//        //TODO: Validate test here.
//
//        assertTrue( false);
//
//    }


}
