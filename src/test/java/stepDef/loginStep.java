package stepDef;

import base.BrowserSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.loginPage;

public class loginStep extends BrowserSetup {

    loginPage login = new loginPage(driver);

    @Given("I am at TalentTek Sign in page")
    public void iAmAtTalentTekSignInPage() {
        String exp = "Sign In"; // Product Owner -- Stake holders -- Business Anylst
        // Act come from dev team. QA team is the one who is dev code
        String act = driver.getTitle();
        System.out.println(act);
        Assert.assertEquals(act, exp);
    }
    @And("I enter valid email address")
    public void iEnterValidEmailAddress() {
        login.enterEmailAddress(Hook.email);
    }
    @And("I enter valid password")
    public void iEnterValidPassword() {
        login.enterPassword(Hook.password);
    }
    @When("I click on login button")
    public void iClickOnLoginButton() {
        login.loginButtonClick();
    }
    @And("I click Create New Account button in login page")
    public void iClickCreateNewAccountButtonInLoginPage() {
        login.clickCreateNewAccountBtn();
    }
}
 // When create choose Java option instead of java 8 ( java 8 has error)
// Login.feature  Page > Command + Mouse hover over + Click > you are in this page