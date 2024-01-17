package pages.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePageObject;

public class ProductPage extends BasePageObject {

    @FindBy(xpath = "//div[@class='product-information']/h2")
    private WebElement name;

    @FindBy(xpath = "//div[@class='product-information']/span/span")
    private WebElement price;

    @FindBy(xpath = "//input[@id='quantity']")
    private WebElement quantity;

    public ProductPage(final WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(getDriver(), this);
    }


}
