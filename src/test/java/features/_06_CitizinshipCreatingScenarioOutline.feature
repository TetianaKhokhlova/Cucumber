Feature:

  Background:
    Given Navigate to Campus
    When Enter username and password in the text boxes
    And Click on the Login button
    Then User should login successfully

  Scenario Outline: TC01 Adding a new citizenship successfully
    When  I click the Setup button
    And I click  the Parameters button
    And I click the Citizenship button
    And   I click add the citizenship icon
    And   I enter citizen "<name>" in the name text box
    And   I enter citizen short name "<short_name>" in the shortname text box
    And   I click on the save button
    Then  I should see the successfully message "<message>"
    And   I enter "<name>" in the search citizen text box
    And   I click on the search citizen button
    And   I click on the delete citizen button
    And   I click on the confirm delete citizen button
    And   I should see the deleted "<deleted_message>"

    Examples:
      | name    | short_name | message                          |
      | Hxkug01 | t1qe01     | Citizenship successfully created |
      | Hxkug02 |  t1qe02     | Citizenship successfully created |
      | Hxkug03 |  t1qe03     | Citizenship successfully created |
      | Hxkug04 | t1qe04     | Citizenship successfully created |
      | Hxkug05 |  t1qe05     | Citizenship successfully created |

