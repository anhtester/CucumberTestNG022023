package com.anhtester.pages;

import com.anhtester.keywords.WebUI;
import org.openqa.selenium.By;

public class CommonPage {
    private By menuProducts = By.xpath("//span[normalize-space()='Products']");
    private By menuCategory = By.xpath("//span[normalize-space()='Category']");
    private By menuAddNewProduct = By.xpath("//span[normalize-space()='Add New Product']");
    private By menuAllProducts = By.xpath("//span[normalize-space()='All products']");

    public void clickMenuProducts() {
        WebUI.clickElement(menuProducts);
    }

    public CategoriesPage openCategoriesPage() {
        WebUI.clickElement(menuCategory);

        return new CategoriesPage();
    }
    
}
