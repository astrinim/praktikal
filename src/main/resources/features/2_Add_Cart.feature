Feature: User Login

  Scenario: User Add to Cart
    Given User click button Addtocart1
    When User click button Addtocart2
    And User click icon cart
    Then User addtocart successful

  Scenario: User logout
    When User click sidebar
    And User click logout
    Then User logout succesfull