package com.anhtester.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/CMS/Login/LoginCMS.feature",
        glue = {"com.anhtester.stepdefinitions",
                "com.anhtester.common",
                "com.anhtester.hooks"
        },
        plugin = {
                "pretty",
                "html:target/cucumber-reports/LoginCMS.html",
                "json:target/cucumber-reports/LoginCMS.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        tags = "@InvalidLoginMultiple"
)
@Test
public class TestRunnerLoginCMS extends AbstractTestNGCucumberTests {
    //Parallel Execution Scenario
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}