package com.anhtester.pages;

import com.anhtester.keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.anhtester.keywords.WebUI.setTextAndKey;

public class CommonPage {
    private By menuProducts = By.xpath("//span[normalize-space()='Products']");
    private By menuCategory = By.xpath("//span[normalize-space()='Category']");
    private By menuAddNewProduct = By.xpath("//span[normalize-space()='Add New Product']");
    private By menuAllProducts = By.xpath("//span[normalize-space()='All products']");

    private By messageNotify = By.xpath("//span[@data-notify='message']");

    private By buttonEdit = By.xpath("(//a[@title='Edit'])[1]");
    private By inputSearch = By.xpath("//input[@id='search']");
    public By avatarProfile = By.xpath("//span[contains(@class,'avatar avatar-sm')]");


    public void searchDataTable(String dataName) {
        setTextAndKey(inputSearch, dataName, Keys.ENTER);
    }

    public void clickEditButton() {
        WebUI.clickElement(buttonEdit);
    }

    public String getMessageNotify() {
        return WebUI.getElementText(messageNotify);
    }

    public void clickMenuProducts() {
        WebUI.clickElement(menuProducts);
    }

    public CategoryPage openCategoryPage() {
        WebUI.clickElement(menuCategory);

        return new CategoryPage();
    }

}
