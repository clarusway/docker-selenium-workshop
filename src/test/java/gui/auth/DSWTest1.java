package gui.auth;

import gui.DSWTestCase;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
import pages.auth.LoginPage;
import pages.home.HomePage;
import pojos.user.User;
import providers.TestDataProvider;

import java.net.MalformedURLException;

public class DSWTest1 extends DSWTestCase{

    HomePage homePage;
    LoginPage loginPage;

    @BeforeTest
    public void setup() throws MalformedURLException {

        super.startBrowser();
        // driver.get() came from ThreadLocal<WebDriver>
        homePage = new HomePage(driver.get());
        loginPage = new LoginPage(driver.get());
    }

    @Test(priority = 1)
    public void navigateHomePage(){

        homePage.navigateToHomePage();

    }

    @Test(priority = 2)
    public void navigateToLoginPage(){
        homePage.navigateToLoginSignUp();
    }

    @Test(priority = 3)
    public void fillLoginMask(){

        User user = new TestDataProvider().getUser(DSWTest1.class);

        loginPage.fillLoginMask(user);
    }

    @Test(priority = 4)
    public void clickLoginBtn(){
        loginPage.clickLoginBtn();
    }

}
