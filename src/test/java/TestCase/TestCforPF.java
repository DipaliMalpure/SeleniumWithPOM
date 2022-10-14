package TestCase;

import Pages.Login_pageFactory;
import Pages.Login_pagepom;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCforPF {

    public static void main(String[] args) {

        public void first()
        {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            Login_pageFactory loginpg = new Login_pageFactory(driver);
            driver.get("https://www.saucedemo.com/");
            loginpg.enterUname("standard_user");
            loginpg.enterPasword("secret_sauce");
            loginpg.loginButton();
        }
    }
}
