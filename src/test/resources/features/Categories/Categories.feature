Feature: Manage Category

   Background:
      Given user logged in the CMS system with "Admin" role

   Scenario: Add new Category
      Given user has access to the Category page
      When user has finished entering the category information
      And click the Save button
      Then the message "Category has been inserted successfully" displays

   Scenario: Update the Category existing
      Given user has access to the Category page
      When user search a category existing "Art Major"
      And user edit the category information
      And click the Save button
      Then the message "Category has been updated successfully" displays