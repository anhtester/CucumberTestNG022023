Feature: Add Brand

  Background: Login as Admin role
    Given user logged in as an admin

  @AddMultiBrand
  Scenario: Add new brand
    Given user on the brand page
    When user add a new brand with name "NewBrand01", meta tile "NewBrand01" and meta description "A new brand"
    Then the new category "NewBrand01" should be added successfully