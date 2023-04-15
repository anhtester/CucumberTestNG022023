Feature: Add Category

   Background: Login as Admin role
      Given user logged in as an admin

   Scenario: Add a new category
      Given user on the category page
      When user click on the Add Category button
      And user enter the category information
      And user click on the Save button
      Then user should see a success message
      And the new category should be displayed on the category page

#   Scenario: Add a new category with existing name
##      Given I am logged in as an admin
#      And I am on the category page
#      When I click on the "Add Category" button
#      And I enter "Electronics" as the category name
#      And I click on the "Save" button
#      Then I should see an error message
#      And the "Electronics" category should not be added to the category list
#
#   Scenario: Add a new category without entering a name
##      Given I am logged in as an admin
#      And I am on the category page
#      When I click on the "Add Category" button
#      And I leave the category name field empty
#      And I click on the "Save" button
#      Then I should see an error message
#      And no new category should be added to the category list