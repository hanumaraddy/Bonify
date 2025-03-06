package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ExtentReportManager;
import utils.ScreenshotUtil;
import org.testng.Assert;

import com.bonify.DriverManager;

public class LoginPage {
    private WebDriver driver;
    
    private WebDriverWait wait; // Explici
  
    private By Einloggen=By.xpath("//a[contains(text(),'Einloggen')]");
    private By NeubeiBonify=By.xpath("//button[text()='Neu bei Bonify']");
    private By emailField = By.xpath("//input[@id='loginId']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By checkbox = By.xpath("//label[@class='consent-checkbox']//span");
    private By loginButton = By.xpath("//input[@id='login-button']");
    private By SkipButton = By.xpath("//a[@class='sc-ciodno iUvgIG']//span");
    private By AcceptButton = By.xpath("//button[@data-testid='uc-accept-all-button']");

    
    private By acceptAllButton = By.xpath("//button[@data-testid='uc-accept-all-button']");

   
    public void clickAcceptButton() {
        try {
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(acceptAllButton));
            button.click();
        } catch (Exception e) {
            System.out.println("Accept button not found or not clickable: " + e.getMessage());
        }
    }
   
  

 
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
    }

    // Click "Einloggen" with Explicit Wait
    public void clickLoginButton() {
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        button.click();
    }
    public void clickEinloggenButton() {
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(Einloggen));
        button.click();
    }
    
    
    

    
    
    public void login(String email, String password) throws InterruptedException {
    	Thread.sleep(5000);
    	clickAcceptButton();
    	//clickEinloggenButton();
    	//driver.findElement(Einloggen).click();
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
       // driver.findElement(checkbox).click();
    	clickLoginButton();

     //   driver.findElement(loginButton).click();
        ExtentReportManager.logInfo("Entered login credentials and clicked login button");

        
        driver.findElement(SkipButton).click();

        // Assertion
        WebElement profileElement = driver.findElement(By.xpath("//a[text()='Mein Profil']//div"));
        Assert.assertTrue(profileElement.isDisplayed(), "Login Failed");
        ExtentReportManager.logPass("Login successful");

        ScreenshotUtil.captureScreenshot(driver, "LoginSuccess");
    }
}