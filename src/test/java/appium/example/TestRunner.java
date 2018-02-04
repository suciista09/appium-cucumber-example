package appium.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by suci on 01/02/2018.
 */

@RunWith(Cucumber.class)

@CucumberOptions(
        strict = false,
        features={"classpath:features"},
        glue={"classpath:appium/example/steps/"},
        format = { "pretty","html:target/reports/cucumber-reports","json:target/cucumber.json" }
        //,tags = { "~@ignore","@detailtest" }
)
public class TestRunner {
}
