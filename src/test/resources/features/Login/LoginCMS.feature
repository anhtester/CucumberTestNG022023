Feature: Login CMS

   @success
   Scenario: Login success
      Given user navigate to Login page "https://cms.anhtester.com/admin"
      When user enter email "admin@example.com" and password "123456"
      And click login button
      Then user redirect to admin page "https://cms.anhtester.com/admin"
      And user should see the notification displays