package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepdefinations"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@SmokeTest"
)
public class _02_SmokeTestRunner extends AbstractTestNGCucumberTests {

}
