package com.anhtester.helpers;

import net.datafaker.Faker;

import java.util.Locale;

public class DataFakerHelpers {

    private static Faker faker;

    public static Faker createFaker() {
        faker = new Faker(new Locale("en"));
        return faker;
    }

    public static Faker getFaker() {
        if (faker == null) {
            faker = createFaker();
        }
        return faker;
    }

    public static void setFaker(Faker faker) {
        DataFakerHelpers.faker = faker;
    }
}
