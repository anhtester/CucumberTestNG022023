package com.anhtester.testcases;

import com.anhtester.helpers.PropertiesHelper;
import com.anhtester.utils.Log;
import org.testng.annotations.Test;

public class TestHandle {
    @Test
    public void testReadPropertiesFile() {
        PropertiesHelper.loadAllFiles();
        System.out.println(PropertiesHelper.getValue("URL"));
    }

    @Test
    public void testLog4j2() {
        Log.info("Cucumber TestNG");
    }
}
