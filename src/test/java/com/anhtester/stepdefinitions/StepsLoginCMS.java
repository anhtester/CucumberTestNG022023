package com.anhtester.stepdefinitions;

import com.anhtester.common.BaseTest;
import com.anhtester.driver.DriverManager;
import com.anhtester.keywords.WebUI;
import com.anhtester.pages.LoginCMSPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsLoginCMS {

    LoginCMSPage loginCMSPage;

    @Given("user navigate to Login page {string}")
    public void userNavigateToLoginPage(String URL) {
        BaseTest.createDriver();
        WebUI.openURL(URL);
    }

    @When("user enter email {string} and password {string}")
    public void userEnterEmailAndPassword(String email, String password) {
        loginCMSPage = new LoginCMSPage();
        loginCMSPage.enterEmailAndPassword(email, password);
    }

    @And("click login button")
    public void clickLoginButton() {
        loginCMSPage.clickLoginButton();
    }

    @Then("user redirect to admin page {string}")
    public void userRedirectToAdminPage(String url) {
        WebUI.verifyEquals(url, DriverManager.getDriver().getCurrentUrl(), "URL chuyển hướng không đúng.");
    }

}
