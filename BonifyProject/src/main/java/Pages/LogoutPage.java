package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bonify.DriverManager;

import utils.ExtentReportManager;
import utils.ScreenshotUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.bonify.DriverManager;
import utils.ExtentReportManager;
import utils.ScreenshotUtil;
import java.time.Duration;
    public class LogoutPage {
        private WebDriver driver;
        private WebDriverWait wait;

        private By profileButton = By.xpath("//a[conatins(text(),'Mein Profil']");
        private By logoutButton = By.xpath("//div[@class='list-wrapper']//a[contains(text(),'Ausloggen')]");

        
        private String expectedTitle = "bonify - Logout"; 

        private By loginAgainButton = By.xpath("//button[contains(text(),'Wieder einloggen')]");

        public LogoutPage() {
            this.driver = DriverManager.getDriver();
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        public void verifyLogoutPage() {
            // Wait until the button is visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(loginAgainButton));

            // Validate the page title
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle, "Logout Page title does not match!");

            // Validate the presence of "Wieder einloggen" button
            Assert.assertTrue(driver.findElement(loginAgainButton).isDisplayed(), "Logout Page not loaded properly!");

            // Log and take screenshot
            ExtentReportManager.logPass("Logout Page verified successfully");
            ScreenshotUtil.captureScreenshot(driver, "LogoutPageVerified");
        }
    }