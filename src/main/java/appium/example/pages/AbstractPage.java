package appium.example.pages;

import appium.example.driver.AppiumHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by suci on 01/02/2018.
 */
public abstract class AbstractPage  {
    protected AppiumDriver driver;

    public AbstractPage(AppiumDriver driver){
        this.driver = driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
