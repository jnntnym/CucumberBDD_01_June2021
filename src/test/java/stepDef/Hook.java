package stepDef;

import base.BrowserSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends BrowserSetup {

    public static String envData = System.getProperty("env");
    public static String driverType = System.getProperty("browser");
    public static String url;
    public static String email;
    public static String password;

    @Before
    public void startTest(){
        // happen before each test scenario
        // setup default browser
        if (Strings.isNullOrEmpty(driverType)){
            driverType="ch";
        }
        // default environment setup
        if(Strings.isNullOrEmpty(envData)){
            envData = "stg";
        }

        // Choose the driverType and envData
        driver = setupBrowser(driverType);
        switch (envData){
            case "qa":
                url = "http://qa.taltektc.com";
                email = "qatest@gmail.com";
                password = "Test12345";
                break;
            case "stg":
                url = "http://stage.taltektc.com";
                email = "stgtest@hotmail.com";
                password = "Test543";
                break;
            case "prd": //  ????
                url = "http://prod.taltektc.com";
                break;
        }
        driver.get(url);
    }

    @After
    public void endTest(){
        driver.quit();
        // happen after each test
        // what happen if test fails? what you will do for the  failing test case? screenshot? logs? ??
    }
}