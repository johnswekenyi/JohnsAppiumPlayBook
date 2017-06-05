import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class RaagaSignIn extends BaseClass{
    AndroidDriver driver;
    public RaagaSignIn() throws MalformedURLException {
        driver = Capabilities();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        driver.findElementByXPath( "//android.widget.TextView[@text=Done]" ).click();
        //Tap on Sign In
        driver.findElementById("com.raaga.android:id/landing_signin_btn").click();
        driver.findElementById("com.raaga.android:id/signin_email").sendKeys("myemail@email.com");
        driver.findElementById("com.raaga.android:id/signin_password").sendKeys("Password");
        driver.findElementById("com.raaga.android:id/show_password").click();
        driver.findElementById("com.raaga.android:id/signin_submit_btn").click();
    }
    private AndroidDriver Capabilities(){
        return driver;
    }
}
