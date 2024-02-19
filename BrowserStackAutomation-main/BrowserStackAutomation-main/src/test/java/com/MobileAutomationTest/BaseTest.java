package com.MobileAutomationTest;

import DriverBuilder.AndroidDriverBuilder;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    private static final ThreadLocal<AndroidDriver> drivers = new ThreadLocal<>();

    @BeforeTest
    public void beforeTest(){
        AndroidDriver androidDriver = new AndroidDriverBuilder().createAndroidDriverInstance();
        setDriver(androidDriver);
    }

    public AndroidDriver getDriver(){
        return drivers.get();
    }

    public void setDriver(AndroidDriver driver){
        drivers.set(driver);
    }

    @AfterTest
    public void afterTest(){
        getDriver().quit();
    }

}
