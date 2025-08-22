package com.thetestingacademy.ex06_Input_Select_Alerts_Radio_Checkbox;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium26_Input_Checkbox_Radio extends CommonToAll {

    @Description("This is description")
    @Test
    public void test_HTMLTags() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        // Input
//        WebElement firstname = driver.findElement(By.name("firstname"));
        WebElement firstname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        firstname.sendKeys("the testing academy");

        // RADIO Box
        WebElement radiobox = driver.findElement(By.id("sex-1"));
        radiobox.click();


        // CheckBox
        driver.findElement(By.id("tool-1")).click();




        closeBrowser(driver);


    }


}
