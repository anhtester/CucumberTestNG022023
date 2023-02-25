package com.anhtester.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsLoginCMS {
    @Given("user navigate to Login page {string}")
    public void userNavigateToLoginPage(String arg0) {

    }

    @When("user enter email {string} and password {string}")
    public void userEnterEmailAndPassword(String arg0, String arg1) {
    }

    @And("click login button")
    public void clickLoginButton() {
    }

    @Then("user redirect to admin page {string}")
    public void userRedirectToAdminPage(String arg0) {
    }
}
