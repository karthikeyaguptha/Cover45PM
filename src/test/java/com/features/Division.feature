Feature: Add, Edit and Delete Divisions

  @AddDivision
  Scenario: Adding a New Divisions in the Master Page
    Given Navigating to C45PM URL
    Then Entering the Username , Password and Click on Login Button
    And Navigating to Divisions URL of C45PM
    And Entering required details and Click on Save Changes Button

  @DeleteDivision
  Scenario: Editing a Division in the Master Page
    Given Navigating to C45PM URL
    Then Entering the Username , Password and Click on Login Button
    And Navigating to Divisions URL of C45PM
    And Click on Delete Icon and Click on Ok Button









