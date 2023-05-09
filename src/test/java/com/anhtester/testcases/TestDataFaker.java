package com.anhtester.testcases;

import com.anhtester.helpers.DataFakerHelpers;
import net.datafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class TestDataFaker {

    @Test
    public void testDataFaker01() {
        Faker faker = new Faker(new Locale("vi"));

        String computer = faker.computer().windows();
        String name = faker.name().fullName();
        String fullAddress = faker.address().fullAddress();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();

        System.out.println(computer);
        System.out.println(name);
        System.out.println(fullAddress);
        System.out.println(email);
        System.out.println(password);
    }

    @Test
    public void testDataFaker02() {
        String cityName1 = DataFakerHelpers.getFaker().address().cityName();
        String cityName2 = DataFakerHelpers.getFakerByLocate("vi").address().cityName();
        //String cityName1 = DataFakerHelpers.getFaker().address().cityName();
        System.out.println(cityName1);
        System.out.println(cityName2);
    }

}
