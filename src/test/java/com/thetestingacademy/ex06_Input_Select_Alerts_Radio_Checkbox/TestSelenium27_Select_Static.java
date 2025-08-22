package com.thetestingacademy.ex06_Input_Select_Alerts_Radio_Checkbox;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelenium27_Select_Static extends CommonToAll {
    @Test
    public void test_select(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();


        WebElement element_select = driver.findElement(By.id("dropdown"));
        Select select = new Select(element_select);

        //select.selectByIndex(1);
        select.selectByVisibleText("Option 2");

        closeBrowser(driver);

    }
}
