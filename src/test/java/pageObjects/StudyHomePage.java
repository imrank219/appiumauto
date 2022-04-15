package pageObjects;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class StudyHomePage {

    public StudyHomePage(IOSDriver driver2) {
        PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
    }
//submit button
@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Play icon']")
    public WebElement submitting;

// driver2.findElementByXPath("(//XCUIElementTypeStaticText[@name=\"Chapter 1\"])[2]").isDisplayed();
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Chapter 1\"])[2]")
    public WebElement studyhomepage;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Tap a card to jump in, or swipe it to the back of deck for later\"])")
    public WebElement popupmessgecard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public WebElement okbutton;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Scroll down if you need to skip to a different Chapter\"])")
    public WebElement scrollpopup;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Tap Track to view your progress\"])")
    public WebElement taptrackpop;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"See how far you’ve come, or Improve your scores by taking a recommended Quiz\"])")
    public WebElement howfarcomepop;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"OK\"]")
    public WebElement okbuttonchapter1;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Switch books, change theme, or get help\"])")
    public WebElement switchbookspop;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Get Started!\"]")
    public WebElement getstartedpop;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Limits, Alternatives, and Choices\"])[5]")
    public WebElement chapter1limitsaltoverview;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Play icon\"])[2]")
    public WebElement chapter1playbutton;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Limits, Alternatives, and Choices\"])[5]")
    public WebElement limitalternativeschoicessummary;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Quiz\"])[2]")
    public WebElement quizchapter1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Track Nav Icon\"]")
    public WebElement track;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"1 Card This Week\"]")
    public WebElement onecarddisplayed;



//XCUIElementTypeStaticText[@name="1 Card This Week"]


    //XCUIElementTypeButton[@name="Track Nav Icon"]










}
