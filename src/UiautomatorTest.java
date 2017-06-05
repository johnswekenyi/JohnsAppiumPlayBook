import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class UiautomatorTest extends BaseClass{

    AndroidDriver driver;

    public UiautomatorTest() throws MalformedURLException {
        driver = Capabilities();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );

        //Locate element using androidUIAutomator
        //syntax  driver.findElementByAndroidUIAutomator("attribute(\"value\")")
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();

        //Validate clickable features for all options , syntax
        //driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
    }

    private AndroidDriver Capabilities() {
        return driver;
    }
}