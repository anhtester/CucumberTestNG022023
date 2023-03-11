package com.anhtester.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/Login/LoginCRM.feature",
        glue = {
                "com.anhtester.stepdefinitions",
                "com.anhtester.common",
                "com.anhtester.hooks"
        },
        plugin = {"pretty", "html:target/cucumber-html-report.html"})

@Test
public class TestRunnerLoginCRM extends AbstractTestNGCucumberTests {

}