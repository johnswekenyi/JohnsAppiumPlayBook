import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class MobileScrolling extends BaseClass {
    AndroidDriver driver;

    public MobileScrolling() throws MalformedURLException {
        driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Scroll on real device
        Dimension size = driver.manage().window().getSize();
        int x = size.getWidth()/2;
        int starty = (int) (size.getHeight()* 0.60);
        int endy = (int) (size.getHeight()* 0.10);
        driver.swipe(x,starty,x,endy,2000);
        //Click views
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        //scroll down and select  WebView text
        driver.findElementByAndroidUIAutomator("new Uiscrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
    }

    private AndroidDriver Capabilities() {
        return driver;
    }
}
