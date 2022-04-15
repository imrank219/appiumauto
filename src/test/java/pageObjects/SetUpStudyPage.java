package pageObjects;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SetUpStudyPage {

    public SetUpStudyPage(IOSDriver driver2) {
        PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
    }
//submit button
@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Play icon']")
    public WebElement submitting;

// driver2.findElementByXPath("(//XCUIElementTypeStaticText[@name=\"Chapter 1\"])[2]").isDisplayed();
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Chapter 1\"])[2]")
    public WebElement studyhomepage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Which book are you studying?\"]")
    public WebElement setupbook;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Select a book\"]")
    public WebElement selectbookmessage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"You can change this later\"]")
    public WebElement youcanchangemessage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Economics\"]")
    public WebElement setupbookeconomics;

    //XCUIElementTypeApplication[@name="Redi"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]

    @iOSXCUITFindBy(iOSNsPredicate = "value == 'Economics'")
    public WebElement setupbookeconomics2;




    //label == "Economics"

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Great!\"]")
    public WebElement greatmessage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Now let's set a study goal\"]")
    public WebElement setstudygoalmessage;



    //What's your study goal page

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"What's your study goal?\"]")
    public WebElement studygoalpage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Select your key goal\"]")
    public WebElement selectkeygoalmessage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Let’s see when you study best\"]")
    public WebElement studybestmessage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Learn the basics\"]")
    public WebElement learnbasics;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Master chapter contents\"]")
    public WebElement masterchaptercontents;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Prepare with confidence\"]")
    public WebElement prepareconfidence;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Study for an exam\"]")
    public WebElement studyforexam;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Practice what I learned\"]")
    public WebElement practicelearned;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Train your brain\"]")
    public WebElement trainbrain;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I'm not sure\"]")
    public WebElement notsure;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Just get started\"]")
    public WebElement justgetstarted;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Smart!\"]")
    public WebElement smartmessage;

    //When do you study best page

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"When do you study best?\"]")
    public WebElement studybestpage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"When’s your focus time?\"]")
    public WebElement whenfocustimemessage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Let’s see when you study best\"]")
    public WebElement seewhenyoustudybestmessage;


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"In the morning\"]")
    public WebElement inmorning;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Before School\"]")
    public WebElement beforeschool;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"In the afternoon\"]")
    public WebElement inafternoon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"During break\"]")
    public WebElement duringbreak;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"In the evening\"]")
    public WebElement inevening;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"After School\"]")
    public WebElement afterschool;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Late night\"]")
    public WebElement latenight;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Before bed\"]")
    public WebElement beforebed;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Ok, you’re a morning person!\"]")
    public WebElement morningpersonmessage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Let’s build your plan\"]")
    public WebElement buildplanmessage;

    //Building a plan page

   // @iOSXCUITFindBy(iOSNsPredicate = "value == \"Building your plan\"")
  //  public WebElement emailbox2;

    //XCUIElementTypeStaticText[@name="Building your plan"]
    //XCUIElementTypeStaticText[@name="Building your plan"]
    //label == "Building your plan"



    //XCUIElementTypeStaticText[@name="Economics"]
    ////XCUIElementTypeStaticText[@name="Select a book"]
    //XCUIElementTypeStaticText[@name="You can change this later"]
    //XCUIElementTypeStaticText[@name="Great!"]
    //XCUIElementTypeStaticText[@name="Now let's set a study goal"]
    //XCUIElementTypeStaticText[@name="What's your study goal?"]

    //XCUIElementTypeStaticText[@name="Select your key goal"]
    //XCUIElementTypeStaticText[@name="Let’s see when you study best"]
    //XCUIElementTypeStaticText[@name="Learn the basics"]
    //XCUIElementTypeStaticText[@name="Master chapter contents"]
    //XCUIElementTypeStaticText[@name="Study for an exam"]
    //XCUIElementTypeStaticText[@name="Prepare with confidence"]
    //XCUIElementTypeStaticText[@name="Practice what I learned"]
    //XCUIElementTypeStaticText[@name="Train your brain"]
    //XCUIElementTypeStaticText[@name="I'm not sure"]
    //XCUIElementTypeStaticText[@name="Just get started"]

//XCUIElementTypeStaticText[@name="Smart!"]

    //XCUIElementTypeStaticText[@name="When do you study best?"]
    //XCUIElementTypeStaticText[@name="When’s your focus time?"]
    //XCUIElementTypeStaticText[@name="Let’s see when you study best"]

//XCUIElementTypeStaticText[@name="In the morning"]
    //XCUIElementTypeStaticText[@name="Before School"]
    //XCUIElementTypeStaticText[@name="In the afternoon"]

//XCUIElementTypeStaticText[@name="During break"]
    //XCUIElementTypeStaticText[@name="In the evening"]
    //XCUIElementTypeStaticText[@name="After School"]

    //XCUIElementTypeStaticText[@name="Late night"]
    //XCUIElementTypeStaticText[@name="Before bed"]
    //XCUIElementTypeStaticText[@name="In the afternoon"]
    //XCUIElementTypeStaticText[@name="During break"]
    //XCUIElementTypeStaticText[@name="Ok, you’re a morning person!"]
    //XCUIElementTypeStaticText[@name="Let’s build your plan"]




}
