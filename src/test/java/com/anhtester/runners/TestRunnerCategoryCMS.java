package com.anhtester.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/Categories",
        glue = {"com.anhtester.stepdefinitions",
                "com.anhtester.common"
        },
        plugin = {"pretty", "html:target/cucumber-html-report.html"},
        tags = ""
)
@Test
public class TestRunnerCategoryCMS extends AbstractTestNGCucumberTests {

}