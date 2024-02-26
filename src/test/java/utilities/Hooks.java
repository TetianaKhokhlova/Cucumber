package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    /*
    Cucumber has a feature that allows it automatically detect and run the methods annotTED WITH @BEFORE AND @AFTER they
    are running before and after each scenario
     */
    // we will create here to use different browser
    // if you wish you can create driver methods in this class
    // we should import from the io.cucumber.java

    @Before
    public void setUp(){
        //Set the browser type for the current thread
        ThreadSafeDriver.threadBrowserName.set(ConfigReader.getProperty("browser"));
        ThreadSafeDriver.getDriver();

    }
    @After
    public  void tearDown(){
        ThreadSafeDriver.quitDriver();
    }
}
