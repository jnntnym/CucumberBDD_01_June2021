package stepDef;

import base.BrowserSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BrowserSetup {

    public static String env = System.getProperty("env");
    public static String driverName = System.getProperty("browser");
    public static String url;

    @Before
    public void startTest(){
        // happen before each test scenario
    }

    @After
    public void endTest(){
        // happen after each test
        // what happen if test fails? what you will do for the  failing test case? screenshot? logs? ??
    }
}