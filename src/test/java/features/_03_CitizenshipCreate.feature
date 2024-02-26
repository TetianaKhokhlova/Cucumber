Feature:  Campus Citizenship Addition

  Scenario:  Adding a new citizenship
    Given Navigate to Campus
    When Enter username and password in the text boxes
    And Click on the Login button
    Then User should login successfully
    When I click the Setup button
    And I click  the Parameters button
    And I click the Citizenship button
    And  I click add the citizenship icon
#   And  I enter "name" in the name tex box
#  And I enter "short name" in the short name text box
    And I click on the save button
    Then I should see the "Citizenship successfully created" message
#    And I should see the message "Citizenship successfully created" message