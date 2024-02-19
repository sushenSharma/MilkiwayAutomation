package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    private AndroidDriver driver;
    public BasePage(AndroidDriver Driver)
    {
        driver = Driver;

    }


    public void hideKeyboard(){
        driver.hideKeyboard();
    }
    public void waitInMilliseconds(int milliseconds)  {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
