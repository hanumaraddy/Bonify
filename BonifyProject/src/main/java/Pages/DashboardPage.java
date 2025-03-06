package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import com.bonify.DriverManager;
import utils.ExtentReportManager;
import utils.ScreenshotUtil;

public class DashboardPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private String expectedTitle = "bonify - Dashboard";    
    

    public DashboardPage() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait
    }

    public void verifyDashboardTitle() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Dashboard title does not match!");
        
        ExtentReportManager.logPass("Dashboard title verified: " + actualTitle);
        ScreenshotUtil.captureScreenshot(driver, "DashboardTitleVerified");
    }

}