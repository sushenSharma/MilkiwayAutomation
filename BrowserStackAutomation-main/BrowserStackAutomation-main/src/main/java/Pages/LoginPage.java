package Pages;



import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage extends BasePage{

    private AndroidDriver driver;
    @AndroidFindBy(id = "com.milkipay.milkipay.dev:id/edtPhone")
    protected WebElement phoneNumberTextField;

    @AndroidFindBy(id="com.milkipay.milkipay.dev:id/edtPassword")
    protected WebElement passwordTextField;

    @AndroidFindBy(id ="com.milkipay.milkipay.dev:id/btnLogin")
    protected WebElement loginButton;

    @AndroidFindBy(id="com.milkipay.milkipay.dev:id/enterCodeEditText")
    protected WebElement OTPText;



    public LoginPage(AndroidDriver Driver)
    {
        super(Driver);
        driver = Driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void Login(String number,String password){
        phoneNumberTextField.click();
        phoneNumberTextField.sendKeys(number);
        passwordTextField.click();
        passwordTextField.sendKeys(password);
        hideKeyboard();
        loginButton.click();

    }

    public void enterOTP(String OTP){
        OTPText.click();
        OTPText.sendKeys(OTP);


    }

}
