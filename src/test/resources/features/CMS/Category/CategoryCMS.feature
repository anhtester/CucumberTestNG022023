Feature: Add Category

   Background: Login as Admin role
      Given user logged in as an admin

   @AddCategory
   Scenario: Add a new category
      Given user on the category page
      When user click on the Add Category button
      And user enter the category information
      And user click on the Save button
      Then user should see a success message
      And the new category should be displayed on the category page

   @AddCategoryMultiple
   Scenario: Add multi category
      Given user on the category page
      When the user adds some categories below
         | category_name | order_number | meta_title | description |
         | Computer 1    | 1            | Computer 1 | Build PC    |
         | Computer 2    | 2            | Computer 2 | Build PC    |
      Then the new category should be displayed on the category page
         | category_name | order_number | meta_title | description |
         | Computer 1    | 1            | Computer 1 | Build PC    |
         | Computer 2    | 2            | Computer 2 | Build PC    |