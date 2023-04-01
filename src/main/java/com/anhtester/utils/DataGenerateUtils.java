package com.anhtester.utils;

import org.testng.annotations.Test;

import static com.anhtester.helpers.DataFakerHelpers.getFaker;

public class DataGenerateUtils {

    @Test
    public void testData() {
        System.out.println(getProgrammingLanguage());
    }

    public static String getProgrammingLanguage() {
        return getFaker().programmingLanguage().name();
    }

    public static String getFullName() {
        return getFaker().name().fullName();
    }

    public static String getAddress() {
        return getFaker().address().fullAddress();
    }

    public static String getPhoneNumber() {
        return getFaker().phoneNumber().phoneNumberNational();
    }

    public static long getRandomNumber() {
        return getFaker().number().randomNumber();
    }

    public static int getNumberPositive() {
        return getFaker().number().positive();
    }

    public static int getNumberNegative() {
        return getFaker().number().negative();
    }

    public static int getOrderNumber() {
        return getFaker().number().numberBetween(0, 100);
    }

    public static String getFunnyName() {
        return getFaker().funnyName().name();
    }

    public static String getCompanyName() {
        return getFaker().company().name();
    }
}
