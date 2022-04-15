package pageObjects;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangeGoalPage {

    public ChangeGoalPage(AppiumDriver driver2) {
        PageFactory.initElements(driver2, this);}


  //  public AccountSettingsPage(IOSDriver driver2) {
  //      PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
  //  }
//submit button
   @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"VIEW POLICY\"]")
    public WebElement viewpolicy;

  //  @FindBy()

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I'm not sure\"]")
    public WebElement imnotsure;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Learn the basics\"]")
    public WebElement learnbasicsgoal;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    public WebElement backlink;

    @FindBy(xpath = ("//XCUIElementTypeStaticText[@name=\"Learn the basics\"]"))
    public WebElement learnbasics;

    @FindBy(xpath = ("//XCUIElementTypeStaticText[@name=\"Practice what I learned\"]"))
    public WebElement practice;

    @FindBy(xpath = ("//XCUIElementTypeStaticText[@name=\"Study for an exam\"]"))
    public WebElement studyexam;












}
