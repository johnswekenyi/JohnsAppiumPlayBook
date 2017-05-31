import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class SwipeDemo extends BaseClass {
    AndroidDriver driver = Capabilities();

    public SwipeDemo() throws MalformedURLException {
        TouchAction t = new TouchAction(driver);
        //Click views
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        //Select Date widgets
        driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
        //Select Inline menu
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        //Select 9. * means pick everything in the attribute value
        driver.findElementByXPath("//*[content-desc='9']").click();
        //Hold on 15 for 2 secs, move it to 45 then release
        t.press(driver.findElementByXPath("//*[content-desc='15']")).waitAction(2000).moveTo(driver
                .findElementByXPath("//*[content-desc='45']")).release().perform();
    }
}