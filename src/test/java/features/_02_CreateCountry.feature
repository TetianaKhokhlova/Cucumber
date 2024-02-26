Feature: Campus Citizenship Addition
  #  We can write the title of User story in the Feature
  # Generally each Scenario: means one Test Case
  Scenario: TC01 Adding a new citizenship successfully

    Given Navigate to Campus
    When Enter username and password in the text boxes
    And Click on the Login button
    Then User should login successfully
    When I click the Setup button
    And I click  the Parameters button
    And I click the Countries button
    And I click the add country icon
    And I enter "Tokat" as the country name
    And I enter "Tok123" as the country code
    And I click the save button
    Then I should see the message " Country successfully created"

Scenario: TC02  Adding an existing country
  Given Navigate to Campus
  When  Enter username and password in the text boxes
  And  Click on the Login button
  Then  User should login successfully
  When  I click the Setup button
  And  I click  the Parameters button
  And   I click the Countries button
  And   I click the add country icon
  And   I enter "usa" as the country name
  And   I enter "island123" as the country code
  And   I click the save button
  Then  I should see the message "usa" is created

