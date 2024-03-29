package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SetUpPage;
import utilities.ReusableMethods;

public class _03_CitizenshipCreateStep {

    SetUpPage setUpPage = new SetUpPage();

    @When("I click the Citizenship button")
    public void i_click_the_citizenship_button() {
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.citizenshipButton);
    }


    @When("I click add the citizenship icon")
    public void i_click_add_the_citizenship_icon() {
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.citizenshipAddingIcon);

    }


    @When("I enter {string} in the name text box")
    public void i_enter_in_the_name_text_box(String name) {
        ReusableMethods.wait(1);
        setUpPage.sendKeys(setUpPage.citizenNameTextBox, name);
    }

    @When("I enter {string} in the shortname text box")
    public void i_enter_in_the_shortname_text_box(String shortname) {
        ReusableMethods.wait(1);
        setUpPage.sendKeys(setUpPage.citizenshortNameTextBox, shortname);
    }
    @When("I click on the save button")
    public void i_click_on_the_save_button() {
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.addingCitizenSaveButton);

    }


    @Then("I should see the {string} message")
    public void i_should_see_the_message(String message) {
        ReusableMethods.wait(1);
        Assert.assertEquals(setUpPage.addingCitizenSuccessfullyMessage.getText(), message);

    }

    @And("I enter name {string} in the name text box")
    public void iEnterNameInTheNameTextBox(String name) {
        ReusableMethods.wait(1);
        setUpPage.sendKeys(setUpPage.citizenNameTextBox, name);
    }




    @And("I enter shortname {string} in the shortname text box")
    public void iEnterShortnameInTheShortnameTextBox(String shortname) {
        ReusableMethods.wait(1);
        setUpPage.sendKeys(setUpPage.citizenshortNameTextBox, shortname);
    }

    @Then("I should see the warning {string} message")
    public void iShouldSeeTheWarningMessage(String message) {
        ReusableMethods.wait(1);
        Assert.assertEquals(setUpPage.addingCitizenSuccessfullyMessage.getText(), message);
    }


    @And("I enter citizen {string} in the name text box")
    public void iEnterCitizenInTheNameTextBox(String name) {
        ReusableMethods.wait(2);
        setUpPage.sendKeys(setUpPage.citizenNameTextBox, name);
    }

    @And("I enter citizen short name {string} in the shortname text box")
    public void iEnterCitizenShortNameInTheShortnameTextBox(String short_name) {
        ReusableMethods.wait(2);
        setUpPage.sendKeys(setUpPage.citizenshortNameTextBox, short_name);
    }

    @Then("I should see the successfully message {string}")
    public void iShouldSeeTheSuccessfullyMessage(String message) {
        ReusableMethods.wait(1);
        Assert.assertEquals(setUpPage.addingCitizenSuccessfullyMessage.getText(), message);
    }

    @And("I enter {string} in the search citizen text box")
    public void iEnterInTheSearchCitizenTextBox(String name) {
        ReusableMethods.wait(1);
        setUpPage.sendKeys(setUpPage.citizenNameSearchTextBox, name);
    }

    @And("I click on the search citizen button")
    public void iClickOnTheSearchCitizenButton() {
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.citizenNameSearchButton);
    }

    @And("I click on the delete citizen button")
    public void iClickOnTheDeleteCitizenButton() {
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.citizenNameDeleteButton);
    }

    @And("I click on the confirm delete citizen button")
    public void iClickOnTheConfirmDeleteCitizenButton() {
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.citizenNameConfirmDeleteButton);
    }

    @And("I should see the deleted {string}")
    public void iShouldSeeTheDeleted(String deleteMessage) {
        ReusableMethods.wait(1);
        Assert.assertEquals(setUpPage.citizenSuccessfullyDeletedMessage.getText(),deleteMessage);
    }

}