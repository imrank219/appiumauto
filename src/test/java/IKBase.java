import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class IKBase {


   // public static void main (String args) throws MalformedURLException {

   // @Test
  //  public void SetUp() throws MalformedURLException{

            public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException{

        AndroidDriver<AndroidElement> driver;

        DesiredCapabilities caps = new DesiredCapabilities();

        File appDir = new File("src");
        File app = new File(appDir, "ApiDemos-debug.apk");

        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "imranandroid");

        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step

        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        driver =new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

        return driver;

    }
}
