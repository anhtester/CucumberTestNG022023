package com.anhtester.pages;

import com.anhtester.utils.DataGenerateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.anhtester.keywords.WebUI.*;

public class CategoryPage {
    private By buttonAddNewCategory = By.xpath("//span[normalize-space()='Add New category']");
    private By inputCategoryName = By.xpath("//input[@id='name']");
    private By inputOrderingNumber = By.xpath("//input[@id='order_level']");
    private By inputMetaTitle = By.xpath("//input[@placeholder='Meta Title']");
    private By inputMetaDescription = By.xpath("//textarea[@name='meta_description']");
    private By buttonSave = By.xpath("//button[normalize-space()='Save']");
    private By messageAlert = By.xpath("//span[@data-notify='message']");

    private By inputSearch = By.xpath("//input[@id='search']");
    private By categoryNameFirstRow = By.xpath("//tbody/tr[1]/td[2]");


    public void clickAddNewButton() {
        clickElement(buttonAddNewCategory);
    }

    public void searchCategory(String categoryName) {
        waitForPageLoaded();
        setTextAndKey(inputSearch, categoryName, Keys.ENTER);
    }

    public void checkCategoryDisplayed(String categoryName) {
        searchCategory(categoryName);
        verifyElementVisible(categoryNameFirstRow, "The new category not found.");
        verifyEquals(getElementText(categoryNameFirstRow), categoryName, "The new category name not match.");
    }

    public void inputDataCategory(String categoryName, String orderNumber, String metaTitle, String description) {
        waitForPageLoaded();
        setText(inputCategoryName, categoryName);
        setText(inputOrderingNumber, orderNumber);
        setText(inputMetaTitle, metaTitle);
        setText(inputMetaDescription, description);
    }

    public void clickSaveButton() {
        clickElement(buttonSave);
    }

    public void verifyAlertSuccessDisplayed() {
        verifyElementVisible(messageAlert, "The alert message success not visible.");
    }
}
