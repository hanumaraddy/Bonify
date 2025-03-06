package tests;

import org.testng.annotations.Test;

import com.bonify.BaseTest;

import Pages.LogoutPage;
import utils.ExtentReportManager;

public class LogoutTest extends BaseTest {
    @Test
    public void testLogout() {
        ExtentReportManager.startTest("Logout Test");

        LogoutPage logoutPage = new LogoutPage();
        logoutPage.verifyLogoutPage();

        ExtentReportManager.logInfo("Logout test executed successfully");
    }
    
  
}