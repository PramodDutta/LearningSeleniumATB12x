package com.thetestingacademy.ex12_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab38_Windows_Part1 {


    @Test
    public void test_windows() {
        WebDriver driver = new ChromeDriver();
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);
        driver.manage().window().maximize();


        String parent_id = driver.getWindowHandle();
        System.out.println(parent_id);
        // 4FFC2A0C9574B28F85C40F81BE08BD3C
        WebElement link_parent = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        link_parent.click();


        // 2 Windows
        Set<String> windows_hanles_ids = driver.getWindowHandles();
        System.out.println(windows_hanles_ids);
        // [B5EB0617F31BB7BE267418D7B0E52944, 86880FB3BE2CE0B48E8E24F7CDCE8E41]


        // How do I switch to the child window and
        // verify that there is a text with the name of new window?
        for(String window: windows_hanles_ids){
            driver.switchTo().window(window);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test passed");
            }
        }
        driver.switchTo().window(parent_id);











    }

}
