import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Point;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Raaga extends BaseClass{
    AndroidDriver driver;
    public Raaga() throws MalformedURLException {
        driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text=Done]").click();
        driver.findElementById("com.raaga.android:id/landing_skip_to_raaga").click();
        //Click Got it button
        driver.findElementById("com.raaga.android:id/gotit_btn").click();
        //driver.findElementByXPath("//android.widget.TextView[@text=World Music]").click();
        driver.findElementByAndroidUIAutomator("new Uiscrollable(new UiSelector()).scrollIntoView(text(\"World " +
                "Music\"))");
        driver.findElementByXPath("//android.widget.TextView[@text=World Music]").click();
        driver.findElementByAndroidUIAutomator("new Uiscrollable(new UiSelector()).scrollIntoView(resourceId(\"com" +
                ".raaga.android:id/music_home_raaga_live\"))");
        driver.findElementById("com.raaga.android:id/music_home_raaga_live").click();
        //Click to open settings
        driver.findElementById("com.raaga.android:id/toolbar_logo").click();
        //After menu opens Select Settings
        driver.findElementByXPath("//android.widget.TextView[@text=Settings]").click();
        //Select Push notifications
        driver.findElementByXPath("//android.widget.TextView[@text=Push Notification]").click();
        //Toggole buttons on/off. Touch action tapping. Turn on Music Recommendations
        Point pointRecommendOn = driver.findElementById("com.raaga.android:id/toggle_notifyrecommend").getLocation();
        //start at 0,0
        TouchAction t = new TouchAction(driver);
        //Move along the x axis 20 and y 30 to toggle recommended notifications on
        t.tap(pointRecommendOn.x+20,pointRecommendOn.y+30).perform();
        //Turn on Someone favorites my playlist
        Point pointPlaylist = driver.findElementById("com.raaga.android:id/com.raaga" +
                ".android:id/toggle_notiftmyplaylist").getLocation();
        t.tap(pointPlaylist.x+20,pointPlaylist.y+30).perform();
        //Turn on Someone Follow me
        Point pointFollow = driver.findElementById("com.raaga.android:id/com.raaga.android:id/toggle_notifyfollowme")
                .getLocation();
        t.tap(pointFollow.x+20,pointFollow.y+30).perform();
        //Turn off Music Recommendations
        Point pointRecommendOff = driver.findElementById("com.raaga.android:id/toggle_notifyrecommend").getLocation();
        //Move along the x axis 100 and y 30 to toggle recommended notifications on
        t.tap(pointRecommendOff.x+100,pointRecommendOff.y+30).perform();
        //Turn Off Someone favorites my playlist
        Point pointPlaylistOff = driver.findElementById("com.raaga.android:id/com.raaga" +
                ".android:id/toggle_notiftmyplaylist").getLocation();
        t.tap(pointPlaylistOff.x+100,pointPlaylistOff.y+30).perform();
        //Turn Off Someone Follow me
        Point pointFollowOff = driver.findElementById("com.raaga.android:id/com.raaga.android:id/toggle_notifyfollowme")
                .getLocation();
        t.tap(pointFollowOff.x+100,pointFollowOff.y+30).perform();
    }
    private AndroidDriver Capabilities() {
        return driver;
    }
}
