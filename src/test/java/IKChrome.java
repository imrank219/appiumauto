import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.*;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class IKChrome {


    // public static void main (String args) throws MalformedURLException {

    @Test
    public void SetUpC() throws MalformedURLException {

        AndroidDriver<AndroidElement> driver;
        WebDriver driverweb;
        DesiredCapabilities caps = new DesiredCapabilities();

      //  File appDir = new File("src");
     //   File app = new File(appDir, "ApiDemos-debug.apk");

        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "imranandroid");

        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step

        caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        caps.setCapability(CapabilityType.VERSION, "11");


     //   caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        driver =new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
       // driverweb = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.get("https://www.amazon.com");
    }




}
