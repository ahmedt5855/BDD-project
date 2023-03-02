package steps;

import Pages.Login_Page;
import Pages.OrangeHomePage;
import TestCases.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Login extends BaseTest {
    Login_Page loginObject;
    OrangeHomePage orangeObject;
    @Given("the user in the Login page")
    public void the_user_in_the_login_page() {
        // Write code here that turns the phrase above into concrete actions

    }

@When("I entered {string} ,{string}")
public void i_entered(String username, String password) {
    // Write code here that turns the phrase above into concrete actions
    loginObject = new Login_Page();
        loginObject.setTextElement(loginObject.usertxt,username, driver);
        loginObject.setTextElement(loginObject.passtxt,password, driver);
        loginObject.click_button(loginObject.loginbtn, driver);

}
    @Then("The Home page is displayed")
    public void the_home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions

        orangeObject = new OrangeHomePage( driver);
        Assert.assertEquals( driver.findElement(orangeObject.Dashboard).getText(),"Dashboard");
    }
    @Then("I logout from the page")
    public void logoutFromtheHomepage()
    {
        orangeObject.logout(driver);
    }

}
