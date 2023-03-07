package com.anhtester.pages;

import org.openqa.selenium.By;

import static com.anhtester.keywords.WebUI.clickElement;
import static com.anhtester.keywords.WebUI.setText;

public class LoginPage {
    //Khai báo Objects
    private By inputEmail = By.xpath("//input[@id='email']");
    private By inputPassword = By.xpath("//input[@id='password']");
    private By buttonLogin = By.xpath("//button[normalize-space()='Login']");
    private By messageAlert = By.xpath("//div[@class='text-center alert alert-danger']");


    //Hàm xử lý đặc trưng cho Login Page
    public void enterEmailAndPassword(String email, String password) {
        setText(inputEmail, email);
        setText(inputPassword, password);
    }

    public void clickLoginButton() {
        clickElement(buttonLogin);
    }
}
