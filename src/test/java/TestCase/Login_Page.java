package TestCase;

import Pages.Login_pagepom;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        Login_pagepom loginpg=new Login_pagepom(driver);
        driver.get("https://www.saucedemo.com/");
        loginpg.enterUname("standard_user");
        loginpg.enterPasword("secret_sauce");
        loginpg.loginButton();
    }
}
