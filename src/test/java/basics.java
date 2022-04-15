import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class basics extends IKBase{
@Test
   public void Navigate() throws MalformedURLException{

      AndroidDriver<AndroidElement> driver=capabilities();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Preference\"]").click();


    }
}
