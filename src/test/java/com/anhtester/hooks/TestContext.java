package com.anhtester.hooks;

import com.anhtester.driver.DriverFactory;
import com.anhtester.driver.DriverManager;
import com.anhtester.pages.CategoryPage;
import com.anhtester.pages.CommonPage;
import com.anhtester.pages.LoginCMSPage;
import com.anhtester.pages.LoginCRMPage;
import com.anhtester.utils.LogUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;

public class TestContext {

    private WebDriver driver;
    private CommonPage commonPage;
    private LoginCRMPage loginCRMPage;
    private LoginCMSPage loginCMSPage;
    private CategoryPage categoryPage;

    public TestContext() {
        ThreadGuard.protect(new DriverFactory().createDriver());
        LogUtils.info("Driver in TestContext: " + getDriver());
    }

    public CommonPage getCommonPage() {
        if (commonPage == null) {
            commonPage = new CommonPage();
        }
        return commonPage;
    }

    public LoginCRMPage getLoginCRMPage() {
        if (loginCRMPage == null) {
            loginCRMPage = new LoginCRMPage();
        }
        return loginCRMPage;
    }

    public LoginCMSPage getLoginCMSPage() {
        if (loginCMSPage == null) {
            loginCMSPage = new LoginCMSPage();
        }
        return loginCMSPage;
    }

    public CategoryPage getCategoryPage() {
        if (categoryPage == null) {
            categoryPage = new CategoryPage();
        }
        return categoryPage;
    }

    public WebDriver getDriver() {
        return DriverManager.getDriver();
    }
}
