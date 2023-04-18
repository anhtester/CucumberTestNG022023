package com.anhtester.stepdefinitions;

import com.anhtester.helpers.ExcelHelpers;
import com.anhtester.hooks.TestContext;
import com.anhtester.pages.CategoryPage;
import com.anhtester.pages.CommonPage;
import com.anhtester.pages.LoginCMSPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsCategoryCMS {

    LoginCMSPage loginCMSPage;
    CategoryPage categoryPage;
    CommonPage commonPage;
    ExcelHelpers excelHelpers;

    public StepsCategoryCMS(TestContext testContext) {
        loginCMSPage = testContext.getLoginCMSPage();
        categoryPage = testContext.getCategoryPage();
        commonPage = testContext.getCommonPage();
    }

    @Given("user on the category page")
    public void userOnTheCategoryPage() {
        commonPage.clickMenuProducts();
        commonPage.openCategoryPage();
    }

    @When("user click on the Add Category button")
    public void userClickOnTheAddCategoryButton() {
        categoryPage.clickAddNewButton();
    }

    @And("user enter the category information")
    public void userEnterTheCategoryInformation() {
        excelHelpers = new ExcelHelpers();
        excelHelpers.setExcelFile("src/test/resources/datatest/CMS.xlsx", "Category");
        categoryPage.inputDataCategory(
                excelHelpers.getCellData("category_name", 1),
                excelHelpers.getCellData("order_number", 1),
                excelHelpers.getCellData("meta_title", 1),
                excelHelpers.getCellData("description", 1)
        );
    }

    @And("user click on the Save button")
    public void userClickOnTheSaveButton() {
        categoryPage.clickSaveButton();
    }

    @Then("user should see a success message")
    public void userShouldSeeASuccessMessage() {
        categoryPage.verifyAlertSuccessDisplayed();
    }

    @And("the new category should be displayed on the category page")
    public void theNewCategoryShouldBeDisplayedOnTheCategoryPage() {
        excelHelpers = new ExcelHelpers();
        excelHelpers.setExcelFile("src/test/resources/datatest/CMS.xlsx", "Category");
        categoryPage.checkCategoryDisplayed(excelHelpers.getCellData("category_name", 1));
    }

    @When("the user adds some categories below")
    public void theUserAddsSomeCategoriesBelow(DataTable dataTable) {
    }
}
