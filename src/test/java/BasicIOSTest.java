import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BasicIOSTest {

    //public static void main(String []args) throws MalformedURLException {
    public static IOSDriver IOSDesiredCapabilities() throws MalformedURLException {

        DesiredCapabilities cap2 = new DesiredCapabilities();
        cap2.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.2");
        cap2.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro");
        //IOS_XCUI_Test  Apple
        cap2.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        cap2.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 500000);
        cap2.setCapability("commandTimeouts", "12000");

        //.app
       // cap2.setCapability(MobileCapabilityType.APP, "/Users/imrankhan/Desktop/UIKitCatalog.app");
        cap2.setCapability(MobileCapabilityType.APP, "/Users/imrankhan/Desktop/Redi.app");
        IOSDriver driver2 = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap2);
    //    IOSDriver<WebElement> driver2 = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap2);

        //http://127.0.0.1:4723/wd/hub
        //http://locallhost:4723/wd/hub

        return driver2;



    }
}
