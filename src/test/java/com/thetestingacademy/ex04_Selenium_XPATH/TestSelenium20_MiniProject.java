package com.thetestingacademy.ex04_Selenium_XPATH;
import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium20_MiniProject extends CommonToAll {

    @Owner("Pramod")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify login is working")
    @Test
    public void test_OHRM_login() throws InterruptedException {

        WebDriver driver =  new ChromeDriver();
        openBrowser(driver,"https://awesomeqa.com/hr/web/index.php/auth/login");
        //```
        ////input[@name="username"]
        ////input[@placeholder="Username"]
        //```
        //```
        ////input[@placeholder="Password"]
        //```
        //
        //
        //```
        ////button[normalize-space()="Login"]
        //```

        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));

        input_username.sendKeys("admin");
        input_password.sendKeys("Hacker@4321");
        button.click();

        Thread.sleep(3000);

        WebElement h6 = driver.findElement(By.xpath("//h6[text()=\"PIM\"]"));
        Assert.assertEquals(h6.getText(),"PIM");

        closeBrowser(driver);













    }
}
