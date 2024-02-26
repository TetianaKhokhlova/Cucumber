package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.ReusableMethods;
import utilities.ThreadSafeDriver;

public class _01_LoginStep {
    LoginPage loginPage = new LoginPage();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        ThreadSafeDriver.getDriver().get("https://test.mersys.io/");
    }
    @When("Enter username and password in the text boxes")
    public void enter_username_and_password_in_the_text_boxes() {
        ReusableMethods.wait(1);
        loginPage.sendKeys(loginPage.userNameTextBox,"turkeyts");
        ReusableMethods.wait(1);
        loginPage.sendKeys(loginPage.passwordTextBox, "TechnoStudy123");
    }
    @When("Click on the Login button")
    public void click_on_the_login_button() {
        ReusableMethods.wait(1);
        loginPage.clickElement(loginPage.loginButton);


    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println(" ");

    }

}
