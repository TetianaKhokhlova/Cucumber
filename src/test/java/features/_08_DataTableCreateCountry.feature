Feature: Create Country with DataTable
  
  Background:
    Given Navigate to Campus
    When  Enter username and password in the text boxes
    And   Click on the Login button
    Then  User should login successfully

  Scenario: Create a new country
    
    And  I click on the element in left navigation
    |setup           |
    |parameter        |
    |countries        |
    |addingCountryIcon|

    And I enter the name and code in the text box

    |countryNameTextBox| Berlinbc1|
    |countryCodeTextBox| Ber123|

    And I click the save button
    And I should see the message "Country successfully created"
    
    

    