package com.anhtester.common;

import com.anhtester.hooks.TestContext;
import com.anhtester.pages.CategoryPage;
import com.anhtester.pages.CommonPage;
import com.anhtester.pages.LoginCMSPage;
import com.anhtester.pages.LoginCRMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CommonStepDefinitions {

    TestContext testContext;
    LoginCRMPage loginCRMPage;
    LoginCMSPage loginCMSPage;
    CategoryPage categoryPage;
    CommonPage commonPage;

    public CommonStepDefinitions(TestContext testContext) {
        this.testContext = testContext;
        commonPage = testContext.getCommonPage();
        loginCMSPage = testContext.getLoginCMSPage();
        loginCRMPage = testContext.getLoginCRMPage();
    }

    @Given("user logged in as an admin")
    public void userLoggedInAsAnAdmin() {
        loginCMSPage.loginAdminRole();
    }

    @Given("user logged in the CMS system with {string} role")
    public void userLoggedInTheCMSSystemWithRole(String roleName) {
        loginCMSPage.loginAdminRole();
    }

    @Then("the message {string} displays")
    public void theMessageDisplays(String message) {
        Assert.assertEquals(commonPage.getMessageNotify(), message, "Message not match.");
    }

    @And("user should see the notification displays")
    public void userShouldSeeTheNotificationDisplays() {

    }

    @Given("user logged in the CRM system with {string} role")
    public void userLoggedInTheCRMSystemWithRole(String roleName) {
        loginCRMPage.loginAdminRole();
    }
}
