package com.MobileAutomationTest;

import Pages.ACHDepositPage;
import Pages.HomePage;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.bidi.log.Log;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import Pages.LoginPage;
import io.appium.java_client.android.AndroidDriver;

public class TestLogin extends BaseTest{

    private AndroidDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private ACHDepositPage achDepositPage;


    @BeforeClass
    public void beforeClass(){
        driver = getDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        achDepositPage = new ACHDepositPage(driver);

    }

    @Test
    public void TestLoginScenario() throws InterruptedException {

        loginPage.Login("7898765432","!Q2w3e4r");
        loginPage.waitInMilliseconds(5000);
        loginPage.enterOTP("123456");
        homePage.clickCancelButton();
        loginPage.waitInMilliseconds(5000);
        homePage.clickTransfer();
        homePage.ACHDeposit();
        achDepositPage.ACHDepositbyplaidSaving();



}

}
