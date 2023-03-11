package com.anhtester.stepdefinitions;

import com.anhtester.pages.CommonPage;
import com.anhtester.pages.LoginCMSPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsCategory {

    LoginCMSPage loginCMSPage;
    CommonPage commonPage;

    @Given("user logged in the CMS system with {string} role")
    public void userLoggedInTheCMSSystemWithRole(String arg0) {
        loginCMSPage = new LoginCMSPage();
        commonPage = loginCMSPage.loginAdminRole();
    }

    @Given("user has access to the Category page")
    public void userHasAccessToTheCategoryPage() {
        commonPage.clickMenuProducts();
        commonPage.openCategoriesPage();
    }

    @When("user has finished entering the category information")
    public void userHasFinishedEnteringTheCategoryInformation() {
    }

    @And("click the Save button")
    public void clickTheSaveButton() {
    }

    @Then("the message {string} successfully displays")
    public void theMessageSuccessfullyDisplays(String message) {
    }
}
