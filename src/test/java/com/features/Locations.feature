Feature: Add , Edit Locations through the Master

  @AddLocation
  Scenario: Adding Location
    Given Navigating to C45PM URL
    Then  Entering the Username , Password and Click on Login Button
    And Navigating to Location URL of C45PM
    And Entering required details in location and Click on Save Changes Button
    Then Click on Logout Button