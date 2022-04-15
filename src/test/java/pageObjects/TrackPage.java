package pageObjects;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrackPage {

    public TrackPage(IOSDriver driver2) {
        PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
    }
//submit button
@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"ACCOUNT SETTINGS\"])[1]")
    public WebElement accountsettings;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"0\"]")
    public WebElement cardzero;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='－']")
    public WebElement zero;

    //XCUIElementTypeStaticText[@name="－"]

    //XCUIElementTypeStaticText[@name="0"]



//XCUIElementTypeStaticText[@name="1 Card This Week"]


    //XCUIElementTypeButton[@name="Track Nav Icon"]










}
