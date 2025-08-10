package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium08_Maximize_Minimize {
    @Test
    public void test_1(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
//        driver.manage().window().maximize();
//        driver.manage().window().minimize();

        driver.quit();




    }
}
