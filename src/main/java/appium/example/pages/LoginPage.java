package appium.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;

/**
 * Created by suci on 01/02/2018.
 */
public class LoginPage extends AbstractPage {

    @AndroidFindBy(id="com.naspers_classifieds.loginsample:id/username")
    private AndroidElement email;

    @AndroidFindBy(id="com.naspers_classifieds.loginsample:id/password")
    private AndroidElement password;

    @AndroidFindBy(id="com.naspers_classifieds.loginsample:id/login")
    private AndroidElement loginButton;

    @AndroidFindBy(id="com.naspers_classifieds.loginsample:id/message")
    private AndroidElement messageText;

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    public void typeEmail(String email){
        this.email.sendKeys(email);
    }

    public void typePassword(String password){
        this.password.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void verifyLoginSuccess(){
        Assert.assertEquals("Login Failed!","Success!", messageText.getText());

    }
}
