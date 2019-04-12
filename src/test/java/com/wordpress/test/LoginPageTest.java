package com.wordpress.test;

import com.wordpress.helpers.DriverWait;
import com.wordpress.pages.DashboardPage;
import com.wordpress.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class LoginPageTest extends BaseTest
{

    @Test(description="Test valid user login", priority=2)
    public void validLoginTest()
    {

        LoginPage theLoginPage = PageFactory.initElements(driver, LoginPage.class);
        theLoginPage.validLogin("admin", "demo123");

        //TODO: Validate test here.
        System.out.println("Test Case One with Thread Id:- "+Thread.currentThread().getId());

        assertTrue( true);

    }

    @Test(description="Test invalid user login", priority=1)
    public void inValidLoginTest()
    {

        LoginPage theLoginPage = PageFactory.initElements(driver, LoginPage.class);
        theLoginPage.validLogin("admin1", "demo1");

        //TODO: Validate test here.
        System.out.println("Test Case two with Thread Id:- "+ Thread.currentThread().getId());

        assertFalse( false);

    }

    @Test(description="Test valid user logout", priority=3)
    public void validLogoutTest()
    {

        DriverWait.explcitWait(3000);

        DashboardPage theDashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        theDashboardPage.validLogout();

        //TODO: Validate test here.

        assertTrue( false);

    }


}
