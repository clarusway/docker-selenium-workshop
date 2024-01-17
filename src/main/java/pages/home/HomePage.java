package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePageObject;

public class HomePage extends BasePageObject {

    @FindBy(xpath = "(//ul[@class='nav navbar-nav']/li)[4]")
    private WebElement loginSignUpBtn;

    public HomePage(final WebDriver driver) {
        super(driver);
        PageFactory.initElements(getDriver(),this);
    }

    public void navigateToHomePage(){
        driver.get("https://automationexercise.com/");
    }

    public void navigateToLoginSignUp(){
        clickFunction(loginSignUpBtn);
    }
}
