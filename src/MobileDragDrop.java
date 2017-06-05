import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class MobileDragDrop extends BaseClass {
    AndroidDriver driver;

    public MobileDragDrop() throws MalformedURLException {
        driver = Capabilities();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        //Click views
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        //Click on Drag and Drop
        driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
        TouchAction t = new TouchAction(driver);
        //Long press on a dot to start a drag, then drop over another dot. The destination dot will append the drag's
        // textual conversion to the EditText.
        t.longPress(driver.findElementsByClassName("android.view.View").get(0)).moveTo(driver.findElementsByClassName
                ("android.view.View").get(2)).release().perform();
    }

    private AndroidDriver Capabilities() {
        return driver;
    }
}