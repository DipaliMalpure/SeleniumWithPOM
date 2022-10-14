package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_pagepom {
    WebDriver driver;

    public Login_pagepom(WebDriver driver) {

        this.driver = driver;
    }
    By usename=By.id("user-name");
    By pwd=By.id("password");
    By login=By.id("login-button");
    public void enterUname(String user)
    {
        driver.findElement(usename).sendKeys(user);

    }
    public void enterPasword(String passwrd)
    {
        driver.findElement(pwd).sendKeys(passwrd);

    }
    public void loginButton()
    {
        driver.findElement(login).click();

    }



}
