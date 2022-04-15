package pageObjects;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Chapter1Quiz {

    public Chapter1Quiz(IOSDriver driver2) {
        PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
    }
//submit button
@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Play icon']")
    public WebElement submitting;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"See how many answers you can choose for each question.\"]")
    public WebElement quizpop1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public WebElement okbutton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"OK\"]")
    public WebElement okbutton2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"an opportunity cost\"]")
    public WebElement opportunitycost;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"You got it!\"]")
    public WebElement quiz1correct;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Microeconomics\"]")
    public WebElement microeconomics;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Macroeconomics\"]")
    public WebElement macroeconomics;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Cause-and-effect relationships\"]")
    public WebElement causeeffect;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Facts\"]")
    public WebElement facts;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"You got it!\"])[1]")
    public WebElement quiz1correct1;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"You got it!\"])[2]")
    public WebElement quiz1correct2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"applicable only to macroeconomics\"]")
    public WebElement applicamacro;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Incorrect Answer\"])[1]")
    public WebElement quizwrong;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"scarce economic resources\"]")
    public WebElement scareeconomic;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"capital\"]")
    public WebElement capital;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"The country can increase its output of beef from 0 tons to 30 tons by sacrificing 30 tons of vegetables.\"]")
    public WebElement country1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"The slope of the production possibilities curve is 1.\"]")
    public WebElement slope;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"As price increases, quantity demanded decreases.\"]")
    public WebElement priceincreases;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"You scored 88%. Time for the next lesson.\"]")
    public WebElement score;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Break icon\"]")
    public WebElement breakicon;

    //XCUIElementTypeButton[@name="Break icon"]

    //XCUIElementTypeStaticText[@name="You scored 88%. Time for the next lesson."]

    //XCUIElementTypeStaticText[@name="As price increases, quantity demanded decreases."]

    //XCUIElementTypeStaticText[@name="The country can increase its output of beef from 0 tons to 30 tons by sacrificing 30 tons of vegetables."]

    //XCUIElementTypeStaticText[@name="The slope of the production possibilities curve is 1."]

    //XCUIElementTypeStaticText[@name="In economics, the term __ describes spending that pays for the production and accumulation of capital goods."]



//XCUIElementTypeStaticText[@name="capital"]


    //XCUIElementTypeStaticText[@name="scarce economic resources"]




    //XCUIElementTypeStaticText[@name="applicable only to macroeconomics"]



    //XCUIElementTypeStaticText[@name="Facts"]




    //XCUIElementTypeStaticText[@name="You got it!"]


    //XCUIElementTypeButton[@name="OK"]
    //XCUIElementTypeStaticText[@name="OK"]

    //XCUIElementTypeStaticText[@name="an opportunity cost"]



    //XCUIElementTypeStaticText[@name="See how many answers you can choose for each question."]


    //XCUIElementTypeButton[@name="Back"]


    //XCUIElementTypeStaticText[@name="Tap images to view them in full screen."]

    //XCUIElementTypeStaticText[@name="Economics is a social science that explores how individuals, institutions, and society make optimal choices under conditions of scarcity."]




//XCUIElementTypeStaticText[@name="Individuals compare costs and benefits and their decisions are purposeful. Purposeful behavior reflects rational self-interest."]




}
