import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BasicsTestClass extends BaseClass {

    AndroidDriver driver = Capabilities();

    public BasicsTestClass() throws MalformedURLException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Open Preferences
        driver.findElementsByXPath("//android.widget.TextView[@text='Preference']").click();

        //Open Preference dependencies
        driver.findElementsByXPath("//android.widget.TextView[@text='Preference dependencies']").click();

        //Select checkbox
        driver.findElementById("android:id/checkbox").click();

        //Click WIFI settings android.widget.RelativeLayout[@] click on second one since both are same
        driver.findElementsByXPath("(//android.widget.RelativeLayout)[2]").click();

    }
}
