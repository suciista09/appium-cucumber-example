package appium.example.steps;

import appium.example.driver.AppiumHelper;
import appium.example.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

/**
 * Created by suci on 01/02/2018.
 */
public class LoginSteps {

    private LoginPage loginPage;
    private AndroidDriver driver;

    @Given("^I go to login page$")
    public void iGoToLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I type email: \"([^\"]*)\"$")
    public void iTypeEmail(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.typeEmail(email);
    }

    @And("^I type password: \"([^\"]*)\"$")
    public void iTypePassword(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.typePassword(password);
    }

    @And("^click login button$")
    public void clickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickLoginButton();
    }

    @Given("^I open Login page$")
    public void iOpenLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = AppiumHelper.loadDriver();
        loginPage = new LoginPage(driver);
    }

    @Then("^I successfully logged in$")
    public void iSuccessfullyLoggedIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.verifyLoginSuccess();
        driver.quit();
    }
}
