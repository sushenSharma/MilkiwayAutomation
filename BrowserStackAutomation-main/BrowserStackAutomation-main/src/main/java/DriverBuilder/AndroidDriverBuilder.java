package DriverBuilder;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverBuilder {

    String userName = "unknownbrother_uORviq";
    String accessKey = "xjF9KWmMzyqAdv7B19xx";
    String app = "bs://6a685f5ecfaad84ab031140350932f746e1d9458";

    public  AndroidDriver createAndroidDriverInstance() {
        AndroidDriver driver;
        DesiredCapabilities Capabilities = new DesiredCapabilities();
        Capabilities.setCapability("deviceName", "Samsung Galaxy S21");
        Capabilities.setCapability("os_version", "12.0");
        Capabilities.setCapability("project", "sample project");
        Capabilities.setCapability("build", "1.0");
        Capabilities.setCapability("name", "browserStackTest");
        Capabilities.setCapability("app", app);
        URL url;
        try {
            url = new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver = new AndroidDriver(url, Capabilities);
        return driver;
    }

}
