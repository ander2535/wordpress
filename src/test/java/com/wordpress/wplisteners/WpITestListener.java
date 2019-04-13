package com.wordpress.wplisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class WpITestListener implements ITestListener
{
    @Override
    public void onTestStart(ITestResult result)
    {

        System.out.println("TestCases on start and details are " + result.getName( ));

    }

    @Override
    public void onTestSuccess(ITestResult result)
    {

        System.out.println("TestCases on success and details are " + result.getName( ));

    }

    @Override
    public void onStart(ITestContext result)
    {

        System.out.println("TestCases on start and details are " + result.getName( ));

    }

    @Override
    public void onFinish(ITestContext result)
    {

        System.out.println("TestCases on finish and details are " + result.getName( ));

    }

    @Override
    public void onTestFailure(ITestResult result)
    {

        System.out.println("TestCases on failure and details are " + result.getName( ));

    }

    @Override
    public void onTestSkipped(ITestResult result)
    {

        System.out.println("TestCases on skipped and details are " + result.getName( ));

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result)
    {

        System.out.println("TestCases on failed success and details are " + result.getName( ));

    }

//    @Override
//    public void onTestFailedWithTimeout(ITestResult result) {
//
//        System.out.println("TestCases on failed timeout and details are "+result.getName());
//
//    }

}
