package stepDef;

import base.BrowserSetup;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.signupPage;

public class signupStep extends BrowserSetup {

    signupPage sgnUp = new signupPage(driver);
    Faker faker = new Faker();

    // Calling all methods from pageObject>signupPage
    @And("I enter valid student information")
    public void iEnterValidStudentInformation() {
        sgnUp.enterFirstName(faker.name().firstName());
        sgnUp.enterLastName(faker.name().lastName());
        sgnUp.enterEmail(faker.internet().safeEmailAddress());
        // Password
        sgnUp.enterPassword("test@12345");
        sgnUp.enterConfirmPassword("test@12345");
        // Birth Date
        sgnUp.enterBirthMonth("Dec");
        sgnUp.enterBirthDay(15);
        sgnUp.enterBirthYear("1984");
        // when Gender is male
        // sgnUp.genderMale();
        sgnUp.genderChoice();   // Conditional male click
    }
    // Agree check box click
    @And("I agree with terms")
    public void iAgreeWithTerms() {
        sgnUp.agreeClickBox();
    }
    //click on Create My Account button
    @When("I click on Create My Account button")
    public void iClickOnCreateMyAccountButton() {
        sgnUp.clickCreateMyAccountBtn();
    }
    // See thank You For SignUp Message
    @Then("I should see Thank you for sign up message")
    public void iShouldSeeThankYouForSignUpMessage() {
        sgnUp.getThankYouMessage();
    }
}
