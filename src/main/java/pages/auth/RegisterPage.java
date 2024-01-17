package pages.auth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePageObject;
import pojos.user.User;

public class RegisterPage extends BasePageObject {

    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement nameInput;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    private WebElement emailInput;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    private WebElement signUpBtn;

    public RegisterPage(final WebDriver driver)

    {
        super(driver);
        PageFactory.initElements(getDriver(), this);
    }

    public void fillNameAndEmail (final User user){

        if (user == null) {
            throw new IllegalArgumentException("User can't be null");
        }
        sendKeysFunction(nameInput, user.getName());

        sendKeysFunction(emailInput, user.getEmail());
    }

    public void clickSignUpBtn(){
        clickFunction(signUpBtn);
    }
}
