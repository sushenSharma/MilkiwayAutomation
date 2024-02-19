package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    private AndroidDriver driver;
    @AndroidFindBy(id = "com.milkipay.milkipay.dev:id/nav_transfers")
    protected WebElement transfers;


    @AndroidFindBy(id="com.milkipay.milkipay.dev:id/cl_ach_deposit")
    protected WebElement ACHDeposit;

    @AndroidFindBy(id="com.milkipay.milkipay.dev:id/tvCancel")
    protected WebElement cancelButton;


    public HomePage(AndroidDriver Driver)
    {
        super(Driver);
        driver = Driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void clickCancelButton(){
        cancelButton.click();
    }
    public void clickTransfer(){
        transfers.click();
    }
    public void ACHDeposit(){
        ACHDeposit.click();
    }
}
