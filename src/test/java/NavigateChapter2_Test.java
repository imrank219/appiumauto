import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.Chapter1VideoPage;
import pageObjects.LoginPage;
import pageObjects.SetUpStudyPage;
import pageObjects.StudyHomePage;

import java.net.MalformedURLException;
import java.util.HashMap;

public class NavigateChapter2_Test extends BasicIOSTest{
    @Test
    public void Login() throws MalformedURLException, InterruptedException {

        IOSDriver driver2 = IOSDesiredCapabilities();

        //PageObjects
        LoginPage lp = new LoginPage(driver2);
        StudyHomePage sp = new StudyHomePage(driver2);
        SetUpStudyPage sup = new SetUpStudyPage(driver2);
        Chapter1VideoPage c1vp = new Chapter1VideoPage(driver2);

        lp.signin.click();

        Thread.sleep(3000);
        lp.email.sendKeys("prodtester42@mailinator.com");

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


        JavascriptExecutor js = (JavascriptExecutor) driver2;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "down");
        scrollObject.put("xpath", "(//XCUIElementTypeStaticText[@name=\"12 min\"])[2]");
        js.executeScript("mobile: scroll", scrollObject);



        //    JavascriptExecutor js = (JavascriptExecutor) driver2;
        //    HashMap<String, String> swipeObject = new HashMap<String, String>();
        //    swipeObject.put("direction", "up"); //up for swipe
        //    swipeObject.put("startX", "80");
        //   swipeObject.put("startY", "200");
        //  swipeObject.put("name", "Chapter 1");
        //    swipeObject.put("endX", "80"); //"90");
        //   swipeObject.put("endY", "250"); //"200");
        //   swipeObject.put("duration", "1000");
        //   js.executeScript("mobile: scroll", swipeObject);

  //      scrollObject.put("direction", "up");
  //      scrollObject.put("xpath", "(//XCUIElementTypeStaticText[@name=\"Limits, Alternatives, and Choices\"])[6]");
   //     js.executeScript("mobile: scroll", scrollObject);
        //(//XCUIElementTypeStaticText[@name="Chapter 1"])[1]

       // (//XCUIElementTypeStaticText[@name="Limits, Alternatives, and Choices"])[6]

       // (//XCUIElementTypeStaticText[@name="Chapter 2"])[1]

        //(//XCUIElementTypeStaticText[@name=" "])[1]


       // (//XCUIElementTypeStaticText[@name="Limits, Alternatives, and Choices"])[5]

        //(//XCUIElementTypeStaticText[@name="12 min"])[2]












    }






}
