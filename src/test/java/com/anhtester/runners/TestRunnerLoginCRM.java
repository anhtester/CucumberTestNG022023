package com.anhtester.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/CRM/Login/LoginCRM.feature",
        glue = {
                "com.anhtester.stepdefinitions",
                "com.anhtester.common",
                "com.anhtester.hooks"
        },
        plugin = {"pretty",
                "html:target/cucumber-reports/TestRunnerLoginCRM.html",
                "json:target/cucumber-reports/TestRunnerLoginCRM.json"
        })

@Test
public class TestRunnerLoginCRM extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}