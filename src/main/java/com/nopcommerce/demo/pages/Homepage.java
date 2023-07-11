package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Homepage extends Utility{
    By computers = By.xpath("\"https://demo.nopcommerce.com/computers\"");
    public void selectMenu(String menu) {
        //1.2 This method should click on the menu whatever name is passed as parameter.
        clickOnElement(By.linkText(menu));
    }
    public void verificationofUrl(){
        String actual =selectMenu(String menu);
        String expected= driver.getCurrentUrl();
    }

  /*  By loginLink = By.linkText("Log in");

    By registerLink = By.linkText("Register");

    public void clickOnLogInLink(){
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }*/

}