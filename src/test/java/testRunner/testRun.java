package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Intilij\\Selenium_Cucumber\\Features\\HRMlogo.feature",
                     glue = "stepDefination")
public class testRun {
}
