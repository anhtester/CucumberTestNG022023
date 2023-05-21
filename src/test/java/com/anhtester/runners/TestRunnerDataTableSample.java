package com.anhtester.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/CMS/Login/DataTableGherkin.feature",
        glue = {"com.anhtester.stepdefinitions",
                "com.anhtester.common",
                "com.anhtester.hooks"
        },
        plugin = {
                "com.anhtester.hooks.CucumberListener",
                "pretty",
                "html:target/cucumber-reports/TestRunnerDataTableSample.html",
                "json:target/cucumber-reports/TestRunnerDataTableSample.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        tags = ""
)
@Test
public class TestRunnerDataTableSample extends AbstractTestNGCucumberTests {
    //Parallel Execution Scenario
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}