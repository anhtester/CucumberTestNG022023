package com.anhtester.stepdefinitions;

import com.anhtester.common.BaseTest;
import com.anhtester.driver.DriverManager;
import com.anhtester.helpers.ExcelHelpers;
import com.anhtester.hooks.TestContext;
import com.anhtester.keywords.WebUI;
import com.anhtester.pages.CommonPage;
import com.anhtester.pages.LoginCMSPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsLoginCMS extends CommonPage {

    LoginCMSPage loginCMSPage;
    ExcelHelpers excelHelpers;

    public StepsLoginCMS(TestContext testContext){
        loginCMSPage = testContext.getLoginCMSPage();
    }

    @Given("user navigate to Login page {string}")
    public void userNavigateToLoginPage(String URL) {
        BaseTest.createDriver();
        WebUI.openURL(URL);
    }

    @When("user enter email {string} and password {string}")
    public void userEnterEmailAndPassword(String email, String password) {
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

    @Given("user on the login page")
    public void userOnTheLoginPage() {
        loginCMSPage.goToLoginPage();
    }

    @When("user enter valid username and password")
    public void userEnterValidUsernameAndPassword() {
        excelHelpers = new ExcelHelpers();
        excelHelpers.setExcelFile("src/test/resources/datatest/CMS.xlsx", "Login");
        loginCMSPage.enterEmailAndPassword(excelHelpers.getCellData("email", 1), excelHelpers.getCellData("password", 1));
    }

    @And("click on the login button")
    public void clickOnTheLoginButton() {
        loginCMSPage.clickLoginButton();
    }

    @Then("user should be redirected to the admin page")
    public void userShouldBeRedirectedToTheAdminPage() {
        loginCMSPage.verifyRedirectToAdminPage();
    }

    @When("user enter an invalid username or password")
    public void userEnterAnInvalidUsernameOrPassword() {
        excelHelpers = new ExcelHelpers();
        excelHelpers.setExcelFile("src/test/resources/datatest/CMS.xlsx", "Login");
        loginCMSPage.enterEmailAndPassword(excelHelpers.getCellData("email", 2), excelHelpers.getCellData("password", 2));
    }

    @Then("user should see an error message")
    public void userShouldSeeAnErrorMessage() {

    }

    @And("stay on the login page")
    public void stayOnTheLoginPage() {
    }

    @When("user leave the username field empty")
    public void userLeaveTheUsernameFieldEmpty() {
    }

    @And("enter a valid password")
    public void enterAValidPassword() {
    }

    @When("user leave the password field empty")
    public void userLeaveThePasswordFieldEmpty() {
    }

    @And("enter a valid username")
    public void enterAValidUsername() {
    }

    @And("my account has been locked")
    public void myAccountHasBeenLocked() {
    }

    @And("user have forgotten my password")
    public void userHaveForgottenMyPassword() {
    }

    @When("user click on the {string} link")
    public void userClickOnTheLink(String arg0) {
    }

    @And("enter my email address")
    public void enterMyEmailAddress() {
    }

    @And("click on the {string} button")
    public void clickOnTheButton(String arg0) {
    }

    @Then("user should receive an email with instructions to reset my password.")
    public void userShouldReceiveAnEmailWithInstructionsToResetMyPassword() {
    }
}
