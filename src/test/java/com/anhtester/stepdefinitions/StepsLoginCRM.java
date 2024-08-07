package com.anhtester.stepdefinitions;

import com.anhtester.constants.ConstantGlobal;
import com.anhtester.helpers.CaptureHelpers;
import com.anhtester.hooks.TestContext;
import com.anhtester.keywords.WebUI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class StepsLoginCRM {

    public StepsLoginCRM(TestContext testContext) {

    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        //BaseTest.createDriver("edge");
        WebUI.openURL(ConstantGlobal.URL_CRM);
    }

    @When("I enter my username and password")
    public void iEnterMyUsernameAndPassword() {
        WebUI.setText(By.xpath("//input[@id='email']"), ConstantGlobal.USERNAME);
        WebUI.setText(By.xpath("//input[@id='password']"), ConstantGlobal.PASSWORD);

    }

    @And("I click the Login button")
    public void iClickTheLoginButton() {
        WebUI.clickElement(By.xpath("//button[normalize-space()='Login']"));
    }

    @Then("I should be taken to the dashboard page")
    public void iShouldBeTakenToTheDashboardPage() {
        CaptureHelpers.takeScreenshot("Dashboard page screenshot");
    }

    @And("The message success displays")
    public void theMessageSuccessDisplays() {
    }

    @And("I should see the {string} menu")
    public void iShouldSeeTheMenu(String arg0) {
        Assert.assertEquals(arg0, "Customers", "Menu không đúng.");
    }

}
