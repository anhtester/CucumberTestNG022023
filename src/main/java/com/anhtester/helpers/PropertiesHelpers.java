package com.anhtester.helpers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Properties;

public class PropertiesHelpers {

    private static Properties properties;
    private static String linkFile;
    private static FileInputStream file;
    private static FileOutputStream out;
    private static String relPropertiesFilePathDefault = "src/test/resources/configs.properties";

    public static Properties loadAllFiles() {
        LinkedList<String> files = new LinkedList<>();

        // Add tất cả file Properties vào đây theo mẫu
        files.add("src/test/resources/configs.properties");

        try {
            properties = new Properties();

            for (String f : files) {
                Properties tempProp = new Properties();
                linkFile = SystemsHelpers.getCurrentDir() + f;
                file = new FileInputStream(linkFile);
                tempProp.load(file);
                properties.putAll(tempProp);
            }
            System.out.println("Load all file properties successfully.");
            return properties;
        } catch (IOException ioe) {
            System.out.println("Không load được properties file. Khởi tạo Properties Null.");
            return new Properties();
        }
    }

    public static void setFile(String relPropertiesFilePath) {
        properties = new Properties();
        try {
            linkFile = SystemsHelpers.getCurrentDir() + relPropertiesFilePath;
            file = new FileInputStream(linkFile);
            properties.load(file);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setDefaultFile() {
        properties = new Properties();
        try {
            linkFile = SystemsHelpers.getCurrentDir() + relPropertiesFilePathDefault;

            file = new FileInputStream(linkFile);
            properties.load(file);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String key) {
        String value = null;
        try {
            if (file == null) {
                properties = new Properties();
                linkFile = SystemsHelpers.getCurrentDir() + relPropertiesFilePathDefault;
                file = new FileInputStream(linkFile);
                properties.load(file);
                file.close();
            }
            // Lấy giá trị từ file đã Set
            value = properties.getProperty(key);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return value;
    }

    public static void setValue(String key, String value) {
        try {
            if (file == null) {
                properties = new Properties();
                file = new FileInputStream(SystemsHelpers.getCurrentDir() + relPropertiesFilePathDefault);
                properties.load(file);
                file.close();
                out = new FileOutputStream(SystemsHelpers.getCurrentDir() + relPropertiesFilePathDefault);
            }
            //Ghi vào cùng file Prop với file lấy ra
            out = new FileOutputStream(linkFile);
            System.out.println(linkFile);
            properties.setProperty(key, value);
            properties.store(out, null);
            out.close();
            System.out.println("Set " + key + " = " + value + " to properties file successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
