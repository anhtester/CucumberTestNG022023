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

    private By inputSearch = By.xpath("//input[@id='search']");

    public void clickAddNewButton() {
        clickElement(buttonAddNewCategory);
    }

    public void searchCategory(String categoryName) {
        setTextAndKey(inputSearch, categoryName, Keys.ENTER);
    }

    public void inputDataCategory() {
        setText(inputCategoryName, DataGenerateUtils.getProgrammingLanguage());
        setText(inputOrderingNumber, String.valueOf(DataGenerateUtils.getOrderNumber()));
        setText(inputMetaTitle, DataGenerateUtils.getProgrammingLanguage());
        setText(inputMetaDescription, DataGenerateUtils.getFunnyName());
    }

    public void clickSaveButton() {
        clickElement(buttonSave);
    }
}
