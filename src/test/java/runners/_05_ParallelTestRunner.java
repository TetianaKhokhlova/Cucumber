package runners;


import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.ConfigReader;
import utilities.ThreadSafeDriver;

@CucumberOptions(
        features = {"src/test/java/features"}, //path of features packages
        glue = {"stepdefinations"},
        tags = "@ParallelTest",
       plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter"}
)
public class _05_ParallelTestRunner extends AbstractTestNGCucumberTests {
   @BeforeClass
    @Parameters("browserType")

    public  void setUpClass(String browserName){
        ThreadSafeDriver.threadBrowserName.set(browserName);
    }
    /*
    @AfterClass
    public void writeExtentReport(){
        ExtentService.getInstance().setSystemInfo("Windows User Name", System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("Tester Name", "Tetiana");
    }
*/
}
