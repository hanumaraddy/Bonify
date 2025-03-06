package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.DashboardPage;
import com.bonify.DriverManager;

public class DashboardTest {
    private WebDriver driver;
    private DashboardPage dashboardPage;

   
    @Test
    public void testDashboardLoadsSuccessfully() {
        dashboardPage.verifyDashboardTitle(); 
    }

   
}