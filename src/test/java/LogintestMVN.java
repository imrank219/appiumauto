import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.LoginPageMVN;
import pageObjects.StudyHomePage;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;

public class LogintestMVN extends BasicIOSTest3 {
    @Test
    public void Login() throws MalformedURLException, InterruptedException {

        AppiumDriver driver2 = IOSDesiredCapabilities3();

        //PageObjects
        LoginPageMVN lpmvn = new LoginPageMVN(driver2);
      //  StudyHomePage sp = new StudyHomePage(driver2);

        //   driver2.findElementByXPath("//XCUIElementTypeButton[@name=\"Sign In\"]").click();
        lpmvn.signin.click();
        //Verify your on the Sign in screen
        //XCUIElementTypeStaticText[@name="Sign in to your account"]
        //    driver2.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Sign in to your account\"]").isDisplayed();

        Thread.sleep(3000);

        //  driver2.shake();

        //   driver2.findElementByXPath("\t\n" +
        //          "//XCUIElementTypeButton[@name=\"Staging\"]").click();

        Thread.sleep(1000);

        //validating Error Messages no Email
        //  driver2.findElementByXPath("//XCUIElementTypeButton[@name=\"Play icon\"]").click();
        lpmvn.submitting.click();
        //   driver2.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Please enter a valid email address.\"]").isDisplayed();
        lpmvn.displayerroremail.isDisplayed();

        HashMap<String, String> args = new HashMap<>();
        args.put("action", "getButtons");
        List<String> buttons = (List<String>) driver2.executeScript("mobile: alert", args);

        String buttonLabel = null;
        for (String button : buttons) {
            if (button.equals("OK") || button.equals("Cancel")) {
                continue;
            }
            buttonLabel = button;
        }

        args.put("action", "accept");
        args.put("buttonLabel", buttonLabel);
        driver2.executeScript("mobile: alert", args);

        //  driver2.findElementByIosNsPredicate("value == \"Email\"").sendKeys("ikhan123@mailinato");
        // lp.email.sendKeys("ikhan123@mailinato");
        lpmvn.email.sendKeys("prodtester24@mailinato");

        //   driver2.findElementByXPath("//XCUIElementTypeButton[@name=\"Play icon\"]").click();
        lpmvn.submitting.click();

        //validate email is incorrect

        Thread.sleep(1000);

        //   driver2.findElementByIosNsPredicate("label == \"Please enter a valid email address.\"").isDisplayed();
        lpmvn.displayerroremail.isDisplayed();

        //Click on pop up message - ok

        driver2.executeScript("mobile: alert", args);

        //validate password message

        // driver2.findElementByIosNsPredicate("value == \"ikhan123@mailinato\"").sendKeys("r.com");
        lpmvn.emailbox2a.sendKeys("r.com");

        //  driver2.findElementByXPath("//XCUIElementTypeButton[@name=\"Play icon\"]").click();

        lpmvn.submitting.click();

        //Enter an invalid password

        //Validate pop up email error message

        // driver2.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Please enter a valid password at least 6 characters long.\"]").isDisplayed();
        lpmvn.passwordmessage.isDisplayed();

        //Click on pop up message - ok

        driver2.executeScript("mobile: alert", args);

        //Enter an invalid password

        //driver2.findElementByIosNsPredicate("value == \"Password\"").sendKeys("Test");
        lpmvn.password.sendKeys("Test");

        //Validate pop up error message

        // driver2.findElementByXPath("//XCUIElementTypeButton[@name=\"Play icon\"]").click();

        lpmvn.submitting.click();

        // driver2.findElementByIosNsPredicate("label == \"Please enter a valid password at least 6 characters long.\"").isDisplayed();

        lpmvn.passwordmessage.isDisplayed();

        //Clicking ok button pop up

        driver2.executeScript("mobile: alert", args);

        //Enter full valid password

        //driver2.findElementByIosNsPredicate("value == \"••••\"").sendKeys("Test12345");
        lpmvn.password.sendKeys("Test12345");


        // driver2.findElementByXPath("//XCUIElementTypeButton[@name=\"Play icon\"]").click();
        lpmvn.submitting.click();

        //  Thread.sleep(15000);
        //   WebElement chapter =  driver2.findElementByXPath("(//XCUIElementTypeStaticText[@name=\"Chapter 1\"])[2]");

        WebDriverWait wait = new WebDriverWait(driver2, 5000);

        //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeStaticText[@name=\"Chapter 1\"])[2]\"")));
        //  wait.until(ExpectedConditions.visibilityOf((WebElement) driver2.findElementsByXPath("(//XCUIElementTypeStaticText[@name=\"Chapter 1\"])[2]\"")));
        //    wait.until(ExpectedConditions.visibilityOf(MobileBy.ByIosClassChain("**/XCUIElementTypeButton[`label == 'Learn Nav Icon'`]"));

        //Validate you're on Chapter 1


        wait.until(ExpectedConditions.or(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeStaticText[@name='Chapter 1'])[2]")),
                ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeStaticText[@name=\"Tap a card to jump in, or swipe it to the back of deck for later\"])"))
        ));


    }


}
