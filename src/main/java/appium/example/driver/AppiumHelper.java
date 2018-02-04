package appium.example.driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by suci on 01/02/2018.
 */
public class AppiumHelper {

    private static DesiredCapabilities capabilities;
    private static AndroidDriver driver;

    public static AndroidDriver loadDriver() throws MalformedURLException {
        setCapabilities();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        return driver;
    }

    public static void setCapabilities(){
        File app = new File(System.getProperty("user.dir") + "/" + System.getProperty("apkPath"));
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformAndroid","Android");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage","com.naspers_classifieds.loginsample");
        capabilities.setCapability("appActivity","com.naspers_classifieds.loginsample.MainActivity");
        capabilities.setCapability("deviceName", "Galaxy");
    }
}
