import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static sun.audio.AudioDevice.device;

public class BaseClass {

    @SuppressWarnings("rawtypes")
    public static AndroidDriver driver;

    public static void main (String[] args) throws MalformedURLException {
        File f = new File("src");
        File fs = new File(f, "ApiDemos-debug.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        //Execute using either emulator or real device depending on which one is connected at the time of execution.
        if (device.equals("emulator")){
            cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
        }
        else if (device.equals("real")){
            cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
        }
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        //return driver;
    }
}

