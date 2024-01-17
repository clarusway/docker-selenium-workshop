package modules;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseWebDriver {

    public static WebDriver driver;
    private static final String BROWSER = System.getProperty("selenium.browser", "chrome");
    //private static ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (BROWSER) {
                case "chrome":

                    try {
                        DesiredCapabilities dc = new DesiredCapabilities();
                        dc.setCapability("browserName","chrome");
                        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new ChromeOptions());
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }


                    break;

                case "firefox":

                    try {
                        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new FirefoxOptions());
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }


                    break;
            }
        }
        return driver;
    }

    public static WebDriver initRemoteDriver(Capabilities capabilities) {
        WebDriver remoteDriver = null;
        try {
            remoteDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return remoteDriver;
    }

    public static void quitDriver() {
        driver.quit();

    }
}
