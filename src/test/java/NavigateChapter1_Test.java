import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class NavigateChapter1_Test extends BasicIOSTest {
    @Test
    public void StudySmokeTest() throws IOException, InterruptedException {

        IOSDriver driver2 = IOSDesiredCapabilities();

        //PageObjects
        LoginPage lp = new LoginPage(driver2);
        StudyHomePage sp = new StudyHomePage(driver2);
        SetUpStudyPage sup = new SetUpStudyPage(driver2);
        Chapter1VideoPage c1vp = new Chapter1VideoPage(driver2);
        Chapter1SummaryCards c1sc = new Chapter1SummaryCards(driver2);
        Chapter1Quiz c1qz = new Chapter1Quiz(driver2);

     String TestFile = "/Users/imrankhan/Desktop/AppiumImran/src/test/java/Resources/UserName.txt";

     FileReader FR = new FileReader(TestFile);
     BufferedReader BR = new BufferedReader(FR);
     String Content = "";

     Content = BR.readLine();

         lp.signin.click();

        Thread.sleep(3000);
      //  lp.email.sendKeys("prodtester43@mailinator.com");
        lp.email.sendKeys(Content);

        Thread.sleep(1000);

        lp.password.sendKeys("Test12345");

        lp.submitting.click();
        WebDriverWait wait = new WebDriverWait(driver2, 5000);


        wait.until(ExpectedConditions.or(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeStaticText[@name='Chapter 1'])[2]")),
                ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeStaticText[@name=\"Tap a card to jump in, or swipe it to the back of deck for later\"])"))
        ));

       boolean ispresent = driver2.findElements(By.xpath("(//XCUIElementTypeStaticText[@name='Tap a card to jump in, or swipe it to the back of deck for later'])")).size() > 0;



       if(ispresent){
           sp.okbuttonchapter1.click();
       }else{

       }

        boolean ispresent2 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name='Scroll down if you need to skip to a different Chapter']")).size() > 0;

        if(ispresent2){
            sp.okbutton.click();
        }else{

        }

        boolean ispresent3 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name='Tap Track to view your progress']")).size() > 0;

        if(ispresent3){
            sp.okbutton.click();
        }else{

        }

        boolean ispresent4 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name='See how far you’ve come, or Improve your scores by taking a recommended Quiz']")).size() > 0;
        if(ispresent4){
            sp.okbutton.click();
        }else{

        }

        boolean ispresent5 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name='Switch books, change theme, or get help']")).size() > 0;

        if(ispresent5){
            sp.getstartedpop.click();
        }else{

        }


        //Chapter 1 Selection

        sp.chapter1playbutton.click();

        Thread.sleep(3000);

     //   c1vp.chapter1heading.isDisplayed();

        boolean ispresent7 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Tap to pause. Double tap on the left or right side of the screen to skip.\"]")).size() > 0;
        if(ispresent7){
            sp.okbuttonchapter1.click();
        }else{

        }

        boolean ispresent8 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Turn closed captions on, jump to a different section, or change speed.\"]")).size() > 0;

        if(ispresent8){
            sp.okbuttonchapter1.click();
        }else{

        }

        boolean ispresent9 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Note: You can't skip forward past parts you haven't watched yet.\"]")).size() > 0;

        if(ispresent9){
            sp.okbuttonchapter1.click();
        }else{

        }

        //Verifying visibility of fields of Chapter 1 video lesson

        c1vp.chapter1ccoff.isDisplayed();
        c1vp.chapter1definingeconomics.isDisplayed();
        c1vp.chapter1speed1x.isDisplayed();

        //Select back button
        c1vp.chapter1backbutton.click();


        JavascriptExecutor js = (JavascriptExecutor) driver2;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "down");
        scrollObject.put("xpath", "(//XCUIElementTypeStaticText[@name=\"12 min\"])[2]");
        js.executeScript("mobile: scroll", scrollObject);

        //Select Limits Alternatives and Choices Summary

        sp.limitalternativeschoicessummary.click();

        wait.until(ExpectedConditions.visibilityOf(c1sc.summarypop1)).isDisplayed();



        //Navigate through summary

        boolean ispresent10 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Tap images to view them in full screen.\"]")).size() > 0;

        if(ispresent10){
            sp.okbutton.click();
        }else{

        }

        boolean ispresent11 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Swipe left to keep going\"]")).size() > 0;

        if(ispresent11){
            sp.okbutton.click();
        }else{

        }

        scrollObject.put("direction", "right");
        scrollObject.put("xpath", "//XCUIElementTypeStaticText[@name=\"Scarcity leads to choices and opportunity costs. Opportunity cost is the value of the best alternate option.\"]");
        js.executeScript("mobile: scroll", scrollObject);

        c1sc.summarycard2.isDisplayed();


        scrollObject.put("direction", "left");
        scrollObject.put("xpath", "//XCUIElementTypeStaticText[@name=\"Economics is a social science that explores how individuals, institutions, and society make optimal choices under conditions of scarcity.\"]");
        js.executeScript("mobile: scroll", scrollObject);

        c1sc.summarycard.isDisplayed();

        c1sc.backbutton.click();

        sp.quizchapter1.click();

        Thread.sleep(3000);

        boolean ispresent12 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"See how many answers you can choose for each question.\"]")).size() > 0;

        if(ispresent12){
            c1qz.okbutton.click();
        }else{

        }

        Thread.sleep(2000);

        boolean ispresent13 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Tap to choose answers.\"]")).size() > 0;

        if(ispresent13){
            c1qz.okbutton.click();
        }else{

        }

        Thread.sleep(2000);

        c1qz.opportunitycost.click();

        Thread.sleep(2000);

        boolean ispresent14 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Swipe left to see the answer\"]")).size() > 0;

        if(ispresent14){
            c1qz.okbutton.click();
        }else{

        }



        new TouchAction(driver2)
                .press(PointOption.point(256, 1115))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .perform();
             //   .moveTo(PointOption.point(100, 600))
              //  .release()
              //  .perform();

        Thread.sleep(2000);


        boolean ispresent15 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Swipe left for the next question\"]")).size() > 0;

        if(ispresent15){
            c1qz.okbutton.click();
        }else{

        }



        scrollObject.put("direction", "right");
        scrollObject.put("xpath", "//XCUIElementTypeStaticText[@name=\"Which discipline studies the decision-making process of customers, workers, households, and business firms on an individual basis rather than as aggregates?\"]");
        js.executeScript("mobile: scroll", scrollObject);

        Thread.sleep(2000);

        c1qz.microeconomics.click();

        Thread.sleep(2000);

        new TouchAction(driver2)
                .press(PointOption.point(256, 1115))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .perform();

        c1qz.quiz1correct.isDisplayed();

        scrollObject.put("direction", "right");
        scrollObject.put("xpath", "//XCUIElementTypeStaticText[@name=\"Which discipline studies the economy as a whole or its basic subdivisions or aggregates?\"]");
        js.executeScript("mobile: scroll", scrollObject);

        Thread.sleep(2000);

        c1qz.macroeconomics.click();

        Thread.sleep(2000);

        new TouchAction(driver2)
                .press(PointOption.point(256, 1115))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .perform();

        c1qz.quiz1correct.isDisplayed();

        scrollObject.put("direction", "right");
        scrollObject.put("xpath", "//XCUIElementTypeStaticText[@name=\"Which of the following are the focus of positive economics?\"]");
        js.executeScript("mobile: scroll", scrollObject);


        Thread.sleep(2000);

        c1qz.causeeffect.click();
        c1qz.facts.click();

        Thread.sleep(2000);

        new TouchAction(driver2)
                .press(PointOption.point(256, 1115))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .perform();

        c1qz.quiz1correct1.isDisplayed();
        c1qz.quiz1correct2.isDisplayed();


        scrollObject.put("direction", "right");
        scrollObject.put("xpath", "//XCUIElementTypeStaticText[@name=\"Normative economics is ______.\"]");
        js.executeScript("mobile: scroll", scrollObject);

        Thread.sleep(2000);

        c1qz.applicamacro.click();

        Thread.sleep(2000);

        new TouchAction(driver2)
                .press(PointOption.point(256, 1115))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .perform();

        c1qz.quizwrong.isDisplayed();

        scrollObject.put("direction", "right");
        scrollObject.put("xpath", "//XCUIElementTypeStaticText[@name=\"Land and mineral resources, transportation and communication facilities, factories and farm buildings, equipment, tools and machinery are all examples of _______.\"]");
        js.executeScript("mobile: scroll", scrollObject);


        Thread.sleep(2000);

        c1qz.scareeconomic.click();

        Thread.sleep(2000);

        new TouchAction(driver2)
                .press(PointOption.point(256, 1115))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .perform();

        c1qz.quiz1correct.isDisplayed();


        scrollObject.put("direction", "right");
        scrollObject.put("xpath", "//XCUIElementTypeStaticText[@name=\"Factories, storage, transportation, and machinery are all examples of ______ goods.\"]");
        js.executeScript("mobile: scroll", scrollObject);

        Thread.sleep(2000);

        c1qz.capital.click();

        Thread.sleep(2000);

        new TouchAction(driver2)
                .press(PointOption.point(256, 1115))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .perform();

        c1qz.quiz1correct.isDisplayed();

        scrollObject.put("direction", "right");
        scrollObject.put("xpath", "//XCUIElementTypeStaticText[@name=\"If a production possibilities curve shows that the United States has an opportunity-cost ratio of 1 ton of vegetables for 1 ton of beef, what does that mean?\"]");
        js.executeScript("mobile: scroll", scrollObject);

        Thread.sleep(2000);

        c1qz.country1.click();
        c1qz.slope.click();
        Thread.sleep(2000);

        new TouchAction(driver2)
                .press(PointOption.point(256, 1115))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .perform();

        scrollObject.put("direction", "right");
        scrollObject.put("xpath", "//XCUIElementTypeStaticText[@name=\"In economics, the term __ describes spending that pays for the production and accumulation of capital goods.\"]");
        js.executeScript("mobile: scroll", scrollObject);

        Thread.sleep(2000);

        c1qz.priceincreases.click();

        Thread.sleep(2000);

        new TouchAction(driver2)
                .press(PointOption.point(256, 1115))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .perform();

        scrollObject.put("direction", "right");
        scrollObject.put("xpath", "//XCUIElementTypeStaticText[@name=\"Quiz Done\"]");
        js.executeScript("mobile: scroll", scrollObject);

        c1qz.score.isDisplayed();

        Thread.sleep(1000);

        c1qz.breakicon.click();

        Thread.sleep(2000);

        sp.track.click();

        Thread.sleep(2000);

        sp.onecarddisplayed.isDisplayed();
















    }






}
