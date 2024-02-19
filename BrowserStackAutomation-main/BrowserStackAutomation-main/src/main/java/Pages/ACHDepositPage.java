package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ACHDepositPage extends BasePage{
    private AndroidDriver driver;

    @AndroidFindBy(id = "com.milkipay.milkipay.dev:id/iv_bank")
    protected WebElement plaidSaving;

    @AndroidFindBy(id = "com.milkipay.milkipay.dev:id/tv_send_money")
    protected WebElement deposit;

    @AndroidFindBy(id="com.milkipay.milkipay.dev:id/tv_confirm")
    protected WebElement confirmAndDeposit;
    public ACHDepositPage(AndroidDriver Driver)
    {
        super(Driver);
        driver = Driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void ACHDepositbyplaidSaving(){
        plaidSaving.click();
        deposit.click();
        waitInMilliseconds(5000);
        confirmAndDeposit.click();


    }
}
