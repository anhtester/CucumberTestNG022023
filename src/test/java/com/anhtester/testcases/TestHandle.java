package com.anhtester.testcases;

import com.anhtester.common.BaseTest;
import com.anhtester.helpers.ExcelHelpers;
import com.anhtester.helpers.PropertiesHelpers;
import com.anhtester.utils.LogUtils;
import org.testng.annotations.Test;

public class TestHandle extends BaseTest {
    @Test
    public void testReadPropertiesFile() {
        PropertiesHelpers.loadAllFiles();
        System.out.println(PropertiesHelpers.getValue("BROWSER"));
    }

    @Test
    public void testReadExcelData() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        excelHelpers.setExcelFile("src/test/resources/datatest/CRM.xlsx", "Login");
        System.out.println(excelHelpers.getCellData("EMAIL", 1));
        System.out.println(excelHelpers.getCellData("PASSWORD", 1));
    }

    @Test
    public void testLog4j2() {
        LogUtils.info("Cucumber TestNG");
    }

}
