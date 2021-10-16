package stepDef;

import base.BrowserSetup;
import io.cucumber.java.en.Then;
import pageObject.profilePage;

public class profilePageStep extends BrowserSetup {
    profilePage pf = new profilePage(driver);

    @Then("I should be able to successfully login")
    public void iShouldBeAbleToSuccessfullyLogin() {
        pf.getActualwelcomeMessage();
    }
}

// When create choose Java option instead of java 8 ( java 8 has error)
// Login.feature  Page > Command + Mouse hover over + Click > you are in this page
