package pageObject;

import base.BrowserSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class profilePage extends BrowserSetup {
    // rule for PageObject is -- create a PageFactory for every single page that you going to create
    // how?
    public profilePage (WebDriver driver){
        PageFactory.initElements(driver, this);
        BrowserSetup.driver = driver;
    }

    // locators
    @FindBy(how= How.XPATH, using = "//*[@id='profile_form']/legend")
    public WebElement actualWelcomeMessage;

    // Function
    public void getActualwelcomeMessage (){
     //   String expectedMessage = "Welcome to TalentTek";
        // String actualMessage = actualWelcomeMessage.getText();
      //  System.out.println(actualMessage);
       // Assert.assertEquals(actualMessage, expectedMessage);
        Assert.assertEquals(actualWelcomeMessage.getText(), "Welcome to TalentTek");

    }
}

