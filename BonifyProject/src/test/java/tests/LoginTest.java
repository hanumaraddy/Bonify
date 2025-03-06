package tests;

import org.testng.annotations.Test;

import com.bonify.BaseTest;

import Pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void testLogin() throws InterruptedException {
    	 LoginPage loginPage = new LoginPage(driver);
    	 loginPage.login("just.sdet2@gmail.com", "Test@123");
    }
    
}