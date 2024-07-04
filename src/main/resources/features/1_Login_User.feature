Feature: User Login

  Scenario: User Login Valid
    Given User enter URL web Sauce
    When User input valid username
    And User input valid password
    And User click login button
    Then User login successful