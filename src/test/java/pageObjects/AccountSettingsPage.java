package pageObjects;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettingsPage {

    public AccountSettingsPage(AppiumDriver driver2) {
        PageFactory.initElements(driver2, this);}


  //  public AccountSettingsPage(IOSDriver driver2) {
  //      PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
  //  }
//submit button
   @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"VIEW POLICY\"]")
    public WebElement viewpolicy;

  //  @FindBy()

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"VIEW TERMS\"]")
    public WebElement viewterms;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Privacy Center\"])[1]")
    public WebElement privacycenter;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Terms of Use\"])[2]")
    public WebElement termsofuse;

    @FindBy(xpath = ("//XCUIElementTypeStaticText[@name=\"CHANGE GOAL\"]"))
    public WebElement changegoal;

    @FindBy(xpath = ("//XCUIElementTypeStaticText[@name=\"CHANGE TIME\"]"))
    public WebElement changetime;

    @FindBy(xpath = ("//XCUIElementTypeStaticText[@name=\"RESET BOOK\"]"))
    public WebElement resetbook;

    @FindBy(xpath = ("//XCUIElementTypeButton[@name=\"Yes, Reset Book\"]"))
    public WebElement resetbookyes;



    @FindBy(xpath = ("//XCUIElementTypeButton[@name=\"OK\"]"))
    public WebElement okbutton;

    @FindBy(xpath = ("//XCUIElementTypeStaticText[@name=\"Progress Reset\"]"))
    public WebElement progressreset;

    @FindBy(xpath = ("//XCUIElementTypeButton[@name=\"Back\"]"))
    public WebElement backbutton;

    //XCUIElementTypeButton[@name="Back"]

    //XCUIElementTypeStaticText[@name="Progress Reset"]

    //XCUIElementTypeButton[@name="OK"]

    //XCUIElementTypeStaticText[@name="RESET BOOK"]

    //XCUIElementTypeButton[@name="Yes, Reset Book"]



   // (//XCUIElementTypeStaticText[@name="Terms of Use"])[2]












}
