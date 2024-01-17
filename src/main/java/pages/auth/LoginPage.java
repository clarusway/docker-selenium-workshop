package pages.auth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePageObject;
import pojos.user.User;

public class LoginPage extends BasePageObject {

    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    private WebElement loginBtn;

    public LoginPage(final WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(getDriver(),this);
    }

    public void fillLoginMask(final User user){

        if (user == null) {
            throw new IllegalArgumentException("User can't be null");
        }
        sendKeysFunction(emailInput, user.getEmail());

        sendKeysFunction(passwordInput, user.getPassword());
    }

    public void clickLoginBtn(){
        clickFunction(loginBtn);
    }
}
