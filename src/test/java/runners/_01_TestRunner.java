package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



    @CucumberOptions(
            features = {"src/test/java/features/",
                    "src/test/java/features/_02_CreateCountry.feature"},

            glue = {"stepdefinitions", "anotherPackegeIfNecassary"}
    )
    public class _01_TestRunner extends AbstractTestNGCucumberTests{


}
