package steps;

import Pages.forget_password;
import TestCases.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ForgetPassword extends BaseTest {
    forget_password fp;
    @When("I click on the forget password link")
    public void iClickOnTheForgetPasswordLink() {
        fp.click_on_forget_pass(driver);
    }
    @Then("The Forget password page is displayed")
    public void theForgetPasswordPageIsDisplayed() {
        Assert.assertEquals(fp.expected_result_forget(driver),"Reset Password");
    }


}
