package pageObject;

import base.BrowserSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class signupPage extends BrowserSetup {
    public signupPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        BrowserSetup.driver = driver;
    }
}
