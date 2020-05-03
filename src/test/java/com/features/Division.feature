Feature: Add, Edit and Delete Divisions

#  @AddDivision
#  Scenario: Adding a New Divisions in the Master Page
#    Given Navigating to C45PM URL
#    Then Entering the Username , Password and Click on Login Button
#    And Navigating to Divisions URL of C45PM
#    And Entering required details and Click on Save Changes Button
#
#  @DeleteDivision
#  Scenario: Editing a Division in the Master Page
#    Given Navigating to C45PM URL
#    Then Entering the Username , Password and Click on Login Button
#    And Navigating to Divisions URL of C45PM
#    And Click on Delete Icon and Click on Ok Button

  @Add_Edit_Delete_Division
    Scenario: Add,Edit and Delete Divisions
      Given Navigating to C45PM URL
      Then  Entering the Username , Password and Click on Login Button
      And Navigating to Divisions URL of C45PM
      And Entering required details in Division and Click on Save Changes Button
      And Edit on the record and click on Save Changes Button
      And Click on Delete Icon and Click on Ok Button
      Then Click on Logout Button
#      Examples:
#      |Username|Password|
#      |User 3  |User3@123|













