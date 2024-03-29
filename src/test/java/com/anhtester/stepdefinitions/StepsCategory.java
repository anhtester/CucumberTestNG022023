package com.anhtester.stepdefinitions;

import com.anhtester.helpers.ExcelHelpers;
import com.anhtester.hooks.TestContext;
import com.anhtester.pages.CategoryPage;
import com.anhtester.pages.CommonPage;
import com.anhtester.pages.LoginCMSPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepsCategory {

    TestContext testContext;
    LoginCMSPage loginCMSPage;
    CategoryPage categoryPage;
    CommonPage commonPage;
    ExcelHelpers excelHelpers;

    public StepsCategory(TestContext testContext) {
        this.testContext = testContext;
        commonPage = testContext.getCommonPage();
        loginCMSPage = testContext.getLoginCMSPage();
    }

    @Given("user has access to the Category page")
    public void userHasAccessToTheCategoryPage() {
        commonPage.clickMenuProducts();
        categoryPage = commonPage.openCategoryPage();
    }

    @When("user has finished entering the category information")
    public void userHasFinishedEnteringTheCategoryInformation() {
        categoryPage.clickAddNewButton();
        excelHelpers = new ExcelHelpers();
        excelHelpers.setExcelFile("src/test/resources/datatest/CMS.xlsx", "Category");
        categoryPage.inputDataCategory(
                excelHelpers.getCellData("category_name", 1),
                excelHelpers.getCellData("order_number", 1),
                excelHelpers.getCellData("meta_title", 1),
                excelHelpers.getCellData("description", 1)
        );
    }

    @And("click the Save button")
    public void clickTheSaveButton() {
        categoryPage.clickSaveButton();
    }

    @When("user search a category existing {string}")
    public void userSearchACategoryExisting(String categoryName) {
        categoryPage.searchCategory(categoryName);
    }

    @And("user edit the category information")
    public void userEditTheCategoryInformation() {
        commonPage.clickEditButton();
        excelHelpers = new ExcelHelpers();
        excelHelpers.setExcelFile("src/test/resources/datatest/CMS.xlsx", "Category");
        categoryPage.inputDataCategory(
                excelHelpers.getCellData("category_name", 1),
                excelHelpers.getCellData("order_number", 1),
                excelHelpers.getCellData("meta_title", 1),
                excelHelpers.getCellData("description", 1)
        );
    }
}
