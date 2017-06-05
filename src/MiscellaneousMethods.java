import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class MiscellaneousMethods extends BaseClass {
    AndroidDriver driver;

    public MiscellaneousMethods() throws MalformedURLException {
        driver = Capabilities();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        //FInd current activity and print it out
        System.out.println(driver.currentActivity());
        //Mobile views, Native,Hybrid nd webview The methos below is to show which mode you are in
        System.out.println(driver.getContext());
        //Check current orientation of the app
        System.out.println(driver.getOrientation());
        //Check if mobile is locked or not. If locked it returns true else false
        System.out.println(driver.isLocked());
        //Hide keyboard after sending keys
        driver.hideKeyboard();
        //Click views
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        //Click mobile phone back button
        //driver.pressKeyCode(AndroidKeyCode.BACK);
        //Click on home button
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
//        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    private AndroidDriver Capabilities() {
        return driver;
    }
}