Feature: Handle DataTable

   Scenario: DataTable sample
      Given user on the login page
      When user enter valid credentials to login
         | username          | password |
         | user@example.com  | 123      |
         | admin@example.com | 123456   |
      Then user should be redirected to the admin page