import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BasicsTestClass extends BaseClass {

    AndroidDriver driver = Capabilities();

    private AndroidDriver Capabilities() {
        return driver;
    }

    public BasicsTestClass() throws MalformedURLException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Open Preferences
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();

        //Open Preference dependencies
        driver.findElementByXPath("//android.widget.TextView[@text='Preference dependencies']").click();

        //Select checkbox
        driver.findElementById("android:id/checkbox").click();

        //Click WIFI settings android.widget.RelativeLayout[@] click on second one since both are same
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();

        //Add text into the Wifi field
        driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");

        //Click Ok button. Here we get all the elements identified by the class name and click the one we want. We
        // use index from 0,1,2....
        driver.findElementsByClassName("android.widget.Button").get(1).click();
    }
}
