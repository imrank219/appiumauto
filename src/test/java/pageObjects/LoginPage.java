package pageObjects;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(IOSDriver driver2) {
        PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
    }
  //  public LoginPage(IOSDriver driver2) {
  //      PageFactory.initElements((driver2), this);
  //  }
//submit button
//@iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name='Play icon']")
//public WebElement submitting;

@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Play icon']")
    public WebElement submitting;


//Sign In button

//    @iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name=\"Sign In\"]")
//    public WebElement signin;

@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign In\"]")
public WebElement signin;

  //  @iOSXCUITBy(xpath ="//XCUIElementTypeStaticText[@name='Please enter a valid email address.']")
 //   public WebElement displayerroremail;

@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Please enter a valid email address.']")
public WebElement displayerroremail;

 //   @iOSXCUITBy(iOSNsPredicate = "value == \"Email\"" )
 //   public WebElement email;
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"Email\"" )
    public WebElement email;

 //   @iOSXCUITBy(iOSNsPredicate = "value == \"ikhan123@mailinato\"")
 //   public WebElement emailbox2;

    @iOSXCUITFindBy(iOSNsPredicate = "value == \"ikhan123@mailinato\"")
    public WebElement emailbox2;

 //   @iOSXCUITBy(iOSNsPredicate = "value == \"prodtester24@mailinato\"")
 //   public WebElement emailbox2a;
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"prodtester24@mailinato\"")
    public WebElement emailbox2a;

 //   @iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please enter a valid password at least 6 characters long.\"]")
 //   public WebElement passwordmessage;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please enter a valid password at least 6 characters long.\"]")
    public WebElement passwordmessage;

 //   @iOSXCUITBy(iOSNsPredicate = "value == \"Password\"")
 //   public WebElement password;

@iOSXCUITFindBy(iOSNsPredicate = "value == \"Password\"")
public WebElement password;

 //   @iOSXCUITBy(iOSNsPredicate = "value == \"••••\"")
 //   public WebElement password2;

@iOSXCUITFindBy(iOSNsPredicate = "value == \"••••\"")
public WebElement password2;

}
