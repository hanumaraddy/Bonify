package com.bonify;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ExtentReportManager;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ExtentReportManager.startTest("Test Setup");

        driver = DriverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            driver.get("https://my.bonify.de");
            ExtentReportManager.logInfo("Browser launched and navigated to Bonify");
            System.out.println("Page Title: " + driver.getTitle()); // Debugging
        } catch (Exception e) {
            ExtentReportManager.logInfo("Failed to load Bonify: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
      //  DriverManager.quitDriver();
        ExtentReportManager.logInfo("Browser closed");
        ExtentReportManager.endTest();
    }
}