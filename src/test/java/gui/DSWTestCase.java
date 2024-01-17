package gui;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import utilies.PropertyReader;

import java.net.MalformedURLException;
import java.net.URL;

public class DSWTestCase {

    //protected WebDriver driver;
    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public void startBrowser() throws MalformedURLException {

        String browserName = PropertyReader.properties().getProperty("selenium.browser");
        System.out.println(browserName);

        URL url = new URL("http://localhost:4444/wd/hub");

        switch (browserName){
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                //driver = new RemoteWebDriver(url, chromeOptions);
                driver.set(new RemoteWebDriver(url, chromeOptions));
                break;
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                //driver = new RemoteWebDriver(url,firefoxOptions);
                driver.set(new RemoteWebDriver(url, firefoxOptions));
                break;
            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                //driver = new RemoteWebDriver(url,edgeOptions);
                driver.set(new RemoteWebDriver(url, edgeOptions));
                break;
        }

        System.out.println("Driver started");
    }
    @AfterTest
    public void terminateBrowser(){
        driver.get().quit();
        System.out.println("Driver quited");

    }
}
