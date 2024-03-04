package stepdefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.SetUpPage;
import utilities.ReusableMethods;

import java.util.List;

public class _02_CreateCountryStep {

    SetUpPage setUpPage = new SetUpPage();

    @When("I click the Setup button")
    public void i_click_the_setup_button() {
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.setUpButton);
    }

    @When("I click  the Parameters button")
    public void i_click_the_parameters_button() {
        ReusableMethods.wait(1);
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.parametersButton);

    }

    @When("I click the Countries button")
    public void i_click_the_countries_button() {
        setUpPage.clickElement(setUpPage.countriesButton);

    }

    @When("I click the add country icon")
    public void i_click_the_add_country_icon() {
        setUpPage.clickElement(setUpPage.addCountryIcon);

    }

    @When("I enter {string} as the country name")
    public void i_enter_as_the_country_name(String countryName) {
        ReusableMethods.wait(1);
        setUpPage.sendKeys(setUpPage.countryNameTextBox, countryName);

    }

    @When("I enter {string} as the country code")
    public void i_enter_as_the_country_code(String countryCode) {
        ReusableMethods.wait(1);
        setUpPage.sendKeys(setUpPage.countryCodeTextBox, countryCode);

    }

    @When("I click the save button")
    public void i_click_the_save_button() {
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.saveCountryButton);

    }

    @Then("I should see the message {string}")
    public void i_should_see_the_message(String message) {
        ReusableMethods.wait(1);
        Assert.assertEquals(setUpPage.successCountrySavedMessage.getText(), message);
    }


    @Then("I should see the message {string} is created")
    public void i_should_see_the_message_is_created(String countryName) {

        ReusableMethods.wait(2);
        System.out.println(setUpPage.citizenExistMessage(countryName).getText());
        Assert.assertEquals
                (setUpPage.countryExistMessage(countryName).
                        getText(), "The Country with Name \"" + countryName + "\"already exists.");

    }

    @Then("I click on the element in left navigation")

    public void i_click_on_the_element_in_left_navigation(DataTable webelements) {
        List<String> buttonList = webelements.asList(String.class);
        for( int i = 0; i< buttonList.size(); i++){

            WebElement element = setUpPage.getWebElements(buttonList.get(i));
            ReusableMethods.wait(2);
            setUpPage.clickElement(element);

        }
    }

    @Then("I enter the name and code in the text box")
    public void i_enter_the_name_and_code_in_the_text_box(DataTable webelementsAndData) {

        List<List<String>> items = webelementsAndData.asLists(String.class);
        for(int i = 0; i< items.size();i++){
            WebElement element = setUpPage.getWebElements(items.get(i).get(0));
            String textData = items.get(i).get(1);
            setUpPage.sendKeys(element,textData);

        }



    }

}