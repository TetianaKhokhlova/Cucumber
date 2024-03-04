Feature:
  Background:
    Given Navigate to Campus
    When  Enter username and password in the text boxes
    And   Click on the Login button
    Then  User should login successfully

  Scenario Outline: Adding Fees
    And I click on the adding fees buttons
      | setup       |
      | parameter   |
      | fees        |
      | addFeesIcon |
    And I send the keys in text boxes
      | nameTextBoxFeesAdding     | <name>            |
      | codeTextBoxFeesAdding     | <code>            |
      | intergationCodeAddingFees | <intergationCode> |
      | priorityCodeAddingFees    | <priority>        |

    And  I click on the save&close and toggleBar button
    Then I should see the save fees "Fee Type successfully updated" message
    Examples:
      | name       | code | intergationCode | priority |
      | nameFee09 | 2v1  | Paypall         | 5912     |
      | nameFee10 | 2av2  | Paypalx         | 5616     |
      | nameFee11 | 2av3  | Paypaxll        | 1464     |
      | nameFee12 | 2av4  | Pxxaypall       | 50815    |
      | nameFee13 | 2av5  | Paypallxy       | 716452   |