package com.anhtester.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/CMS/Category/CategoryCMS.feature",
        glue = {"com.anhtester.stepdefinitions",
                "com.anhtester.common",
                "com.anhtester.hooks"
        },
        plugin = {
                "com.anhtester.hooks.CucumberListener",
                "pretty",
                "html:target/cucumber-reports/TestRunnerCategoryCMS.html",
                "json:target/cucumber-reports/TestRunnerCategoryCMS.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        tags = "@AddCategory"
)
@Test
public class TestRunnerCategoryCMS extends AbstractTestNGCucumberTests {
    //Parallel Execution Scenario
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}