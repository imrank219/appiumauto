import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ACCOUNT_SETTINGS_Change_StudyTime extends BasicIOSTest {
    @Test
    public void ChangeGoalTest() throws IOException, InterruptedException {

        IOSDriver driver2 = IOSDesiredCapabilities();

        //PageObjects
        LoginPage lp = new LoginPage(driver2);
        StudyHomePage sp = new StudyHomePage(driver2);
        SetUpStudyPage sup = new SetUpStudyPage(driver2);
        Chapter1VideoPage c1vp = new Chapter1VideoPage(driver2);
        Chapter1SummaryCards c1sc = new Chapter1SummaryCards(driver2);
        Chapter1Quiz c1qz = new Chapter1Quiz(driver2);
        TrackPage tp = new TrackPage(driver2);
        AccountSettingsPage asp = new AccountSettingsPage(driver2);
        ChangeTimePage ctp = new ChangeTimePage(driver2);



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


        if (ispresent) {
            sp.okbuttonchapter1.click();
        } else {

        }

        boolean ispresent2 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name='Scroll down if you need to skip to a different Chapter']")).size() > 0;

        if (ispresent2) {
            sp.okbutton.click();
        } else {

        }

        boolean ispresent3 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name='Tap Track to view your progress']")).size() > 0;

        if (ispresent3) {
            sp.okbutton.click();
        } else {

        }

        boolean ispresent4 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name='See how far you’ve come, or Improve your scores by taking a recommended Quiz']")).size() > 0;
        if (ispresent4) {
            sp.okbutton.click();
        } else {

        }

        boolean ispresent5 = driver2.findElements(By.xpath("//XCUIElementTypeStaticText[@name='Switch books, change theme, or get help']")).size() > 0;

        if (ispresent5) {
            sp.getstartedpop.click();
        } else {

        }


        sp.track.click();

        Thread.sleep(2000);

        tp.accountsettings.click();

        asp.changetime.click();
        Thread.sleep(3000);

        ctp.whenfocustime.isDisplayed();

        ctp.whenyoustidybestpage.isDisplayed();

        ctp.intheevening.click();
        Thread.sleep(2000);

        ctp.backbutton.click();

        Thread.sleep(2000);
        Boolean present = ctp.intheevening.isDisplayed();
        //cgp.imnotsure.isDisplayed();
        Assert.assertTrue(present);
        System.out.println(present);

        asp.changetime.click();

        ctp.intheafternoon.click();
        Thread.sleep(2000);

        ctp.backbutton.click();

        Thread.sleep(2000);
        Boolean present2 = ctp.intheafternoon.isDisplayed();
        //cgp.imnotsure.isDisplayed();
        Assert.assertTrue(present2);
        System.out.println(present2);

        asp.changetime.click();

        ctp.latenight.click();
        Thread.sleep(2000);

        ctp.backbutton.click();

        Thread.sleep(2000);
        Boolean present3 = ctp.latenight.isDisplayed();
        //cgp.imnotsure.isDisplayed();
        Assert.assertTrue(present3);
        System.out.println(present3);

        asp.changetime.click();

        ctp.inthemorning.click();
        Thread.sleep(2000);

        ctp.backbutton.click();

        Thread.sleep(2000);
        Boolean present4 = ctp.inthemorning.isDisplayed();
        //cgp.imnotsure.isDisplayed();
        Assert.assertTrue(present4);
        System.out.println(present4);


    }


}
