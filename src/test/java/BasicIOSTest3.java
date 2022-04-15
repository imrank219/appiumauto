import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasicIOSTest3 {

    //public static void main(String []args) throws MalformedURLException {
    public static AppiumDriver IOSDesiredCapabilities3() throws MalformedURLException {

        DesiredCapabilities cap2 = new DesiredCapabilities();
        cap2.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.2");
        cap2.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro");
        cap2.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        //IOS_XCUI_Test  Apple
        cap2.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        cap2.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 500000);
        cap2.setCapability("commandTimeouts", "12000");

        //.app
       // cap2.setCapability(MobileCapabilityType.APP, "/Users/imrankhan/Desktop/UIKitCatalog.app");
        cap2.setCapability(MobileCapabilityType.APP, "/Users/imrankhan/Desktop/Redi.app");
        AppiumDriver driver2 = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap2);
    //    IOSDriver<WebElement> driver2 = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap2);

        //http://127.0.0.1:4723/wd/hub
        //http://locallhost:4723/wd/hub

        return driver2;



    }

    public static WebDriver driver;
    public WebDriverWait webDriverWait;
   // public Properties prop;
    public static WebDriver initializeDriver() throws IOException {

     //   prop = new Properties();
     //   FileInputStream fis=new FileInputStream("D:\\Users\\IKhan\\.jenkins\\testauto\\src\\main\\java\\resources\\data.properties");
    //    prop.load(fis);
    //    String browserName = prop.getProperty("browser");


            //System.setProperty("webdriver.chrome.driver", "D:\\Selenium_files\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", "/Users/imrankhan/Desktop/chromedriver");
            driver = new ChromeDriver();




        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
