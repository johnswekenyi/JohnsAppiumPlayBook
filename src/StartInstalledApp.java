import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Run an app installed on phone without using apk
 */
public class StartInstalledApp extends BaseClass{
    AndroidDriver driver;
    public StartInstalledApp() throws MalformedURLException {
        File appDir = new File("src");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability( MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy J5 Prime");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"25");
        //App package name
        cap.setCapability(MobileCapabilityType.APP_PACKAGE,"com.selfcare.safaricom");
        //App activity name to launch. App has different activities.
        cap.setCapability(MobileCapabilityType.APP_ACTIVITY,"com.mventus.selfcare.safaricom.HomeActivity");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        this.driver = Capabilities();
    }

    private AndroidDriver Capabilities() {
        return driver;
    }
}
