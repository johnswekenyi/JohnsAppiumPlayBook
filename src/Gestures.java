import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class Gestures extends BaseClass {

    AndroidDriver driver;

    public Gestures() throws MalformedURLException {
        //Click views
        driver = Capabilities();
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

        //Tap on an element in mobile apps open expandable list. TouchAction works with one action while touchactions
        // works with multiple actions to perform
        TouchAction t = new TouchAction(driver);
        t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();

        //Click on 1. Custom Adapter
        driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();

        //Long press people names. Always remember to end with.perform() action.
        t.press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction(3000)
                .release().perform();
        //validate the text on the pop up and print in console
        System.out.println(driver.findElementById("android:id/alertTitle").getText());
    }

    private AndroidDriver Capabilities() {
        return driver;
    }
}
