package com.thetestingacademy.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium18_LinkText_Partial_Text_TagName_Locators {

    @Description("Verify vwo")
    @Test
    public void test_login_vwo() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");

        // <a
        // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link"
        // data-qa="bericafeqo">
        // Start a free trial
        //
        //</a>


       //      // Link Text - Full Text Match
//        WebElement a_Tag_free_trail_full_match = driver.findElement(By.linkText("Start a free trial"));
//        a_Tag_free_trail_full_match.click();
////        // If the element locator is invalid - no such element: Unable to locate element: {"method":"link text","selector":"Start a free tria"}
//
//

        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
        // Start a free trial
        // Start a free
        // Start a
        // Start , Trail, free, a, Star...
        a_tag_partial_match.click();



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();





    }


}
