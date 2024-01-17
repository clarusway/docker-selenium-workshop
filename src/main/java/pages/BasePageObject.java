package pages;

import modules.BaseWebDriver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePageObject {

    private final WebDriverWait wait;
    private final JavascriptExecutor js;
    protected final Actions actions;
    protected final WebDriver driver;

    public BasePageObject(final WebDriver driver) {
        this.driver = driver;
        js = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, 30);
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getElementText(WebElement webElement) {
        waitUntilVisible(webElement);
        return webElement.getText();
    }

    public void sendKeysFunction(WebElement webElement, String value) {
        waitUntilVisible(webElement);
        webElement.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        webElement.sendKeys(value);
    }

    public void clickFunction(WebElement webElement) {
        waitUntilClickable(webElement);
        scrollUpToElement(webElement);
        webElement.click();
    }

    public void waitUntilClickable(WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void scrollToElement(WebElement webElement) {
        js.executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    public void scrollUpToElement(WebElement webElement) {
        js.executeScript("arguments[0].setAttribute('style','top:0px');", webElement);
        js.executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    public void waitUntilVisible(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilInVisible(WebElement webElement) {
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public void verifyElementContainsText(WebElement webElement, String text) {
        wait.until(ExpectedConditions.textToBePresentInElement(webElement, text));
        Assert.assertTrue(webElement.getText().toLowerCase().contains(text.toLowerCase()));
    }

}
