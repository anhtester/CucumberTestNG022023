package com.anhtester.common;

import io.cucumber.java.en.And;

public class CommonStepDefinitions {

    @And("I should see the notification displays")
    public void iShouldSeeTheNotificationDisplays() {
        BaseTest.closeDriver();
    }

}
