package pageObjects;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangeTimePage {

    public ChangeTimePage(AppiumDriver driver2) {
        PageFactory.initElements(driver2, this);}


  //  public AccountSettingsPage(IOSDriver driver2) {
  //      PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
  //  }
//submit button
   @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"In the afternoon\"]")
    public WebElement intheafternoon;

 @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"In the evening\"]")
 public WebElement intheevening;

 @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Late night\"]")
 public WebElement latenight;

 @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"In the morning\"]")
 public WebElement inthemorning;

 @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"When’s your focus time?\"]")
 public WebElement whenfocustime;

 @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"When do you study best?\"]")
 public WebElement whenyoustidybestpage;

 @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
 public WebElement backbutton;




















}
