package com.thetestingacademy.ex01_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void test_Code(){
        Assert.assertEquals("pramod","Pramod");
    }

    @Test
    public void test_OpenVWOLoginPage(){
        // Open VWO.com, right?
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://ap.vwo.com");
        driver.quit();


    }


}
