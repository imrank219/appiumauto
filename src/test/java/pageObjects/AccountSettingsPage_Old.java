package pageObjects;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AccountSettingsPage_Old {

    public AccountSettingsPage_Old(IOSDriver driver2) {
        PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
    }
//submit button
@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"VIEW POLICY\"]")
    public WebElement viewpolicy;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"VIEW TERMS\"]")
    public WebElement viewterms;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Privacy Center\"])[1]")
    public WebElement privacycenter;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Terms of Use\"])[2]")
    public WebElement termsofuse;












}
