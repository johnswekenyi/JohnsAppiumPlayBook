import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class MobileScrolling extends BaseClass {
    AndroidDriver driver = Capabilities();

    public MobileScrolling() throws MalformedURLException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Click views
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        //scroll down and select  WebView text
        driver.findElementByAndroidUIAutomator("new Uiscrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
    }
}
