package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/_01_Login.feature",
        glue = "stepdefinations",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class _01_TestRunner extends AbstractTestNGCucumberTests {

}
