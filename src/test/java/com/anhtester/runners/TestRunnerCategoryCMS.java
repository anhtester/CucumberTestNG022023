package com.anhtester.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/Categories",
        glue = {"com.anhtester.stepdefinitions",
                "com.anhtester.common",
                "com.anhtester.hooks"
        },
        plugin = {"pretty", "html:target/cucumber-html-report.html"},
        tags = ""
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