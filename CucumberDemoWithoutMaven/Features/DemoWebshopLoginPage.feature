Feature: DemoWebshop Login Functionality

@loginCheck
  Scenario: Validate the Login fuctionality of DemoWebshop
    Given User launch DemoWebshop page
    When User entered credentials
    And User click Login button
    Then User verified Login page