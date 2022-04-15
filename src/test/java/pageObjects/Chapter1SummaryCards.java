package pageObjects;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Chapter1SummaryCards {

    public Chapter1SummaryCards(IOSDriver driver2) {
        PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
    }
//submit button
@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Play icon']")
    public WebElement submitting;


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Scarcity leads to choices and opportunity costs. Opportunity cost is the value of the best alternate option.\"]")
    public WebElement summarycard2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Individuals compare costs and benefits and their decisions are purposeful. Purposeful behavior reflects rational self-interest.\"]")
    public WebElement summarycard3;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Limits, Alternatives, and Choices\"])[9]")
    public WebElement summaryheading;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Economics is a social science that explores how individuals, institutions, and society make optimal choices under conditions of scarcity.\"]")
    public WebElement summarycard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Tap images to view them in full screen.\"]")
    public WebElement summarypop1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    public WebElement backbutton;


    //XCUIElementTypeButton[@name="Back"]


    //XCUIElementTypeStaticText[@name="Tap images to view them in full screen."]

    //XCUIElementTypeStaticText[@name="Economics is a social science that explores how individuals, institutions, and society make optimal choices under conditions of scarcity."]




//XCUIElementTypeStaticText[@name="Individuals compare costs and benefits and their decisions are purposeful. Purposeful behavior reflects rational self-interest."]




}
