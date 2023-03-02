package steps;

import Pages.Login_Page;
import Pages.OrangeHomePage;
import TestCases.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class invalidLogin extends BaseTest {
    Login_Page loginObject;
    OrangeHomePage orangeObject;
    @Given("the user in the Login page invalid")
    public void the_user_in_the_login_page() {
        // Write code here that turns the phrase above into concrete actions

    }

@When("I entered invalid {string} ,{string}")
public void i_entered(String Username, String Password) {
    // Write code here that turns the phrase above into concrete actions
    loginObject = new Login_Page();
        loginObject.setTextElement(loginObject.usertxt,Username, driver);
        loginObject.setTextElement(loginObject.passtxt,Password, driver);
        loginObject.click_button(loginObject.loginbtn, driver);
   
}
    @Then("Error is Displayed")
    public void the_home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions

        orangeObject = new OrangeHomePage( driver);
        Assert.assertEquals( loginObject.Required_valid(driver),"Invalid credentials");
    }

}
