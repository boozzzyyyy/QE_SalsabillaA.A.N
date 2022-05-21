package test.alta.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverPool {

    public static AndroidDriver create() {

        AndroidDriver<AndroidElement> driver = null;
        DesiredCapabilities caps = new DesiredCapabilities();

        String appiumUrl = "http://localhost:4723/wd/hub";

        caps.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        caps.setCapability(MobileCapabilityType.NO_RESET, true);
        caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + File.separator + "app/alta-online-shop.apk");

        try {
            driver = new AndroidDriver<AndroidElement>(new URL(appiumUrl), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }
}
