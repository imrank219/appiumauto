import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.SetUpStudyPage;
import pageObjects.StudyHomePage;

import java.io.*;
import java.util.Random;

public class RegisterNewUser extends BasicIOSTest2 {
    @Test
    public void NewUserFlow() throws IOException, InterruptedException {

        // IOSDriver driver2 = IOSDesiredCapabilities();
        WebDriver driver = initializeDriver();

       //   driver.navigate.("https://myebooks.mheducation.com/registration");
        //  driver.navigate().to();


        Random rn = new Random();
        int answer = rn.nextInt(1000) + 1;

        String emailAddress = "prodtester" + answer + "@mailinator.com";


        String TestFile = "/Users/imrankhan/Desktop/AppiumImran/src/test/java/Resources/UserName.txt";
        File FC = new File(TestFile);//Created object of java File class.
        FC.createNewFile();//Create file.

        //Writing In to file.
        //Create Object of java FileWriter and BufferedWriter class.
        FileWriter FW = new FileWriter(TestFile);
        BufferedWriter BW = new BufferedWriter(FW);
        BW.write(emailAddress); //Writing In To File.
        BW.close();

        //Reading from file.
        //Create Object of java FileReader and BufferedReader class.
        FileReader FR = new FileReader(TestFile);
        BufferedReader BR = new BufferedReader(FR);
        String Content = "";

        Content = BR.readLine();

        driver.navigate().to("https://myebooks.mheducation.com/registration");
        //  driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys(Content);
        //     Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("Test12345");

        driver.findElement(By.xpath("//*[@id='confirmPasswd']")).sendKeys("Test12345");

        driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Tony ");

        driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Tester ");

        driver.findElement(By.xpath("//*[@id=\"securityQuestions\"]/option[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"securityAnswer\"]")).sendKeys("Test");

        driver.findElement(By.xpath("//*[@id='schoolSearchInput']")).sendKeys("Yale Univeristy");

        driver.findElement(By.xpath("//*[@id=\"result-item-0\"]/div[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"agree-terms\"]")).click();
        Thread.sleep(2000);

        WebElement button = driver.findElement(By.id("ca-submit-btn")); // locate the button
        Actions action = new Actions(driver);
        Thread.sleep(3000);

        action.moveToElement(button).click().perform();

        if (driver.findElement(By.xpath("//*[@formcontrolname='email']")).isDisplayed()) {

            driver.findElement(By.xpath("//*[@formcontrolname='email']")).clear();
            Thread.sleep(4000);

            driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys(Content);
            Thread.sleep(4000);

            // WebElement button = driver.findElement(By.id("ca-submit-btn")); // locate the button
            // Actions action = new Actions(driver);
            action.moveToElement(button).click().perform();

            System.out.print(Content);
        } else {

        }

        //Login into the application

        IOSDriver driver2 = IOSDesiredCapabilities();


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

        driver.quit();
        driver2.quit();


    }




}







