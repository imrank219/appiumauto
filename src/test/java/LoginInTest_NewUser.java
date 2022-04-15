import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.SetUpStudyPage;
import pageObjects.StudyHomePage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;

public class LoginInTest_NewUser extends BasicIOSTest {
    @Test
    public void Login() throws IOException, InterruptedException {

        IOSDriver driver2 = IOSDesiredCapabilities();

        String TestFile = "/Users/imrankhan/Desktop/AppiumImran/src/test/java/Resources/UserName.txt";
        FileReader FR = new FileReader(TestFile);
        BufferedReader BR = new BufferedReader(FR);
        String Content = "";

        Content = BR.readLine();

        //PageObjects
        LoginPage lp = new LoginPage(driver2);
        StudyHomePage sp = new StudyHomePage(driver2);
        SetUpStudyPage sup = new SetUpStudyPage(driver2);

         lp.signin.click();

        Thread.sleep(3000);
       // lp.email.sendKeys("prodtester42@mailinator.com");

        lp.email.sendKeys(Content);

        Thread.sleep(1000);

        lp.password.sendKeys("Test12345");

        lp.submitting.click();
        WebDriverWait wait = new WebDriverWait(driver2, 5000);


        wait.until(ExpectedConditions.visibilityOf(sup.setupbook)).isDisplayed();
        sup.youcanchangemessage.isDisplayed();
        sup.selectbookmessage.isDisplayed();

        //select economics book

        sup.setupbookeconomics.click();

        //validate messages are changes

        sup.greatmessage.isDisplayed();
        sup.setstudygoalmessage.isDisplayed();

        lp.submitting.click();

        //Set Study Goal
        wait.until(ExpectedConditions.visibilityOf(sup.studygoalpage)).isDisplayed();

        //validating all the text is displayed correctly
        sup.selectkeygoalmessage.isDisplayed();
        sup.studybestmessage.isDisplayed();

        //Learn the basics

        sup.learnbasics.isDisplayed();
        sup.masterchaptercontents.isDisplayed();

        //Study for an exam
        sup.prepareconfidence.isDisplayed();
        sup.studyforexam.isDisplayed();

        //Practice what I learned
        sup.practicelearned.isDisplayed();
        sup.trainbrain.isDisplayed();

        //Im not sure
        sup.notsure.isDisplayed();
        sup.justgetstarted.isDisplayed();

        //Select the basics
        sup.learnbasics.click();

        //Validate messages change at bottom of app screen
        sup.smartmessage.isDisplayed();


        lp.submitting.click();

        //When do you study best page

        wait.until(ExpectedConditions.visibilityOf(sup.studybestpage)).isDisplayed();

        //validating all the text is displayed correctly
        sup.whenfocustimemessage.isDisplayed();
        sup.seewhenyoustudybestmessage.isDisplayed();

        //In the morning
        sup.inmorning.isDisplayed();
        sup.beforeschool.isDisplayed();

        //In the afternoon
        sup.inafternoon.isDisplayed();
        sup.duringbreak.isDisplayed();

        //In the evening
        sup.inevening.isDisplayed();
        sup.afterschool.isDisplayed();

        //Late night
        sup.latenight.isDisplayed();
        sup.beforebed.isDisplayed();

        //Selecting In the morning
        sup.inmorning.click();

        //Validating messages change
        sup.morningpersonmessage.isDisplayed();
        sup.buildplanmessage.isDisplayed();

        lp.submitting.click();

        //Wait for chapter page pop up message
        wait.until(ExpectedConditions.visibilityOf(sp.popupmessgecard)).isDisplayed();
        sp.okbutton.click();

        //Validate scroll down pop up
      sp.scrollpopup.isDisplayed();
      sp.okbutton.click();

      //Validate tap track
      sp.taptrackpop.isDisplayed();
      sp.okbutton.click();

      //Validate how far you come pop up message
      sp.howfarcomepop.isDisplayed();
      sp.okbutton.click();

      //Validate switch books
      sp.switchbookspop.isDisplayed();
      sp.getstartedpop.click();

      //Validate













    }






}
